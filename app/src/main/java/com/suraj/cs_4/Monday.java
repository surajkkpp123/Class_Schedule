package com.suraj.cs_4;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Monday extends AppCompatActivity {

    ListView lv;
    Button b1;
    String []sub={"Graph Theory 8:00 to 10:00 in LH-2","","Communication & Foundation 10:00 to 11:00 in LH-2","","Computer Organization 11:00 to 1:00 in NB-2","","Automata & Compilers(Lab) 2:00 to 5:00 in CCTF"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        lv=(ListView)findViewById(R.id.list);

        b1=(Button)findViewById(R.id.back1);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sub);
        lv.setAdapter(ad);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Monday.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
