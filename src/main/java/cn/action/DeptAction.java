package cn.action;

import cn.pojo.Dept;
import cn.service.DeptService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class DeptAction {
    @Resource(name = "deptService")
    DeptService deptService;
    private List<Dept> depts=new ArrayList<>();

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }

    public String execute()
    {
        depts=deptService.getAll();
        return "success";
    }
}
