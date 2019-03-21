package com.gs.dao;

import com.gs.bean.Employee;

/**
 * @Author 孟飞
 * @Date 2019/3/21 14:11
 * @Project WrokIdea02 com.gs.dao
 * @Description: java类作用描述
 */
public interface EmployeeDao {
    //根据员工查询员工对象
    Employee getByIdemp(Integer eid);

    //去修改员工
    void updempbyid(Employee emp);

    //去添加员工
    void addemp(Employee emp);

    //删除员工
    void delemp(Integer eid);
}
