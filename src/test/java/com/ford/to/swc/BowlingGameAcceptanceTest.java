package com.ford.to.swc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameAcceptanceTest {
    @Test
    public void givenABowlerRollsAllGutterBallsThenScoreIsZero(){
        int[] rolls = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        GameInput input= new GameInput(rolls);
        BowlingGame game = new BowlingGame(input);

        assertThat(game.calculateBowlingScore()).isEqualTo(0);
    }

    @Test
    public void givenABowlerRollsAllStrikesThenScoreIsThreeHundred(){
        int[] rolls = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        GameInput input= new GameInput(rolls);
        BowlingGame game = new BowlingGame(input);

        assertThat(game.calculateBowlingScore()).isEqualTo(300);
    }

    @Test
    public void givenABowlerRollsSparesThenScoreIsOneFifty(){
        int[] rolls = {5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5,5};
        GameInput input= new GameInput(rolls);
        BowlingGame game = new BowlingGame(input);

        assertThat(game.calculateBowlingScore()).isEqualTo(150);
    }

    @Test
    public void givenABowlerRollsRandownPins(){
        int[] rolls = {5,5, 10, 10, 5,5, 6,2, 5,5, 5,5, 4,6, 5,5, 10,3,5};
        GameInput input= new GameInput(rolls);
        BowlingGame game = new BowlingGame(input);

        assertThat(game.calculateBowlingScore()).isEqualTo(171);
    }
}
