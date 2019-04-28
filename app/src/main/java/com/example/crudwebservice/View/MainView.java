package com.example.crudwebservice.View;

import com.example.crudwebservice.Model.getall.GetResponse;
import com.example.crudwebservice.Model.getid.GetItemResponse;

public interface MainView {
    void getSuccess(GetResponse list);

    void setToast(String message);

    void onError(String errorMessage);

    void onFailure(String failureMessage);

    void getSuccess2(GetItemResponse listItem);
}
