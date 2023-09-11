package model;

import design_pattern.DecoratorDesignPattern;
import game_util.GameUtil;

public class ProcessorDecorator extends DecoratorDesignPattern {

    Game game;
    public ProcessorDecorator(Game game) {
        super(game);
        this.game = game;
    }

    @Override
    public Game update() {
        game.setProcessor(GameUtil.selectProcessor());
        game.setProcessorCost(GameUtil.getProcesserCost(game.getProcessor()));
        return game;
    }
}
