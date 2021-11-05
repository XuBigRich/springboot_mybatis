package top.piao888.springboot.Controller;

import com.alibaba.druid.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import top.piao888.springboot.domain.User;
import top.piao888.springboot.domain.WebSocket;
import top.piao888.springboot.manager.AsyncManager;
import top.piao888.springboot.manager.factory.AsyncFactory;
import top.piao888.springboot.server.impl.WebSocketServer;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
public class SocketController {

    @Autowired
    private WebSocketServer webSocketServer;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/webSocket")
    public ModelAndView socket() {
        ModelAndView mav = new ModelAndView("/webSocket");
        return mav;
    }
    @GetMapping("/login")
    @ResponseBody
    public String Login(String name, HttpServletResponse httpServletResponse) {
//        User user = new User();
//        user.setDname(name);
        HttpServletRequest httpServletRequest = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        httpServletRequest.getSession().setAttribute("Token", name);
        Cookie cookie=new Cookie("token",name);
        httpServletResponse.addCookie(cookie);
        return name;
    }

    @GetMapping("/id")
    @ResponseBody
    public WebSocket sendMessage(String id) throws IOException {
        System.out.println("进入了方法" + id);
        webSocketServer.sendMessage(id, "你猜猜");
        return new WebSocket("1", "你猜猜");
    }


}