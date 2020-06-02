package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.piao888.springboot.Task.Async.AsyncTask;

import java.util.concurrent.Future;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName DoTask.java
 * @Description 异步任务 启动需要在启动类中声明@EnableAsync  然后在 所执行方法中 声明@Async   就可以成为异步任务了
 * @createTime 2019年01月29日 17:45:00
 */
/*
* 适用范围   * 发送短信    * 发送邮件   * app推送消息  * 节省运维凌晨发布任务时间提供效率
* */
@RestController
public class DoTask {
    @Autowired
    private AsyncTask asyncTask;
    @RequestMapping("/test1")
    public String test1() throws Exception{
        long start=System.currentTimeMillis();
        Future<Boolean> a=asyncTask.doTask11();
        Future<Boolean> b=asyncTask.doTask22();
        Future<Boolean> c=asyncTask.doTask33();

        while(!a.isDone()||!b.isDone()||!c.isDone()){
            if(a.isDone()&&b.isDone()&&c.isDone()){
                break;
            }
        }
        long end =System.currentTimeMillis();
        String times="任务全部完成,总耗时："+(end-start)+"毫秒";
        System.out.println(times);
        return  times;
    }
}
