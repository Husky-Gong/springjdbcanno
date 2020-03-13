package com.zx.domain;

public class Company {
    private Integer id;
    private String region;
    private String tel;

    public Company(String region, String tele) {
        this.region = region;
        this.tel = tele;
    }

    public Company() {
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTele() {
        return tel;
    }

    public void setTele(String tele) {
        this.tel = tele;
    }

    @Override
    public String toString() {
        return "Company{" +
                "region='" + region + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
