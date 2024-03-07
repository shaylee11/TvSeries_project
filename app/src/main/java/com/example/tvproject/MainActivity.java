package com.example.tvproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List <Model> list = new ArrayList<>();
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addData();
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,list,list.size());
        recyclerView.setAdapter(adapter);


    }

    private void addData() {
        list.add(new Model(R.drawable.alona,"Alona","Main Characters in seasons 1-3"));
        list.add(new Model(R.drawable.gery,"gery","Main Characters,a hamburger owner"));
        list.add(new Model(R.drawable.kobi,"kobi","Main Characters,band's guitarist"));
        list.add(new Model(R.drawable.ilan,"ilan","Main Characters,vocalist and keyboard player"));
        list.add(new Model(R.drawable.oded,"oded","Main Characters,band's drummer"));
        list.add(new Model(R.drawable.yamit,"yamit","Main Characters, singer"));
        list.add(new Model(R.drawable.dana,"dana","Main Characters in seasons 6-9,percussionist"));
        list.add(new Model(R.drawable.roni,"roni","Main Characters,Gery's daughter"));
        list.add(new Model(R.drawable.bracha,"bracha","Main Characters,the neighbor from above "));
        list.add(new Model(R.drawable.naji,"naji","Main Characters,sub-character of Kobi"));



    }
}