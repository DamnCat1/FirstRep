package com.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Teacher implements Serializable {
    private Integer tid;

    private String tname;

    private Byte tsex;

    private Date tbirthday;

    private String taddress;

    private String temail;

    private BigDecimal tmoney;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Byte getTsex() {
        return tsex;
    }

    public void setTsex(Byte tsex) {
        this.tsex = tsex;
    }

    public Date getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(Date tbirthday) {
        this.tbirthday = tbirthday;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress == null ? null : taddress.trim();
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail == null ? null : temail.trim();
    }

    public BigDecimal getTmoney() {
        return tmoney;
    }

    public void setTmoney(BigDecimal tmoney) {
        this.tmoney = tmoney;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Teacher other = (Teacher) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getTsex() == null ? other.getTsex() == null : this.getTsex().equals(other.getTsex()))
            && (this.getTbirthday() == null ? other.getTbirthday() == null : this.getTbirthday().equals(other.getTbirthday()))
            && (this.getTaddress() == null ? other.getTaddress() == null : this.getTaddress().equals(other.getTaddress()))
            && (this.getTemail() == null ? other.getTemail() == null : this.getTemail().equals(other.getTemail()))
            && (this.getTmoney() == null ? other.getTmoney() == null : this.getTmoney().equals(other.getTmoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getTsex() == null) ? 0 : getTsex().hashCode());
        result = prime * result + ((getTbirthday() == null) ? 0 : getTbirthday().hashCode());
        result = prime * result + ((getTaddress() == null) ? 0 : getTaddress().hashCode());
        result = prime * result + ((getTemail() == null) ? 0 : getTemail().hashCode());
        result = prime * result + ((getTmoney() == null) ? 0 : getTmoney().hashCode());
        return result;
    }
}