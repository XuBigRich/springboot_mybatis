package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import top.piao888.springboot.domain.User;
import top.piao888.springboot.server.UserServer;

import java.util.List;

@Controller //声明控制层 若想返回json格式 必须 与 下面ResponseBody 搭配使用
//@RestController  //声明控制层 并 默认返回json格式
public class UserController {
    @Autowired
    private UserServer userServer;

    @GetMapping("/getAll")
    @ResponseBody
    public List<User> getAll(){
        System.out.println("1");
        return userServer.getAll();
    }
    @GetMapping("/allv")
    public void getAll(Model model){
        List<User> users=userServer.getAll();
        model.addAttribute("users",users);
    }
    @GetMapping("/delet")
    public String delete(@RequestParam("id") Integer id){
        userServer.delete(id);
        System.out.println("1");
        return "redirect:/allv";//请求重定向
        //一般不需要返回值 返回到前端页面。因为只做后端 把数据删掉就可以了
    }
    //forward:/users/uc  // 请求转发
    @GetMapping("/1")
    public void insert(){
        User user= new User();
        user.setDname("111");
        System.out.println("11");
        userServer.insert(user);
    }
}
