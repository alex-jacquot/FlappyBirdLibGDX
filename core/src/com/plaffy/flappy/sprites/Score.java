package com.plaffy.flappy.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Alex on 09/01/2018.
 */

public class Score {
    private int score;
    private String text;
    BitmapFont bmpfont;


    public int getScore() {
        return score;
    }

    public Score() {
        score = 0;
        text = "Score: 0";
        bmpfont = new BitmapFont();
    }

    public void update() {
        increase(10);
    }

    public void increase(int amount) {
        this.score += amount;
    }

    public BitmapFont getBitMap() {
        return bmpfont;
    }

    public CharSequence getText() {
        return "Score : " + this.score;
    }
}
