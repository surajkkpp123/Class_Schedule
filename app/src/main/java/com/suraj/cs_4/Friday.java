package com.suraj.cs_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class Friday extends AppCompatActivity {
   ListView lv;
    Button b1;
    String sub[]={"Programing Tools-II 8:00 to 11:00 in NET Lab","","Communication & Foundation 11:00 to 12:00 in LH-2","","Computer Organization 12:00 to 1:00 in NB-2","","Second half is empty"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);

        lv=(ListView)findViewById(R.id.list5);

        b1=(Button)findViewById(R.id.back5);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sub);
        lv.setAdapter(ad);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Friday.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
