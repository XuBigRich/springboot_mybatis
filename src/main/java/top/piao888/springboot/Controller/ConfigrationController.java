package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.piao888.springboot.domain.Girl;

/**
 * 测试ConfigrationProperties 的用法
 * @Author： hongzhi.xu
 * @Date: 2020/7/28 4:11 下午
 * @Version 1.0
 */
@RestController
public class ConfigrationController {
    @Autowired
    public Girl girls2;
    @GetMapping("getgril1")
    public Girl getGirl1(){
        Girl girl=new Girl();
        return girl;
    }
    @GetMapping("getgril2")
  public Girl getGirl2(Girl girl2){
        return this.girls2;
    }
}
