package top.piao888.springboot.mapper;

import top.piao888.springboot.domain.Grade;
import top.piao888.springboot.domain.User;
import top.piao888.springboot.dto.GradeDTO;

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
     * 此查询依附于 selectGrade
     *
     * @param id
     * @return
     */
    List<User> selectUserByGradeId(Integer id);


    void delete(int id);

    void insert(Grade user);

}
