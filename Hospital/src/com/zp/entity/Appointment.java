package com.zp.entity;

public class Appointment {
    private Integer aid;

    private Integer uid;

    private String patientid;

    private Integer mid;

    private String visittime;

    private Integer visitseq;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getVisittime() {
        return visittime;
    }

    public void setVisittime(String visittime) {
        this.visittime = visittime == null ? null : visittime.trim();
    }

    public Integer getVisitseq() {
        return visitseq;
    }

    public void setVisitseq(Integer visitseq) {
        this.visitseq = visitseq;
    }
}