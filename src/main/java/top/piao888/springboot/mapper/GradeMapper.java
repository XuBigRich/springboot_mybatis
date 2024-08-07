package top.piao888.springboot.mapper;

import com.alibaba.fastjson.JSONObject;
import top.piao888.springboot.domain.Grade;
import top.piao888.springboot.domain.Time;
import top.piao888.springboot.domain.User;
import top.piao888.springboot.dto.GradeDTO;
import top.piao888.springboot.dto.GradeMysqlDTO;

import java.util.List;

/**
 * @author 许鸿志
 * @since 2021/9/4
 */
public interface GradeMapper {
    List<Grade> getAll();

    List<GradeDTO> getAllStudent();

    List<GradeDTO> getAllStudentResultMap(Integer id);


    List<GradeDTO> getAllStudentAssociation(Integer id);

    /**
     * 使用mysql原生方案
     * @return
     */
    GradeMysqlDTO mysqlAllStudent();

    /**
     * 此查询依附于 selectGrade
     *
     * @param id
     * @return
     */
    List<User> selectUserByGradeId(Integer id);


    void delete(int id);

    void insert(Grade user);

    List<Time> getTime();

    List<JSONObject> getTimeJsonObject();
    Grade getGradeById(int id);

    int registration(int version, int id);

}
