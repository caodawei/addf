package cn.pojo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;
@Component(value = "dept")
@Entity
public class Dept {
    private long deptno;
    private String dname;
    private String loc;
    private Set<Emp> emps;

    @Id
    @Column(name = "DEPTNO", nullable = false, precision = 0)
    public long getDeptno() {
        return deptno;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    @Basic
    @Column(name = "DNAME", nullable = true, length = 14)
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "LOC", nullable = true, length = 13)
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return deptno == dept.deptno &&
                Objects.equals(dname, dept.dname) &&
                Objects.equals(loc, dept.loc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptno, dname, loc);
    }

    @OneToMany(mappedBy = "dept")
    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }
}
