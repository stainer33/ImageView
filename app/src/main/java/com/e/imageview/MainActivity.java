package com.e.imageview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
RadioButton radioBtn1, radioBtn2, radioBtn3;
ImageView imgView;
AlertDialog.Builder AlertBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding

        radioBtn1 = findViewById(R.id.radioBtn1);
        radioBtn2=findViewById(R.id.radioBtn2);
        radioBtn3=findViewById(R.id.radioBtn3);
        imgView=findViewById(R.id.imgView);
        AlertBox=new AlertDialog.Builder( this);


radioBtn1.setOnClickListener(this);
radioBtn2.setOnClickListener(this);
radioBtn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.radioBtn1:
                AlertBox.setMessage("Do you want to load picture?")
                        .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                imgView.setImageResource(R.drawable.ichigo);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
              break;

            case R.id.radioBtn2:
                AlertBox.setMessage("Do you want to load picture?")
                        .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                imgView.setImageResource(R.drawable.pp);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                break;

            case R.id.radioBtn3:
                AlertBox.setMessage("Do you want to load picture?")
                        .setCancelable(false)
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            imgView.setImageResource(R.drawable.reaper);

                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                break;
        }
        AlertDialog alert = AlertBox.create();
        alert.setTitle("ddd");
        alert.show();
    }
}
