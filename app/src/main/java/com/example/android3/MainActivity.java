package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Country> arrayList;
    private Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFlags();
        initrv();
        setClick();
        createRegion();

    }

    private void createRegion() {

    }

    private void setClick() {
        adapter.setListener(new Listener() {
            @Override
            public void onClick(Country country) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("key1", country.getId());
                startActivity(intent);
            }
        });
    }



    private void createFlags() {
        arrayList = new ArrayList<>();
        arrayList.add(new Country(R.drawable.ic_kg,"Kyrgyzstan","Bishkek", 111));
        arrayList.add(new Country(R.drawable.ic_kz,"Kazakhstan","Nur-Sultan", 222));
        arrayList.add(new Country(R.drawable.ic_kr,"Korea","Seoul", 333));
        arrayList.add(new Country(R.drawable.ic_jp,"Japan","Tokyo",444));
        arrayList.add(new Country(R.drawable.ic_ru,"Russia","Moscow",555));

    }

    private void initrv() {
        recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);
    }


}