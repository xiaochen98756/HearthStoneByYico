package card;

import lombok.Data;

import java.util.List;

/**
 * 卡牌的公共属性
 */
@Data
public class CommonCard {

    private Integer attackPower;//攻击力
    private Integer lifeValue;//生命值
    private List<String> heroRole; //属于哪个英雄角色
}
