package com.gs.bean;

/**
 * @Author 孟飞
 * @Date 2019/3/19 11:37
 * @Project WrokIdea02 com.gs.redist1.bean
 * @Description: java类作用描述
 */
public class Employee {
    private Integer eid;
    private String ename;
    private String phone;
    private Integer did;
    private String face;

    public Employee() {
    }

    public Employee(String ename, String phone, Integer did, String face) {
        this.ename = ename;
        this.phone = phone;
        this.did = did;
        this.face = face;
    }

    public Employee(Integer eid, String ename, String phone, Integer did, String face) {
        this.eid = eid;
        this.ename = ename;
        this.phone = phone;
        this.did = did;
        this.face = face;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", phone='" + phone + '\'' +
                ", did=" + did +
                ", face='" + face + '\'' +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}
