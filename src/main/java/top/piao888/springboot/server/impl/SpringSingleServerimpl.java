package top.piao888.springboot.server.impl;

import org.springframework.stereotype.Service;
import top.piao888.springboot.server.SpringSingleServer;
@Service
public class SpringSingleServerimpl implements SpringSingleServer {
    public String test;

    @Override
    public void setTest(String test) {
        this.test=test;
    }

    @Override
    public String getTest() {
        return this.test;
    }
}
