package cn.dao;

import cn.pojo.Dept;
import org.springframework.orm.hibernate3.HibernateTemplate;

import javax.annotation.Resource;
import java.util.List;

public interface DeptDao {
   public List<Dept> getAll() throws Exception;
}
