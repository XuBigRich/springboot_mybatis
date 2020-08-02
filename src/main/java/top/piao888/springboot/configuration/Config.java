package top.piao888.springboot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.piao888.springboot.domain.Girl;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * 探究对ConfigurationProperties的使用
 * <p>
 * 1.当一个类有多个ConfigurationProperties时  那么 他在使用autowriter时 参数名一定要与方法名（girl2）或者类名（girl） 一致
 * 2.当使用ConfigurationProperties时，配置文件中的各种属性会自动添加到建立的对象当中。
 * 3.@Bean与
 *
 * @Author： hongzhi.xu
 * @Date: 2020/7/28 4:22 下午
 * @Version 1.0
 */
@Configuration
public class Config {

    //    @Bean
    @ConfigurationProperties("boy")
    public Girl girl2() {
        Girl girl = new Girl();
        return girl;
    }


}
