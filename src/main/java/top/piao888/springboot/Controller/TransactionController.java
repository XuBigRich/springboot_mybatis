package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.piao888.springboot.domain.User;
import top.piao888.springboot.server.TransactionService;

/**
 * @author 许鸿志
 * @since 2022/3/12
 */
@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactionTest")
    public int test(@RequestBody User user) throws Exception {
        /**
         * 在一个事务中，判断这个年级是否还可以容得下人，如果容得下人 就往年人员表中插入一条数据 ,并且 年级容量-1
         */
        return transactionService.test(user);
    }
}
