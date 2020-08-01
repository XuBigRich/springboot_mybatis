package top.piao888.springboot.configuration;

import org.springframework.boot.web.servlet.filter.OrderedHiddenHttpMethodFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 这里重写拦截器，因为springboot在默认的拦截器中获取了inputStream造成了后续 无法获取到流信息于是 需要通过方法重写 方可获得流信息
 */
@Configuration
public class WebConfig {
    /*@Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new OrderedHiddenHttpMethodFilter() {
            @Override
            protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
                    throws ServletException, IOException {
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(request.getInputStream(), "UTF-8"));
                String line;
                String result = "";
                while ((line = reader.readLine()) != null) {
                    result += line;
                }
                filterChain.doFilter(request, response);
            }
        };
    }*/
}
