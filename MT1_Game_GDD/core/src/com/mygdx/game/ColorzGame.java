package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.States.CreditsState;
import com.mygdx.game.States.GameStatemanager;
import com.mygdx.game.States.Menu;

public class ColorzGame extends ApplicationAdapter {

	public static final int WIDTH = 1080;
	public static final int HEIGHT = 1920;

	public static final String TITLE = "ColorZ";
	private GameStatemanager gsm;
	private SpriteBatch batch;
	
	@Override
	public void create ()
	{
		batch = new SpriteBatch();
		gsm = new GameStatemanager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new Menu(gsm));
	}

	@Override
	public void render ()
	{
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
