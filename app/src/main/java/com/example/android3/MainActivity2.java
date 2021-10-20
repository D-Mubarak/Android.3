package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private Adapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Country> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        creatList();
        initRecucler();

    }

    private void creatList() {
        int id = getIntent().getIntExtra("key1", 1);
        if (111 == id) {
            arrayList.add(new Country(R.drawable.ic_kg, "Bishkek", ""));
        } else if (222 == id) {
            arrayList.add(new Country(R.drawable.ic_kz, "Nur-Sultan", "a"));
        } else if (333 == id) {
            arrayList.add(new Country(R.drawable.ic_kr, "Seoul", "b"));
        }else if(444 == id){
            arrayList.add(new Country(R.drawable.ic_jp, "Tokyo", "c"));
        }else if(555 == id){
            arrayList.add(new Country(R.drawable.ic_ru, "Moscow", "d"));
        }
    }

    private void initRecucler() {
        recyclerView = findViewById(R.id.r_of_continents);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);


    }
}