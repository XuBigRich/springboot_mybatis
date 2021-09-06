package top.piao888.springboot.server;

import top.piao888.springboot.dto.GradeDTO;
import top.piao888.springboot.dto.GradeMysqlDTO;

import java.util.Collection;

/**
 * @author 许鸿志
 * @since 2021/9/4
 */
public interface GradeService {
    Collection<GradeDTO> getAllStudent(Integer id);

    GradeMysqlDTO getAllStudentByMysql();
}
