package model;

import design_pattern.DecoratorDesignPattern;
import game_util.GameUtil;

public class ControllerDecorator extends DecoratorDesignPattern {

    Game game;
    public ControllerDecorator() {
        super();
    }

    @Override
    public Game update(Game game) {
        game.setController(GameUtil.selectController());
        game.setControllerCost(GameUtil.getControllerCost(game.getController()));
        return game;
    }
}
