package com.rce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public void test(TestVO testVO) {
        System.out.println(testVO);
    }
}
