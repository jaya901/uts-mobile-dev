package com.hikmah.wijayanti.model;

import com.google.gson.annotations.SerializedName;
@SuppressWarnings("unused")
public class DataModel {

    @SerializedName("id")
    private String mId;
    @SerializedName("nama")
    private String mNama;
    @SerializedName("jenis")
    private String mJenis;
    @SerializedName("stok")
    private String mStok;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmJenis() {
        return mJenis;
    }

    public void setmJenis(String mJenis) {
        this.mJenis = mJenis;
    }

    public String getmStok() {
        return mStok;
    }

    public void setmStok(String mStok) {
        this.mStok = mStok;
    }
}

