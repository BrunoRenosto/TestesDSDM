package com.example.testesdsdm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num;
    int total;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void teste(View view) {
        Toast toast = Toast.makeText(this,"texto",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void menos(View view){
        TextView textView = findViewById(R.id.texto);
        if(num > 0){
        num--;
        total = num * 3;
        }

        textView.setText("" + num);
        TextView textView2 = findViewById(R.id.total);
        textView2.setText("Preço Total:" + total);
    }

    public void mais(View view){
        TextView cafe = findViewById(R.id.texto);
        TextView soma = findViewById(R.id.total);
        num++;
        total = num * 3;
        cafe.setText("" + num);
        soma.setText("Preço Total:" + total);
    }
}

