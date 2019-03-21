package com.gs.controller;

import com.gs.base.RedisTemplateUtil;
import com.gs.bean.Employee;
import com.gs.service.IEmployeeService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author 孟飞
 * @Date 2019/3/20 19:43
 * @Project WrokIdea02 com.gs.food.controller
 * @Description: java类作用描述
 */
@Controller
@RequestMapping("/user")
public class IndexController {
    @Resource
    private IEmployeeService service;
    @Resource
    private RedisTemplate template;

    @RequestMapping("/index")
    public String index() {
        return "user/index";
    }

    @RequestMapping("/findempbyid")
    public String findempbyid(Integer eid) {
        System.out.println("进来了controller");
        Employee emp = service.getbyidemp(eid);
        System.out.println(emp);
        return "user/index";
    }

    @RequestMapping("updempbyid")
    public String updempbyid(Integer eid) {
        Employee emp = service.updempbyid(new Employee(eid, "赫赫", "15378719023", 1, "/upload/2019-03-19/5c55cfa2-b266-4d51-be29-f648d88aebc9.jpg"));
        System.out.println(emp);
        return "user/index";
    }

    @RequestMapping("addemps")
    public String addemps() {
        Employee emp = service.addemp(new Employee("天天", "13518725518", 4, "/upload/2019-03-15/38c96cea-7d62-4629-81e0-a14d55ab4b72.jpg"));
        System.out.println(emp);
        return "user/index";
    }

    @RequestMapping("delemp")
    public String delemp(Integer eid) {
        service.delemp(eid);
        return "user/index";
    }

    @RequestMapping("/test")
    public String test() {
        //直接使用RedisTemplate
//        ValueOperations opt=  template.opsForValue();
//        opt.set("test","testvalue");
        RedisTemplateUtil tem = new RedisTemplateUtil(template);
        String str = tem.get("str").toString();
        System.out.println(str);
        return "user/index";
    }
}
