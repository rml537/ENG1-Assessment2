package com.team13.piazzapanic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import com.badlogic.gdx.Game;

public class MainGame extends Game {

	/**
	 * MainGame class is the central class of the game that creates and manages the two screens, PlayScreen and StartScreen.
	 *
	 * Class Members:
	 *     V_WIDTH (int): Width of the view.
	 *     V_HEIGHT (int): Height of the view.
	 *     TILE_SIZE (int): Size of the tile.
	 *     PPM (float): Pixels per meter.
	 *     batch (SpriteBatch): Instance of SpriteBatch.
	 *     isPlayScreen (bool): Flag indicating whether the PlayScreen is displayed or not.
	 *     playScreen (PlayScreen): Instance of PlayScreen.
	 *     startScreen (StartScreen): Instance of StartScreen.
	 *
	 * Methods:
	 *     __init__: Initializes the MainGame class.
	 *     create: Creates the instances of StartScreen and PlayScreen and initializes the SpriteBatch instance.
	 *     render: Renders the StartScreen or PlayScreen based on the value of isPlayScreen flag.
	 * 	   dispose: Releases resources used by the MainGame class.
	 */
	public static final int V_WIDTH = 184;
	public static final int V_HEIGHT = 184;
	public static final int TILE_SIZE = 16;

	public static final float PPM = 100;
	public SpriteBatch batch;
	public boolean isPlayScreen;
	private PlayScreen playScreen;
	private StartScreen startScreen;
	private EndScreen endScreen;

	public MainGame(){
		isPlayScreen = false;
	}
	@Override
	public void create() {
		batch = new SpriteBatch();
		startScreen = new StartScreen(this);
		playScreen = new PlayScreen(this);
		endScreen = new EndScreen(this);
	}

	@Override
	public void render() {
		super.render();
		if (Gdx.input.isKeyJustPressed(Input.Keys.TAB)){
			isPlayScreen = !isPlayScreen;
		}
		if ((isPlayScreen || startScreen.start == true)&& PlayScreen.reputation != 0) {
			setScreen(playScreen);
			playScreen.difficulty = startScreen.difficulty;
			PlayScreen.endless = startScreen.endless;
			
		}else if (PlayScreen.reputation == 0){
			setScreen(endScreen);
		}
		

		 else {
			setScreen(startScreen);
		}
		
		if (EndScreen.restart == true){
			isPlayScreen = !isPlayScreen;
			EndScreen.restart = false;
			startScreen.start = false;
			playScreen = new PlayScreen(this);
			PlayScreen.reputation = 2;
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		batch.dispose();
	}
}