package com.example.vignesh.womenfootwear;
import android.content.Intent;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {
    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;
    TextView textView,textView1;
    TextView pop,new1,dis,low,high;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView)findViewById(R.id.textView3);
        textView1 = (TextView)findViewById(R.id.textView4);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    View view = getLayoutInflater().inflate(R.layout.fragment_bottom_sheet_dialog, null);

                    BottomSheetDialog dialog = new BottomSheetDialog(MainActivity.this);
                    dialog.setContentView(view);
                    dialog.show();
                pop=(TextView)view.findViewById(R.id.pop);
                new1=(TextView)view.findViewById(R.id.new1);
                dis=(TextView)view.findViewById(R.id.dis);
                low=(TextView)view.findViewById(R.id.low);
                high=(TextView)view.findViewById(R.id.high);

                pop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, com.example.vignesh.womenfootwear.pop.class);
                        startActivity(intent);
                    }
                });

                new1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, com.example.vignesh.womenfootwear.new1.class);
                        startActivity(intent);
                    }
                });

                dis.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, com.example.vignesh.womenfootwear.dis.class);
                        startActivity(intent);
                    }
                });

                low.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, com.example.vignesh.womenfootwear.l2h.class);
                        startActivity(intent);
                    }
                });

                high.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, com.example.vignesh.womenfootwear.h2l.class);
                        startActivity(intent);
                    }
                });
                }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,refine.class);
                startActivity(intent);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Price:200","Popularity:70%","Discount:20%", R.drawable.battle, "#09A9FF"));
        arrayList.add(new DataModel("Price:400","Popularity:84%", "Discount:15%",R.drawable.beer, "#3E51B1"));
        arrayList.add(new DataModel("Price:420","Popularity:82%","Discount:22%", R.drawable.ferrari, "#673BB7"));
        arrayList.add(new DataModel("Price:370","Popularity:80%", "Discount:10%",R.drawable.terraria, "#4BAA50"));
        arrayList.add(new DataModel("Price:190","Popularity:71%","Discount:30%", R.drawable.jetpack_joyride, "#F94336"));
        arrayList.add(new DataModel("Price:500","Popularity:89%","Discount:15%", R.drawable.battle, "#0A9B88"));
        arrayList.add(new DataModel("Price:270","Popularity:83%", "Discount:25%",R.drawable.beer, "#09A9FF"));
        arrayList.add(new DataModel("Price:480","Popularity:90%", "Discount:25%",R.drawable.ferrari, "#3E51B1"));
        arrayList.add(new DataModel("Price:330","Popularity:63%","Discount:18%", R.drawable.terraria, "#673BB7"));
        arrayList.add(new DataModel("Price:250","Popularity:70%", "Discount:20%",R.drawable.jetpack_joyride, "#4BAA50"));
        arrayList.add(new DataModel("Price:310","Popularity:79%", "Discount:25%",R.drawable.battle, "#F94336"));
        arrayList.add(new DataModel("Price:480","Popularity:95%", "Discount:33%",R.drawable.beer, "#0A9B88"));
        arrayList.add(new DataModel("Price:600","Popularity:88%", "Discount:22%",R.drawable.ferrari, "#4BAA50"));
        arrayList.add(new DataModel("Price:350","Popularity:79%", "Discount:18%",R.drawable.jetpack_joyride, "#F94336"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


/*
        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);*/


        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);



    }

    @Override
    public void onItemClick(DataModel item) {
        Item item1=new Item();
        item1.a=item.text;
        item1.b=item.text1;
        item1.c=item.text2;

        Intent intent=new Intent(MainActivity.this,Item.class);
        startActivity(intent);
    }
}