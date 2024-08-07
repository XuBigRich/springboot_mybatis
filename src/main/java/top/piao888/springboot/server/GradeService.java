package top.piao888.springboot.server;

import com.alibaba.fastjson.JSONObject;
import top.piao888.springboot.domain.Time;
import top.piao888.springboot.dto.GradeDTO;
import top.piao888.springboot.dto.GradeMysqlDTO;

import java.util.Collection;
import java.util.List;

/**
 * @author 许鸿志
 * @since 2021/9/4
 */
public interface GradeService {
    Collection<GradeDTO> getAllStudent(Integer id);

    GradeMysqlDTO getAllStudentByMysql();

    List<Time> getTime();
    List<JSONObject> getTimeJsonObject();
}
