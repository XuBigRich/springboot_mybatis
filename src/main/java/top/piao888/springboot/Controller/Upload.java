package top.piao888.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.*;
import java.util.Map;

/**
 * springboot上传图片的接收方式
 *
 * @Author： hongzhi.xu
 * @Date: 2020/7/31 6:35 下午
 * @Version 1.0
 */
@Controller
public class Upload {
    @PostMapping("/UpdateHandler")
    @ResponseBody
    public void getAll() throws IOException, ServletException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        Map stringMap = request.getParameterMap();
        /**
         * 通过流的方式获取不到数据 是因为request的流的获取每个请求只能获取一次，之后再通过getInputStream获取流的时候就获取不到
         * 数据了，还有getInputStream和getReader和getParameter都可以获取输入流数据，但是存在冲突，也就是三者只要有一个对
         * request获取了输入流信息，那么其他的方法之后就获取不到数据了。
         * 
         * 首先直接在controller层直接写肯定是获取不到的，即使你自己觉得你是第一次获取输入流，
         * 其实不然，在springboot启动的时候拦截器中也通过getParameter获取过输入流，导致后面没办法获取输入流
         */
        ServletInputStream fis = request.getInputStream();
//        InputStream fis= request.getPart("asdad").getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = fis.read(bytes)) != -1) {
            baos.write(bytes, 0, len);
        }
        baos.close();
        fis.close();
        byte[] lens = baos.toByteArray();
        String so = new String(lens, "utf-8");
        System.out.println(so);

//        Part part=request.getPart("file");
//        String s=part.getName();
//        System.out.println(s);
    }
}
