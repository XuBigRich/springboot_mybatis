package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.piao888.springboot.server.SpringSingleServer;

/**
 * 测试spring容器生成的对象是否是单例对象的控制层类
 * 经测试 springioc容器中确实是单例
 */
@Controller
@RequestMapping("test")
public class TestSingle {
    @Autowired

    public SpringSingleServer springSingleServer;

    @GetMapping("/setTest")
    @ResponseBody
    public void setTest(String test) {
        springSingleServer.setTest(test);
    }

    @GetMapping("get")
    @ResponseBody
    public String getTest() {
        return springSingleServer.getTest();
    }
}
