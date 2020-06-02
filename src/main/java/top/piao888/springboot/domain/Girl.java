package top.piao888.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
*@Component
* 没有任何关联的bean一定要设置@Component因为 不设置spring无法根据上下文推断 @Autowired 要加载谁
*@ConfigurationProperties
* 若果想让设置的application.yml中的属性起作用
* 需要设置@ConfigurationProperties(prefix = "girl")
* 同样如果不设置 spring无法根据上下文推断 这个Girl使用那个yml中的属性
 * */
@Component//如果注释掉 会报错
@ConfigurationProperties(prefix = "girl") //如果不加这条注释 application.yml中配置的girl属性将会失效  得出来的old值也将为null
@Getter
@Setter
public class Girl {
    private String cutsize;
    private String old;
}
