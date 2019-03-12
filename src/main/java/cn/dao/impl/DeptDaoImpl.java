package cn.dao.impl;

import cn.dao.DeptDao;
import cn.pojo.Dept;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("deptDao")
public class DeptDaoImpl implements DeptDao {
   @Resource
    HibernateTemplate sqlSession;

    @Override
    public List<Dept> getAll() throws Exception {
        return sqlSession.find("from Dept");
    }
}
