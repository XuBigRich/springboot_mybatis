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
*
* Component与Bean 区别
*@Component注解表明一个类会作为组件类，并告知Spring要为这个类创建bean。
*@Bean注解告诉Spring这个方法将会返回一个对象，这个对象要注册为Spring应用上下文中的bean。
* 通常方法体中包含了最终产生bean实例的逻辑。
* 两者的目的是一样的，都是注册bean到Spring容器中。
*@Component（@Controller、@Service、@Repository）通常是通过类路径扫描来自动侦测以及自动装配到Spring容器中。
*
* 总结：@Component和@Bean都是用来注册Bean并装配到Spring容器中，但是Bean比Component的自定义性更强。
* 可以实现一些Component实现不了的自定义加载类。
*
*而@Bean注解通常是我们在标有该注解的方法中定义产生这个bean的逻辑。
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
