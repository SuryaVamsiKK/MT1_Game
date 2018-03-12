package com.mygdx.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by SuryaVamsiKK on 3/12/2018.
 */

public class GameStatemanager {

    private Stack<State> states;

    public GameStatemanager()
    {
        states = new Stack<State>();
    }

    public void push(State state)
    {
        states.push(state);
    }

    public void pop()
    {
        states.pop();
    }

    public void set(State state)
    {
        states.pop();
        states.push(state);
    }

    public void update(float dt)
    {
        states.peek().update(dt);
    }

    public  void render(SpriteBatch sb)
    {
        states.peek().render(sb);
    }
}
