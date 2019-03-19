package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport{
    private int id;
    private String ProvinceName;
    private int ProvinceCode;
    public int getId(){
     return id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getProvinceName(){
        return ProvinceName;

    }
    public void setProvinceName(String provinceName){
        this.ProvinceName=provinceName;
    }
    public int getProvinceCode(){
        return ProvinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.ProvinceCode=provinceCode;
    }
}