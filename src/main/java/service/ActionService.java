package service;

import card.CommonCard;
import hero.CommonHero;

/**
 * 卡牌动作
 */
public class ActionService {

    //卡牌攻击一个英雄
    public CommonHero attack(CommonCard card, CommonHero hero){
        hero.setLifeValue(card.getAttackPower()- hero.getLifeValue());
        return hero;
    }


}
