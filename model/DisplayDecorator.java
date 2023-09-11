package model;

import design_pattern.DecoratorDesignPattern;
import game_util.GameUtil;

public class DisplayDecorator extends DecoratorDesignPattern {

    Game game;
    public DisplayDecorator(Game game) {
        super(game);
        this.game = game;
    }

    @Override
    public Game update() {
        game.setDisplay(GameUtil.selectDisplay());
        game.setDisplayCost(GameUtil.getDisplayCost(game.getDisplay()));
        return game;
    }
}
