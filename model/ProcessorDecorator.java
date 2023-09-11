package model;

import design_pattern.DecoratorDesignPattern;
import game_util.GameUtil;

public class ProcessorDecorator extends DecoratorDesignPattern {

    Game game;
    public ProcessorDecorator() {
        super();
    }

    @Override
    public Game update(Game game) {
        game.setProcessor(GameUtil.selectProcessor());
        game.setProcessorCost(GameUtil.getProcesserCost(game.getProcessor()));
        return game;
    }
}
