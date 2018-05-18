package com.example.vignesh.womenfootwear;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vignesh on 18/5/18.
 */

public class Item extends MainActivity implements RecyclerViewAdapter.ItemListener{
    TextView tv1, tv2, tv3;
    String a, b, c;
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        tv1 = (TextView) findViewById(R.id.textView7);
        tv2 = (TextView) findViewById(R.id.textView8);
        tv3 = (TextView) findViewById(R.id.textView9);

        tv1.setText(a);
        tv2.setText(b);
        tv3.setText(c);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Item.this,"Added Succesfully",Toast.LENGTH_SHORT).show();
            }
        });

    }
}