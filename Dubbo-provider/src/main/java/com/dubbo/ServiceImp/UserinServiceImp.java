package com.dubbo.ServiceImp;

import com.dubbo.Service.UserinService;




public class UserinServiceImp implements UserinService {

    @Override
    public String sayDubbo() {
        return "hello dubbo:";
    }


}
