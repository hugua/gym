package com.cvte.chen.entity;

import java.io.Serializable;
import java.util.Date;

public class Usertest implements Serializable{
    private Integer id;
    private String name;
    private String password;

    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
//    public void setBirthday(String str) {
//        String datePattern = "yyyy-mm-dd";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
//        java.util.Date date = null;
//        try {
//            date = simpleDateFormat.parse(str);
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        this.birthday = new java.sql.Date(date.getTime());
//    }

    public Usertest() {
    }

    public Usertest(Integer id, String name, String password, Date birthday) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Usertest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}