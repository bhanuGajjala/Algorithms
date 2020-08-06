package com.learning.equalshashcode;

import java.util.Objects;

public class Employee {

    private String ename;
    private String eage;
    private String eid;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEage() {
        return eage;
    }

    public void setEage(String eage) {
        this.eage = eage;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(ename, employee.ename);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ename);
    }
}
