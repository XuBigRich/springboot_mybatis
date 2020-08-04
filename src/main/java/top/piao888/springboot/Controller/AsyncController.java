package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.piao888.springboot.domain.WebSocket;
import top.piao888.springboot.manager.AsyncManager;
import top.piao888.springboot.manager.factory.AsyncFactory;
import top.piao888.springboot.server.impl.WebSocketServer;

import java.io.IOException;

/**
 * 本章节来学习异步处理任务
 * 异步任务可以提高程序响应速率。
 * 如在用户登录验证时：
 * 如果需要判定用户的密码输入错误，我们需要先去记录日志并返回给用户一个错误信息，告诉用户输入的密码有误。
 * 我们常规手段是先记录日志，然后再返回错误信息，这样串行的处理方法
 * 而通过异步的手段，我们可以建立一个新的线程去记录日志，然后直接返回错误信息。这样就无需等待记录日志这一个耗时操作了。
 */
@Controller
public class AsyncController {
    @Autowired
    public WebSocketServer webSocketServer;
    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 通过websocket 设置一个异步任务，返回信息由请求直接返回，websocket信息延迟5秒钟后发送出去
     * @param id  请求url为 http://127.0.0.1:8080/asynid?id=1
     * @return
     * @throws IOException
     */
    @GetMapping("/asynid")
    @ResponseBody
    public WebSocket sendMessage(String id) throws IOException {
        //打印所有bean
//        for(String a:applicationContext.getBeanDefinitionNames()){
//            System.out.println(a);
//        }
        System.out.println("进入了方法"+id);
        WebSocket webSocket=new WebSocket("1","你猜猜");
        AsyncManager.me().execute(AsyncFactory.resultMessage(webSocket));
        return webSocket;
    }
}
