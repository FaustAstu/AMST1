package com.example.amst1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_Activity extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=6a7srENFcns"));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();

    }
}