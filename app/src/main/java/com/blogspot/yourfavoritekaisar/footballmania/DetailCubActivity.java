package com.blogspot.yourfavoritekaisar.footballmania;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailCubActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cub);
        ButterKnife.bind(this);

        // TODO Mengubah textview dengan data dari halaman sebelumnya
        txtTitle.setText(getIntent().getStringExtra("nc"));
        txtDetail.setText(getIntent().getStringExtra("dc"));
        Glide.with(this).load(getIntent().getIntExtra("gc",0)).into(imgLogo);
    }
}
