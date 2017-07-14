package com.zp.entity;

public class Dept {
    private Integer did;

    private String dname;

    private String dspec;

    private Integer pdid;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDspec() {
        return dspec;
    }

    public void setDspec(String dspec) {
        this.dspec = dspec == null ? null : dspec.trim();
    }

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid(Integer pdid) {
        this.pdid = pdid;
    }
}