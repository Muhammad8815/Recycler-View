package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    String[] name={"Muhammad","Ali","Ahmed","Sohaib","Haseeb","Ibrahim","Muhammad","Ali","Ahmed","Sohaib","Haseeb","Ibrahim","Muhammad","Ali","Ahmed","Sohaib","Haseeb","Ibrahim"};
    int[] images={R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        myAdapter=new MyAdapter(MainActivity.this,name,images);
        recyclerView.setAdapter(myAdapter);
    }
}