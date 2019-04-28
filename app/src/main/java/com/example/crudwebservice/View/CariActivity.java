package com.example.crudwebservice.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.crudwebservice.Model.getall.GetResponse;
import com.example.crudwebservice.Model.getid.Data;
import com.example.crudwebservice.Model.getid.GetItemResponse;
import com.example.crudwebservice.Presenter.MainPresenter;
import com.example.crudwebservice.R;

import java.util.List;

public class CariActivity extends AppCompatActivity implements MainView {
    EditText cari;
    Button cari_btn;
    TextView tv_1, tv_2, tv_3;
    MainPresenter mainPresenter;
    private List<Data> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);
        cari = findViewById(R.id.ET_1);
        cari_btn = findViewById(R.id.btn_cari);
        tv_1 = findViewById(R.id.tv_id_cari);
        tv_2 = findViewById(R.id.tv_name_cari);
        tv_3 = findViewById(R.id.tv_description_cari);
        final String cari_id = cari.getText().toString();
        cari_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void getSuccess(GetResponse list) {

    }

    @Override
    public void setToast(String message) {

    }

    @Override
    public void onError(String errorMessage) {

    }

    @Override
    public void onFailure(String failureMessage) {

    }

    @Override
    public void getSuccess2(GetItemResponse body) {

    }

}
