package model;

import design_pattern.DecoratorDesignPattern;
import game_util.GameUtil;

public class ControllerDecorator extends DecoratorDesignPattern {

    Game game;

    public ControllerDecorator(Game game) {
        super(game);
        this.game = game;

    }


    @Override
    public Game update() {
        game.setController(GameUtil.selectController());
        game.setControllerCost(GameUtil.getControllerCost(game.getController()));
        return game;
    }
}
