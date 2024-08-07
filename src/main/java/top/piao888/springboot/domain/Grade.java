package top.piao888.springboot.domain;

import lombok.Data;


/**
 * @author 许鸿志
 * @since 2021/9/4
 */
@Data
public class Grade {
    /**
     * 班级id
     */
    private int id;
    /**
     * 班级名称
     */
    private String name;

    /**
     * 乐观锁
     */
    private Integer version;

}
