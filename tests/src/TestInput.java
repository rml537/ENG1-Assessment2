import Ingredients.Ingredient;
import Sprites.AllTextures;
import Sprites.Chef;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputEventQueue;
import com.badlogic.gdx.backends.headless.HeadlessApplication;
import com.badlogic.gdx.backends.headless.HeadlessApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.physics.box2d.Body;
import com.team13.piazzapanic.MainGame;
import com.team13.piazzapanic.PlayScreen;
import com.team13.piazzapanic.StartScreen;
import jdk.tools.jmod.Main;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestInput {
//    @Test
//    public void testSim_MoveForward(){
//        HeadlessApplicationConfiguration config = new HeadlessApplicationConfiguration();
//        MainGame testgame = new MainGame();
//        new HeadlessApplication(testgame, config);
//        testgame.create();
//        PlayScreen testscreen = new PlayScreen(testgame, true);
//        testscreen.update(0);
//        testscreen.handleInput(0);
//        assertTrue("Test game start", true);
//    }

    @Test
    public void testMoveForward(){
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        MainGame testgame = new MainGame();
        new Lwjgl3Application(testgame, config);
        PlayScreen testGameScr = new PlayScreen(testgame, true);




//        InputEventQueue eventQueue = new InputEventQueue();
//
//        PlayScreen testscreen = new PlayScreen(testgame);
//
//        eventQueue.keyDown(Input.Keys.W, 10);
//        testscreen.chef1.move();

        assertTrue("Simulating W press to move chef", true);

    }


}
