package top.piao888.springboot.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author： hongzhi.xu
 * @Date: 2022/7/13 10:01 下午
 * @Version 1.0
 */
@Data
public class Time {
    /**
     * 时间戳格式
     */
//   private long time;
    private LocalDateTime time;
//    private Date time;
}
