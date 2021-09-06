package top.piao888.springboot.dto;

import lombok.Data;
import top.piao888.springboot.domain.User;

import java.util.List;

/**
 * @author 许鸿志
 * @since 2021/9/4
 */
@Data
public class GradeMysqlDTO {
    private int id;
    private String name;
    private String users;
}
