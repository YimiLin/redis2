package com.gs.service;

import com.gs.bean.Employee;

/**
 * @Author 孟飞
 * @Date 2019/3/21 14:14
 * @Project WrokIdea02 com.gs.food.service
 * @Description: java类作用描述
 */
public interface IEmployeeService {
    Employee getbyidemp(Integer eid);

    Employee updempbyid(Employee emp);

    Employee addemp(Employee emp);

    void delemp(Integer eid);
}
