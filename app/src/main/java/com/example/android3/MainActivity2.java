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
            arrayList.add(new Country(R.drawable.ic_kg, "Capital of Kyrgyzstan:", "Bishkek"));
            arrayList.add(new Country(R.drawable.ic_kz, "Capital of Kazakhstan:", "Nur-Sultan"));
            arrayList.add(new Country(R.drawable.ic_kr, "Capital of Korea:", "Seoul"));
            arrayList.add(new Country(R.drawable.ic_jp, "Capital of Japan:", "Tokyo"));
            arrayList.add(new Country(R.drawable.ic_cn, "Capital if China:", "Beijing"));
            arrayList.add(new Country(R.drawable.ic_tr, "Capital of Turkey:", "Ankara"));
            arrayList.add(new Country(R.drawable.ic_uz, "Capital of Uzbekistan:", "Tashken"));
            arrayList.add(new Country(R.drawable.ic_ru, "Capital of Russia:", "Moscow"));
            arrayList.add(new Country(R.drawable.ic_gb, "Capital of Great Britain:", "London"));
            arrayList.add(new Country(R.drawable.ic_es, "Capital of Spain:щ", "Madrid"));

        } else if (222 == id) {
            arrayList.add(new Country(R.drawable.ic_eg, "Egypt", "Cairo"));
            arrayList.add(new Country(R.drawable.ic_tn, "Tunisia", "Tunisia"));
            arrayList.add(new Country(R.drawable.ic_mg, "Madagascar", "Cairo"));
            arrayList.add(new Country(R.drawable.ic_sd, "Sudan", "Khartoum"));
            arrayList.add(new Country(R.drawable.ic_ne, "Niger", "Abuja"));
            arrayList.add(new Country(R.drawable.ic_ly, "Libya", "Tripoli"));
            arrayList.add(new Country(R.drawable.ic_ro, "Chad", "N'Djamena"));
            arrayList.add(new Country(R.drawable.ic_ao, "Angola", "Luanda"));
            arrayList.add(new Country(R.drawable.ic_tn, "Tanzania", "Dodoma"));
            arrayList.add(new Country(R.drawable.ic_so, "Somalia", "Mogadishu"));


        } else if (333 == id) {

        } else if (444 == id) {

        } else if (555 == id) {

        } else if (666 == id) {

        }
    }

    private void initRecucler() {
        recyclerView = findViewById(R.id.r_of_continents);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);


    }
}