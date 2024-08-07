package top.piao888.springboot.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.piao888.springboot.domain.Grade;
import top.piao888.springboot.domain.User;
import top.piao888.springboot.mapper.GradeMapper;
import top.piao888.springboot.mapper.UserMapper;
import top.piao888.springboot.server.TransactionService;

/**
 * @author 许鸿志
 * @since 2022/3/12
 */
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int test(User user) throws Exception {
        Grade grade = gradeMapper.getGradeById(user.getGradeId());
        int i = gradeMapper.registration(grade.getVersion(), grade.getId());
        if (i == 0) {
            throw new Exception("慢人一步");
        }
        //这个地方必须添加事务，如果当前 程序更新成功，然后死掉 还没有来得及插入数据，那么就会产生脏数据
        //所以为了保证插入和课程扣减的一致性，必须要添加事务
        //同样道理，如果后续无数据库操作，或许可以不添加事务，因为乐观锁的存在，会保证扣减的一致性
        return userMapper.insert(user);
    }
}
