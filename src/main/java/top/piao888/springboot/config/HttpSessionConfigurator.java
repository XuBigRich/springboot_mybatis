package top.piao888.springboot.config;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;
import javax.websocket.server.ServerEndpointConfig.Configurator;

/**
 * 配置 将httpsession 放入到getUserProperties map中去
 * WsHttpUpgradeHandler 执行init方法的时候
 * ServerEndpointConfig 就已经被初始化和赋值完成了
 *
 * 而Configurator  类 是ServerEndpointConfig 接口的一个 成员变量
 * 很显然HttpSessionConfigurator此时此刻 也是 ServerEndpointConfig的一个成员变量。
 *
 * 因为ServerEndpointConfig 在WsHttpUpgradeHandler.init时已经初始完毕了，所以相应的modifyHandshake 也已经执行，session已经被获取下来
 */
public class HttpSessionConfigurator extends Configurator {
 
    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        HttpSession httpSession = (HttpSession) request.getHttpSession();
        sec.getUserProperties().put(HttpSession.class.getName(), httpSession);
    }
}