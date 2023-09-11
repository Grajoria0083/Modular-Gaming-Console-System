package design_pattern;

import model.Game;

public abstract class DecoratorDesignPattern extends Game {

    Game game;

    public DecoratorDesignPattern() {

    }


    public abstract Game update(Game game);
//

}
