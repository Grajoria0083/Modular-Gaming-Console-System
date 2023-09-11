package model;

import design_pattern.DecoratorDesignPattern;
import game_util.GameUtil;

public class DisplayDecorator extends DecoratorDesignPattern {

    Game game;
    public DisplayDecorator() {
        super();
    }

    @Override
    public Game update(Game game) {
        game.setDisplay(GameUtil.selectDisplay());
        game.setDisplayCost(GameUtil.getDisplayCost(game.getDisplay()));
        return game;
    }
}
