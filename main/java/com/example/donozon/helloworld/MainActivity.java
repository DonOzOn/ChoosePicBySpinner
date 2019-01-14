package com.example.donozon.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private String arr[]={
            "Beckham",
            "Ronaldo",
            "Izaghi","None"};
    private Spinner spin;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Choose player");
        //Get spinner
        spin =(Spinner)findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);
        //add value to spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arr);
        //show list for spinner
        adapter.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        //Set adapter for spinenr
        spin.setAdapter(adapter);
        spin.setSelection(3);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (arr[position]) {
                    case "Beckham" :
                        imageView.setImageResource(R.drawable.beckham);
                        break;
                    case "Ronaldo" :
                        imageView.setImageResource(R.drawable.ronaldo);
                        break;
                    case "Izaghi"  :
                        imageView.setImageResource(R.drawable.izaghi);
                        break;
                    default        :
                         imageView.setImageResource(0);
                         break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                imageView.setImageResource(0);
            }
        });
        //set even for spinner
   //     spin.setOnItemClickListener(new adapter()) ;





    }


}
