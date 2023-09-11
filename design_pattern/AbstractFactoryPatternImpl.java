package design_pattern;

import model.*;

import java.util.HashMap;

public class AbstractFactoryPatternImpl implements AbstractFactoryPattern{


    private static HashMap<Integer, GameModel> hashMap = new HashMap<>();

    public AbstractFactoryPatternImpl() {

        hashMap.put(1,new BeginnerBundle());
        hashMap.put(2, new ProGamerBundle());
        hashMap.put(3, new AdvanceGamerBundle());

    }

        public GameModel getPreBuildGame(Integer i){
        return hashMap.get(i);
    }







}
