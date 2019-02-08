package com.example.juanpablo.lab1jpan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class TargetActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        tv1 = (TextView)findViewById(R.id.tv1);
        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.elmo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        String data = getIntent().getStringExtra("data");
        //Colocarlo dentro de nuestro tv1 que es nuestro text view que tengo
        tv1.setText("Hello "+ data);
    }

    public void Regresar(View view){
        Intent Main = new Intent(this, MainActivity.class);
        startActivity(Main);
    }

}
