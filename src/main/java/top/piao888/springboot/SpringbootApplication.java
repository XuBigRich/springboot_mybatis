package top.piao888.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//开启定时任务
@EnableScheduling
//开启异步任务
@EnableAsync
@SpringBootApplication
@MapperScan("top.piao888.springboot.mapper")
@EnableWebMvc
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        /*
         * 直接在main中初始化Controller层 bean标签并不会被加载。故mapper不会被实例化
         *
         * */
//        Controller controller=new Controller();
//        controller.getAll();
    }

}
