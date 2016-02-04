package com.vine.android.vinetestertester;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author aneeshashutosh
 */
public class FeedListAdapter extends BaseAdapter {
    private Activity activity;

    public FeedListAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return Globals.videos.size();
    }

    @Override
    public Object getItem(int position) {
        return Globals.videos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final Video video = (Video) getItem(position);

        View rowView = inflater.inflate(R.layout.list_item_feed, parent, false);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.feed_image);
        TextView faves = (TextView) rowView.findViewById(R.id.feed_faves);
        TextView caption = (TextView) rowView.findViewById(R.id.feed_caption);
        final Button fav = (Button) rowView.findViewById(R.id.feed_fav);

        imageView.setImageResource(video.getThumbnailURL());
        faves.setText(Integer.toString(video.getFavs()));
        caption.setText(video.getCaption());

        imageView.setOnClickListener(new View.OnClickListener() {
            private boolean pressed = false;

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PlayerActivity.class);
                intent.putExtra("id", position);
                activity.startActivity(intent);
            }
        });

        fav.setOnClickListener(new View.OnClickListener() {
            private boolean pressed = false;

            @Override
            public void onClick(View v) {
                if (pressed) {
                    video.decrementFavs();
                    fav.setBackgroundColor(0x000066);
                } else {
                    video.incrementFavs();
                    fav.setBackgroundColor(0x660000);
                }
                pressed = !pressed;
            }
        });

        return rowView;
    }
}
