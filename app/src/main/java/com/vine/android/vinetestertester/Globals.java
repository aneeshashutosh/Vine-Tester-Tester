package com.vine.android.vinetestertester;

import java.util.ArrayList;

/**
 * @author aneeshashutosh
 */
public class Globals {
    public static ArrayList<Video> videos = new ArrayList<Video>();

    public static void populateVideos() {
        videos = new ArrayList<Video>();
        for (int i = 0; i < 20; i++) {
            Video video = new Video();
            video.setCaption("Caption Text");
            video.setLikes(0);
            video.setFavs(0);
            video.setComments(new ArrayList<String>());

            videos.add(video);
        }

        videos.get(0).setVideoURL(R.raw.video_1);
        videos.get(0).setThumbnailURL(R.drawable.v01);

        videos.get(1).setVideoURL(R.raw.video_2);
        videos.get(1).setThumbnailURL(R.drawable.v02);

        videos.get(2).setVideoURL(R.raw.video_3);
        videos.get(2).setThumbnailURL(R.drawable.v03);

        videos.get(3).setVideoURL(R.raw.video_4);
        videos.get(3).setThumbnailURL(R.drawable.v04);

        videos.get(4).setVideoURL(R.raw.video_5);
        videos.get(4).setThumbnailURL(R.drawable.v05);

        videos.get(5).setVideoURL(R.raw.video_6);
        videos.get(5).setThumbnailURL(R.drawable.v06);

        videos.get(6).setVideoURL(R.raw.video_7);
        videos.get(6).setThumbnailURL(R.drawable.v07);

        videos.get(7).setVideoURL(R.raw.video_8);
        videos.get(7).setThumbnailURL(R.drawable.v08);

        videos.get(8).setVideoURL(R.raw.video_9);
        videos.get(8).setThumbnailURL(R.drawable.v09);

        videos.get(9).setVideoURL(R.raw.video_10);
        videos.get(9).setThumbnailURL(R.drawable.v10);

        videos.get(10).setVideoURL(R.raw.video_11);
        videos.get(10).setThumbnailURL(R.drawable.v11);

        videos.get(11).setVideoURL(R.raw.video_12);
        videos.get(11).setThumbnailURL(R.drawable.v12);

        videos.get(12).setVideoURL(R.raw.video_13);
        videos.get(12).setThumbnailURL(R.drawable.v13);

        videos.get(13).setVideoURL(R.raw.video_14);
        videos.get(13).setThumbnailURL(R.drawable.v14);

        videos.get(14).setVideoURL(R.raw.video_15);
        videos.get(14).setThumbnailURL(R.drawable.v15);

        videos.get(15).setVideoURL(R.raw.video_16);
        videos.get(15).setThumbnailURL(R.drawable.v16);

        videos.get(16).setVideoURL(R.raw.video_17);
        videos.get(16).setThumbnailURL(R.drawable.v17);

        videos.get(17).setVideoURL(R.raw.video_18);
        videos.get(17).setThumbnailURL(R.drawable.v18);

        videos.get(18).setVideoURL(R.raw.video_19);
        videos.get(18).setThumbnailURL(R.drawable.v19);

        videos.get(19).setVideoURL(R.raw.video_20);
        videos.get(19).setThumbnailURL(R.drawable.v20);
    }
}
