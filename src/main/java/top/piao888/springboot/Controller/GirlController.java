package top.piao888.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.piao888.springboot.domain.Girl;

@RestController
@RequestMapping("/a")
public class GirlController {
    @Autowired
    private Girl girl;
    @GetMapping("/a")
    public String aaa(@RequestParam("id") Integer bb){
        System.out.println(girl.getOld());
        return "Id="+bb;
    }
    @GetMapping("/a/{a}")
    public String bbb(@PathVariable int a){
        System.out.println(girl.getOld());
        System.out.println(a);
        return "a="+a;
    }

}
