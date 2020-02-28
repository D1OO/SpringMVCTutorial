/**
 * HelloController
 * <p>
 * version 1.0
 * <p>
 * 28.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy.springtut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hi")
    public String sayHi(){
        return "hi";
    }
}
