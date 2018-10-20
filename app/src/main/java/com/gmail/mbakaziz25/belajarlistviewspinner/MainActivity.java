package com.gmail.mbakaziz25.belajarlistviewspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listBuah;
    String DaftarBuah[] = {"Pepaya", "Mangga", "Pisang", " Jambu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listBuah = (ListView)findViewById(R.id.listview); // mengkoneksikan adapter

        ArrayAdapter<String>arrayAdapter =
                new ArrayAdapter<String>(this, // akan dimasukan dalam class main activity
                        R.layout.list_item, R.id.textView, DaftarBuah); // menampilkan daftar buah pada array
        listBuah.setAdapter(arrayAdapter);
    }
}
