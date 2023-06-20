package org.andr7st.sb.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @GetMapping("/")
    public String indexPage() {
        return "Hello world!";
    }

}
