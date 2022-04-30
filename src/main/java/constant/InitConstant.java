package constant;

import lombok.Data;

@Data
public class InitConstant {

    private Integer lifeValue=30; //初始生命值
    private Integer firstCardLeftTime=15;//第一回合出牌时间
    private Integer cardLeftTime=45;//其他回合出牌时间


}
