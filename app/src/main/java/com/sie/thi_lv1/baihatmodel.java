package com.sie.thi_lv1;

/**
 * Created by Sie on 5/8/2018.
 */

public class baihatmodel {
    private String Tenbaihat;
    private String TacGia;

    public baihatmodel(String tenbaihat, String tacGia) {
        Tenbaihat = tenbaihat;
        TacGia = tacGia;
    }

    public baihatmodel() {
    }

    public String getTenbaihat() {
        return Tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        Tenbaihat = tenbaihat;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }
}
