package com.suraj.cs_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Thursday extends AppCompatActivity {
   ListView lv;
    Button b1;
    String sub[]={"Basic Electronics lab 10:00 to 1:00 in Ground Floor","","Automata Theory 2:00 to 4:00 in SMS(LH-3)","","Analysis of Algorithm 4:00 to 6:00 in NB-1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);

        lv=(ListView)findViewById(R.id.list4);

        b1=(Button)findViewById(R.id.back4);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sub);
        lv.setAdapter(ad);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Thursday.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
