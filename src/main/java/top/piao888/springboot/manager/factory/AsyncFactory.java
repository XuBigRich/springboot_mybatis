package top.piao888.springboot.manager.factory;

import lombok.SneakyThrows;
import top.piao888.springboot.configuration.SpringUtils;
import top.piao888.springboot.domain.WebSocket;
import top.piao888.springboot.server.impl.WebSocketServer;

import java.util.TimerTask;

/**
 * 异步工厂类
 * @Author： hongzhi.xu
 * @Date: 2020/8/4 10:24 下午
 * @Version 1.0
 */
public class AsyncFactory {
    public static TimerTask resultMessage(WebSocket webSocket){
        return new TimerTask(){

            @SneakyThrows
            @Override
            public void run() {
                WebSocketServer webSocketServer= SpringUtils.getBean("webSocketServer");
                webSocketServer.sendMessage(webSocket.getToUserId(),webSocket.getMessage());
            }
        };
    }
}
