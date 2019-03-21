package com.gs.service.impl;

import com.gs.bean.Employee;
import com.gs.dao.EmployeeDao;
import com.gs.service.IEmployeeService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author 孟飞
 * @Date 2019/3/21 14:14
 * @Project WrokIdea02 com.gs.service.impl
 * @Description: java类作用描述
 */
@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
    @Resource
    private EmployeeDao dao;

    /**
     * @return
     * @Author 孟飞
     * @Date 2019/3/21 19:54
     * @Param null
     * @Description: java类作用描述
     * 查询用cacheable、添加和修改用cableput、删除用cacheevict
     */
    @Cacheable(value = "emps", key = "'emp_'+#eid")
    public Employee getbyidemp(Integer eid) {
        System.out.println("进来了！去mysql数据库查询！！！");
        return dao.getByIdemp(eid);
    }

    @CachePut(value = "emps", key = "'emp_'+#result.eid")
    public Employee updempbyid(Employee emp) {
        dao.updempbyid(emp);
        return emp;
    }

    @CachePut(value = "emps", key = "'emp_'+#result.eid")
    public Employee addemp(Employee emp) {
        dao.addemp(emp);
        return emp;
    }

    @CacheEvict(value = "emps", key = "'emp_'+#eid")
    public void delemp(Integer eid) {
        dao.delemp(eid);
    }
}
