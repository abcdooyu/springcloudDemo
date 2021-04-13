package com.eetco.springcloud.service.impl;

import com.eetco.springcloud.mapper.DeptMapper;
import com.eetco.springcloud.pojo.Dept;
import com.eetco.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptMapper.queryById(id);
    }

    @Override
    public List<Dept> queryAllDept() {
        return deptMapper.queryAllDept();
    }
}
