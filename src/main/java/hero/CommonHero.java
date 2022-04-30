package hero;

import lombok.Data;

import java.io.Serializable;

//英雄共有属性
@Data
public class CommonHero implements Serializable {
    private Integer attackPower;//攻击力
    private Integer lifeValue;//生命值
    private String state; //状态


}
