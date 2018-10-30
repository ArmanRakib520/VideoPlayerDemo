package com.example.noman.videoplayerdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.VideoViewID);

        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.animation);
        videoView.setVideoURI(uri);

        mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
