package cn.service;

import cn.dao.DeptDao;
import cn.pojo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("deptService")
public class DeptServiceImpl  implements  DeptService{
   @Resource(name = "deptDao")
    DeptDao dao;
    @Override
    public List<Dept> getAll() {
        ArrayList<Dept> depts = new ArrayList<>();
        List<Dept> list= depts;
        try {
            list= dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
