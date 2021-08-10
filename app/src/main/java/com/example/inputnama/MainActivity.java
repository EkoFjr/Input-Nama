package com.example.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText inputname;
    TextView hasil;
    Button tampil,hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputname = (EditText) findViewById(R.id.inputnama);
        hasil = (TextView) findViewById(R.id.tampilan);
        tampil = (Button) findViewById(R.id.button);
        hapus = (Button) findViewById(R.id.button2);

        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                hasil.setText("Nama Anda : "+inputname.getText());
            }
        });

        hapus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputname.setText("");
                hasil.setText("");
            }
        });

    }


}