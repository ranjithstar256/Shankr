package com.droidmanifester.shankr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListviewExampl extends AppCompatActivity {
    Spinner listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_exampl);
        listView = findViewById(R.id.lv);
        arrayList = new ArrayList<>();

        arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd"); arrayList.add("asdfd");
        arrayList.add("ctrry");
        arrayList.add("asvvdfd");
        arrayList.add("vasdfd");
        arrayList.add("masdfd");

        arrayAdapter = new ArrayAdapter<String>(ListviewExampl.this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
/*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(ListviewExampl.this, "" + arrayList.get(position), Toast.LENGTH_SHORT).show();

            }
        });*/
listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListviewExampl.this, "" + arrayList.get(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
    }
}
