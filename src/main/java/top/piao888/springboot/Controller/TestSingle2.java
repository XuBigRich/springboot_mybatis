package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.piao888.springboot.server.SpringSingleServer;

/**
 * 测试spring容器生成的对象在不同controller中 为单例对象
 *
 * 经测试 在不同容器中生成的单例依然是 单例模式
 */

@Controller
@RequestMapping("testt")
public class TestSingle2 {
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
