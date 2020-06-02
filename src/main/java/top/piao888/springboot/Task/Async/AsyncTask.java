package top.piao888.springboot.Task.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName AsyncTask.java
 * @Description TODO
 * @createTime 2019年01月29日 17:36:00
 */
@Component
public class AsyncTask {
    @Async
    public Future<Boolean> doTask11() throws Exception{
        long start=System.currentTimeMillis();
        Thread.sleep(1000);
        long end=System.currentTimeMillis();
        System.out.println("任务1耗时："+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }
    @Async
    public Future<Boolean> doTask22() throws Exception{
        long start=System.currentTimeMillis();
        Thread.sleep(700);
        long end=System.currentTimeMillis();
        System.out.println("任务2耗时："+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }
    @Async
    public Future<Boolean> doTask33() throws Exception{
        long start=System.currentTimeMillis();
        Thread.sleep(600);
        long end=System.currentTimeMillis();
        System.out.println("任务3耗时："+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }

}
