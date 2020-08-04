package top.piao888.springboot.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @Author： hongzhi.xu
 * @Date: 2020/8/4 9:49 下午
 * @Version 1.0
 */
@Data
public class WebSocket {
   public String toUserId;
   public String message;
   public WebSocket(String toUserId,String message){
      this.toUserId=toUserId;
      this.message=message;
   }
}
