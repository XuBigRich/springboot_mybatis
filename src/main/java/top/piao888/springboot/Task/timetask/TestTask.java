package top.piao888.springboot.Task.timetask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName TestTask.java
 * @Description 定时任务执行类
 * @createTime 2019年01月29日 17:12:00
 */
//作为组件被容器扫描
@Component
public class TestTask {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    //定义每过3秒执行任务
//    @Scheduled(fixedRate = 3000)
    //表达式方式  生成表达式地址：http://cron.qqe2.com/
    @Scheduled(cron = "30-39 * * * * ?")
    public void reportCurrentTime(){
        System.out.println("现在时间: " +dateFormat.format(new Date()));
    }
}
