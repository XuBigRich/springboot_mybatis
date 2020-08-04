package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.piao888.springboot.domain.WebSocket;
import top.piao888.springboot.manager.AsyncManager;
import top.piao888.springboot.manager.factory.AsyncFactory;
import top.piao888.springboot.server.impl.WebSocketServer;

import java.io.IOException;

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
        ModelAndView mav=new ModelAndView("/webSocket");
        return mav;
    }

    @GetMapping("/id")
    @ResponseBody
    public WebSocket sendMessage(String id) throws IOException {
        System.out.println("进入了方法"+id);
        webSocketServer.sendMessage(id,"你猜猜");
        return new WebSocket("1","你猜猜");
    }


}