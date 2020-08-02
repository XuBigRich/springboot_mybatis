package top.piao888.springboot.manager;

import top.piao888.springboot.configuration.SpringUtils;

import java.util.concurrent.ScheduledExecutorService;

/**
 * 这是一个异步任务管理器，所有的异步任务都将从他这里执行
 */
public class AsyncManager {
    /**
     * 异步操作任务调度线程池
     */
    private ScheduledExecutorService executor = SpringUtils.getBean("scheduledExecutorService");

}
