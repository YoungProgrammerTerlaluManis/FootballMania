package com.blogspot.yourfavoritekaisar.footballmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerActivity extends AppCompatActivity {
    // TODO 1 Mengenerate butterknife untuk recyclerview
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;


    // TODO 2 Membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada values
        String[] namaClub,detailCLub;
        int[] gambarClub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ButterKnife.bind(this);

        // TODO 3 mengisi variable array dari folder res -> strings,drawable
        namaClub = getResources().getStringArray(R.array.club_name);
        detailCLub = getResources().getStringArray(R.array.club_detail);
        gambarClub = new int[]{R.drawable.img_barca,R.drawable.img_madrid,R.drawable.img_bayern,R.drawable.img_city
        ,R.drawable.img_mu,R.drawable.img_chelsea,R.drawable.img_acm,R.drawable.img_arsenal};

        // TODO 4 Membuat Object adapter dan mengirim data nama,detail,dan gambar ke adapter
        adapter adapter = new adapter(RecyclerActivity.this, gambarClub, namaClub, detailCLub);
        // TODO 5 Mensetting recyclerview dan mengeset recycleview dengan adapter
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
        myRecyclerView.setAdapter(adapter);
    }
}
