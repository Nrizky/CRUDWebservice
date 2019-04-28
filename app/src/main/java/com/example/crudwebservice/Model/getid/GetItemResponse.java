package com.example.crudwebservice.Model.getid;


import com.google.gson.annotations.SerializedName;

public class GetItemResponse {

    @SerializedName("data")
    private Data data;

    @SerializedName("errors")
    private Object errors;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
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
                "GetItemResponse{" +
                        "data = '" + data + '\'' +
                        ",errors = '" + errors + '\'' +
                        "}";
    }
}