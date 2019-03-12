package cn.pojo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;
@Component(value = "emp")
@Entity
public class Emp {
    private long empno;
    private String ename;
    private String job;
    private Long mgr;
    private Time hiredate;
    private Long sal;
    private Long comm;
    private Dept dept;

    @Id
    @Column(name = "EMPNO", nullable = false, precision = 0)
    public long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "ENAME", nullable = true, length = 10)
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "JOB", nullable = true, length = 9)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "MGR", nullable = true, precision = 0)
    public Long getMgr() {
        return mgr;
    }

    public void setMgr(Long mgr) {
        this.mgr = mgr;
    }

    @Basic
    @Column(name = "HIREDATE", nullable = true)
    public Time getHiredate() {
        return hiredate;
    }

    public void setHiredate(Time hiredate) {
        this.hiredate = hiredate;
    }

    @Basic
    @Column(name = "SAL", nullable = true, precision = 2)
    public Long getSal() {
        return sal;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }

    @Basic
    @Column(name = "COMM", nullable = true, precision = 2)
    public Long getComm() {
        return comm;
    }

    public void setComm(Long comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empno == emp.empno &&
                Objects.equals(ename, emp.ename) &&
                Objects.equals(job, emp.job) &&
                Objects.equals(mgr, emp.mgr) &&
                Objects.equals(hiredate, emp.hiredate) &&
                Objects.equals(sal, emp.sal) &&
                Objects.equals(comm, emp.comm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, job, mgr, hiredate, sal, comm);
    }

    @ManyToOne
    @JoinColumn(name = "DEPTNO", referencedColumnName = "DEPTNO")
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
