package top.piao888.springboot.server;

import top.piao888.springboot.domain.User;

/**
 * @author 许鸿志
 * @since 2022/3/12
 */
public interface TransactionService {

    int test(User user) throws Exception;
}
