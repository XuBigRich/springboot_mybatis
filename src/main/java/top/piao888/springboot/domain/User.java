package top.piao888.springboot.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    /**
     * 学生id
     */
    private int did;
    /**
     * 学生名称
     */
    private String dname;
    /**
     * 所属年级
     */
    private Integer gradeId;
}
