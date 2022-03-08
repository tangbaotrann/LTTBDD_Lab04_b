package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import adapter.ElectronicAdapter;
import model.Electronic;

public class MainActivity extends AppCompatActivity {

    private List<Electronic> listElectronic;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.idGridview);
        listElectronic = new ArrayList<>();
        listElectronic.add(new Electronic(1, "Cáp chuyển từ Cổng USB sang PS2...", "69.900 đ", "-39%"));
        listElectronic.add(new Electronic(2, "Cáp chuyển từ Cổng USB sang PS2...", "69.900 đ", "-39%"));
        listElectronic.add(new Electronic(3, "Cáp chuyển từ Cổng USB sang PS2...", "69.900 đ", "-39%"));
        listElectronic.add(new Electronic(4, "Cáp chuyển từ Cổng USB sang PS2...", "69.900 đ", "-39%"));
        listElectronic.add(new Electronic(5, "Cáp chuyển từ Cổng USB sang PS2...", "69.900 đ", "-39%"));
        listElectronic.add(new Electronic(6, "Cáp chuyển từ Cổng USB sang PS2...", "69.900 đ", "-39%"));

        ElectronicAdapter adapter = new ElectronicAdapter(this, R.layout.item_custom_grid_view, listElectronic);
        gridView.setAdapter(adapter);
    }
}