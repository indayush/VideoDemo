package com.example.ayushadarsh.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demo);
        // To locate the video directory

        MediaController mediaController = new MediaController(this);
        // TO get device default Media Controller for the video navigation

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);
        videoView.start();

    }
}
