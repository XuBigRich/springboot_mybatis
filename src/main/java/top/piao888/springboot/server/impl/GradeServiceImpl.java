package top.piao888.springboot.server.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.piao888.springboot.domain.Time;
import top.piao888.springboot.dto.GradeDTO;
import top.piao888.springboot.dto.GradeMysqlDTO;
import top.piao888.springboot.mapper.GradeMapper;
import top.piao888.springboot.server.GradeService;

import java.util.Collection;
import java.util.List;

/**
 * @author 许鸿志
 * @since 2021/9/4
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public Collection<GradeDTO> getAllStudent(Integer id) {
//        return gradeMapper.getAllStudentResultMap(id);
        return gradeMapper.getAllStudentAssociation(id);
//        return gradeMapper.getAllStudent();
    }

    public GradeMysqlDTO getAllStudentByMysql() {
        return gradeMapper.mysqlAllStudent();
    }

    public List<Time> getTime() {
        List<Time> time = gradeMapper.getTime();
        return time;
    }

    @Override
    public List<JSONObject> getTimeJsonObject() {
        List<JSONObject> time = gradeMapper.getTimeJsonObject();
        return time;
    }
}
