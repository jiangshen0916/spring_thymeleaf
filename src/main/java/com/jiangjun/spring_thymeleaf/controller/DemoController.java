package com.jiangjun.spring_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author jiangshen
 * @date 2020==03==25
 **/


@Controller
public class DemoController {


    @RequestMapping("/aa")
    public  String say(Model model){
        model.addAttribute ( "name" , "姜军" );
        model.addAttribute ( "id",1 );
        model.addAttribute ( "age",23 );
        model.addAttribute ( "sex","男" );
        return  "index";

    }

    @RequestMapping("/bb")
    public  String save(Map<String,Object> map){
        map.put ( "user", Arrays.asList("张三","李四","王麻子") );
        map.put ( "hello",Arrays.asList ( "赵信","李青","泰隆" ) );
        return "se";
    }

}
