package top.piao888.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.piao888.springboot.domain.User;

import java.util.List;


//@Mapper
//@Component//此处不加此注解会报错,但不会影响执行 因为 springboot根据上下文推断 需要自动Autowired这个类
public interface UserMapper {
     List<User> getAll();
     void delete(int id);
     int insert(User user);
}
