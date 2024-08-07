package top.piao888.springboot.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.piao888.springboot.domain.Time;
import top.piao888.springboot.dto.GradeDTO;
import top.piao888.springboot.dto.GradeMysqlDTO;
import top.piao888.springboot.server.GradeService;

import java.security.Timestamp;
import java.util.Collection;
import java.util.List;

/**
 * 学习
 *
 * @author 许鸿志
 * @since 2021/9/4
 */
@RestController
@RequestMapping("mybatis")
public class MybatisController {

    @Autowired
    public GradeService gradeService;

    @GetMapping("getAllStudent")
    public Collection<GradeDTO> getAllStudent(Integer id) {
        return gradeService.getAllStudent(id);
    }

    @GetMapping("getAllStudentByMysql")
    public GradeMysqlDTO getAllStudentByMysql() {
        return gradeService.getAllStudentByMysql();
    }

    @GetMapping("getTime")
    public List getTime() {
//        List<Time> result = gradeService.getTime();
        List<JSONObject> result = gradeService.getTimeJsonObject();
        return result;
    }

}
