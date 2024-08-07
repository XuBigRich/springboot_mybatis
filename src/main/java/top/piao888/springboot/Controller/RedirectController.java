package top.piao888.springboot.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @Author： hongzhi.xu
 * @Date: 2024/8/7 19:48
 * @Version 1.0
 */
@RestController
@RequestMapping("/redirect")
public class RedirectController {
    @GetMapping("/firstRedirect")
    public ResponseEntity<Void> firstRedirect(UriComponentsBuilder uriComponentsBuilder) {
        return ResponseEntity.status(302).location(uriComponentsBuilder.replacePath(null)
                        .scheme("http")
                        .host("localhost")
                        .port(8080)
                        .path("/redirect/redirectWithUriComponentsBuilder")
                        .build()
                        .toUri())
                .build();
    }

    @GetMapping("/redirectWithUriComponentsBuilder")
    public ResponseEntity<Void> redirectWithUsingUriComponentsBuilder(UriComponentsBuilder uriComponentsBuilder) {
        return ResponseEntity.status(302).location(uriComponentsBuilder.path("/redirect/targetUrl").build().toUri()).build();
    }

    @GetMapping("/targetUrl")
    public String targetUrl() {
        return "This is the target URL.";
    }
}
