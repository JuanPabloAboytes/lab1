package com.example.juanpablo.lab1jpan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        tv1 = (TextView)findViewById(R.id.tv1);
        String data = getIntent().getStringExtra("data");
        //Colocarlo dentro de nuestro tv1 que es nuestro text view que tengo
        tv1.setText("Hello "+ data);
    }

    public void Regresar(View view){
        Intent Main = new Intent(this, MainActivity.class);
        startActivity(Main);
    }

}
