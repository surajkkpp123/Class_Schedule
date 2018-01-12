package com.suraj.cs_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Tuesday extends AppCompatActivity {

    ListView lv;
    Button b1;
    String [] sub={"Communication & Foundation 9:00 to 10:00 in LH-2","","Cont. issues in IT 10:00 to 12:00 in FC-5","","Automata Theory 2:00 to 4:00 in SMS(LH-3)","","Analysis of Algorithm 4:00 to 5:00 in NB-2","","Graph Theory 5:00 to 6:00 in FC-5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);

        lv=(ListView)findViewById(R.id.list2);

        b1=(Button)findViewById(R.id.back2);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sub);
        lv.setAdapter(ad);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Tuesday.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
