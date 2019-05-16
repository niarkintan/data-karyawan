package com.example.inikuiss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {



    List<Makanan> makananList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //adding some items to our list
        makananList.add(
                new Makanan(
                        1,
                        "Pizza Enak Yuhuuu",
                        "Makanan Kesukaan kita semua",
                        5.0,
                        150000,
                        R.drawable.pitza));

        makananList.add(
                new Makanan(
                        1,
                        "Pasta Ismitewa",
                        " Pasta Kesukaan Aq",
                        5.0,
                        80000,
                        R.drawable.pasta));

        makananList.add(
                new Makanan(
                        1,
                        "Pancake Menggoda Selora semuaa orang",
                        "cocok untuk sarapan orang yg tidak missqueen",
                        3.0,
                        30000,
                        R.drawable.penkek));
        makananList.add(
                new Makanan(
                        1,
                        "Waffle Mantap",
                        "Desser enak dan lezat",
                        3.0,
                        50000,
                        R.drawable.wafel
                ));
        makananList.add(
                new Makanan(
                        1,
                        "Burger ",
                        "Roti isi daging enak mantap",
                        3.0,
                        10000,
                        R.drawable.burger
                )
        );
        makananList.add(
                new Makanan(
                        1,
                        "Ice Cream Cake ",
                        "Dessert yang sungguh menggoda lidahh",
                        3.0,
                        20000,
                        R.drawable.kek
                )
        );

        MakananAdapter adapterMakanan = new MakananAdapter(this,makananList);
        recyclerView.setAdapter(adapterMakanan);
    }

}


