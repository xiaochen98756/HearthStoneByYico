package service;

import hero.CommonHero;

/**
 * 英雄服务类
 */
public class HeroService {
    private final String DEATH="DEATH";
    private final String ALIVE="ALIVE";

    /**
     * 判断一个英雄是否死亡
     */
    public boolean isHeroDeath(CommonHero hero){
        return ALIVE.equals(hero.getState());
    }

}
