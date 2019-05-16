package com.example.inikuiss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerMinum extends AppCompatActivity {



    List<Minuman> minumanList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //adding some items to our list
        minumanList.add(
                new Minuman(
                        1,
                        "Frappucino",
                        "Kopi yang mehong",
                        5.0,
                        100000,
                        R.drawable.frap));

        minumanList.add(
                new Minuman(
                        1,
                        "Es The",
                        "Minuman untuk rakyat jelata",
                        5.0,
                        8000,
                        R.drawable.teh));

        minumanList.add(
                new Minuman(
                        1,
                        "Es Jeruk",
                        "Minuman untuk rakyat jelata yang sedikit ke atas",
                        3.0,
                        10000,
                        R.drawable.jeruk));
        minumanList.add(
                new Minuman(
                        1,
                        "Es mangga",
                        "Minuman orang misqueen yang ingin sehat",
                        3.0,
                        10000,
                        R.drawable.mangga
                ));
        minumanList.add(
                new Minuman(
                        1,
                        "ES Degan",
                        "Minuman Pinggir jalan yang menyegarkan ",
                        3.0,
                        10000,
                        R.drawable.degan
                )
        );

        minumanList.add(
                new Minuman(
                        1,
                        "Es Jambu",
                        "Es yang enak dan mantap",
                        3.0,
                        10000,
                        R.drawable.jambu
                )
        );

        MinumanAdapter adapterMinuman = new MinumanAdapter(this,minumanList);
        recyclerView.setAdapter(adapterMinuman);
    }

}

