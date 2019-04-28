package com.example.crudwebservice.Model.update;


import com.google.gson.annotations.SerializedName;


public class UpdateResponse {

    @SerializedName("data")
    private Object data;

    @SerializedName("errors")
    private String errors;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return
                "UpdateResponse{" +
                        "data = '" + data + '\'' +
                        ",errors = '" + errors + '\'' +
                        "}";
    }
}