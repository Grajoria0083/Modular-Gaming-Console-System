package design_pattern;

import model.Game;

public abstract class DecoratorDesignPattern extends Game {

    Game game;

    public DecoratorDesignPattern(Game game) {
        this.game = game;
    }

    public abstract Game update();

}
