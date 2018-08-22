package com.dubbo.Controller;


import com.dubbo.Service.UserinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneConsumer {

    @Autowired
    private UserinService userinService;

    @GetMapping(value = "sayDubbo")
    public String sayDubbo(){

        return "1";
    }
}
