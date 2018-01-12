package com.suraj.cs_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Wednesday extends AppCompatActivity {
  ListView lv;
    Button b1;
    String []sub={"First half empty","","Analysis of Algorithm(LAb) 2:00 to 5:00 in UG(lab)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);

        lv=(ListView)findViewById(R.id.list3);

        b1=(Button)findViewById(R.id.back3);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sub);
        lv.setAdapter(ad);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Wednesday.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
