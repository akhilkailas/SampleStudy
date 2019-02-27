package com.example.akhilkailas.samplestudy.retrofit;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmBody() {
        return mBody;
    }

    public void setmBody(String mBody) {
        this.mBody = mBody;
    }

    @SerializedName("id")
    private Integer mId;
    @SerializedName("title")
    private String mTitle;

    @SerializedName("body")
    private String mBody;

}
