package com.example.vignesh.womenfootwear;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {
    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Item 1", R.drawable.a, "#09A9FF"));
        arrayList.add(new DataModel("Item 2", R.drawable.b, "#3E51B1"));
        arrayList.add(new DataModel("Item 3", R.drawable.c, "#673BB7"));
        arrayList.add(new DataModel("Item 4", R.drawable.d, "#4BAA50"));
        arrayList.add(new DataModel("Item 5", R.drawable.e, "#F94336"));
        arrayList.add(new DataModel("Item 6", R.drawable.f, "#0A9B88"));
        arrayList.add(new DataModel("Item 7", R.drawable.g, "#09A9FF"));
        arrayList.add(new DataModel("Item 8", R.drawable.h, "#3E51B1"));
        arrayList.add(new DataModel("Item 9", R.drawable.i, "#673BB7"));
        arrayList.add(new DataModel("Item 10", R.drawable.j, "#4BAA50"));
        arrayList.add(new DataModel("Item 11", R.drawable.k, "#F94336"));
        arrayList.add(new DataModel("Item 12", R.drawable.l, "#0A9B88"));
        arrayList.add(new DataModel("Item 13", R.drawable.m, "#4BAA50"));
        arrayList.add(new DataModel("Item 14", R.drawable.n, "#F94336"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


        /**
         AutoFitGridLayoutManager that auto fits the cells by the column widt defined.
         **/

        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);


        /**
         Simple GridLayoutManager that spans two columns
         **/
        /*GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);*/
    }

    @Override
    public void onItemClick(DataModel item) {

        Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();

    }
}