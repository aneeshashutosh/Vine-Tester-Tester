package com.vine.android.vinetestertester;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

/**
 * @author aneeshashutosh
 */
public final class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        playVideo();
    }

    private final void playVideo() {
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        VideoView videoPlayer = (VideoView) findViewById(R.id.video_player);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_1);
        videoPlayer.setVideoURI(video);
        videoPlayer.start();
    }
}
