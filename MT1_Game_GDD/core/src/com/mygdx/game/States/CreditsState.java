package com.mygdx.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by SuryaVamsiKK on 3/25/2018.
 */

public class CreditsState extends State {

    private Texture bG;

    public CreditsState(GameStatemanager gsm) {
        super(gsm);
        bG = new Texture("Black.jpg");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(bG, 0, 0, 1080, 1920);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
