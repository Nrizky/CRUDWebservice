package com.example.crudwebservice.Model.getall;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class GetResponse {

    @SerializedName("data")
    private List<DataItem> data;

    @SerializedName("errors")
    private Object errors;

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return
                "GetResponse{" +
                        "data = '" + data + '\'' +
                        ",errors = '" + errors + '\'' +
                        "}";
    }
}