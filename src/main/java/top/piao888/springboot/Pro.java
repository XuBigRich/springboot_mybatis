package top.piao888.springboot;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Properties;

public class Pro {
    public Properties properties;

    {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(new ClassPathResource("application.yml").getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        properties.list(System.out);
    }
    public void aa(String name){
        Object a=properties.get(name);
        StringBuffer nameB=new StringBuffer(name);
        System.out.println(nameB.append(" : ").append(a));
    }

    public static void main(String[] args) {
    		Pro  p=new Pro();
    		p.aa("port");
    		//输出时间戳
        System.out.println(System.currentTimeMillis());
    }

}
