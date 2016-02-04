package com.vine.android.vinetestertester;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.VideoView;

/**
 * @author aneeshashutosh
 */
public final class PlayerActivity extends AppCompatActivity {
    private Video video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Intent intent = getIntent();
        int position = intent.getIntExtra("id", -1);
        Log.e("id", "" + position);
        this.video = Globals.videos.get(position);

        playVideo();
    }

    private final void playVideo() {
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        VideoView videoPlayer = (VideoView) findViewById(R.id.video_player);
        Uri videoURI = Uri.parse("android.resource://" + getPackageName() + "/" + video.getVideoURL());
        videoPlayer.setVideoURI(videoURI);
        videoPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        videoPlayer.start();
    }
}
