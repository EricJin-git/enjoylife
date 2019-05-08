package com.jk.enjoylife.Controller;

import com.jk.enjoylife.Entity.Jk;
import com.jk.enjoylife.Service.JkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    JkService jkService;
    @RequestMapping(value = "/getall")
    public List<Jk> getall(){

        return  jkService.insert1();
    }
//    @RequestMapping(value = "/setuser")
//    public String setuser(){
//        userService.insert1();
//        return  "return \"success\";";
//    }
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET) // 测试用
    public String sayHello(){
        return "hello，这是我的微信小程序，乐享生活!!";
    }
}
