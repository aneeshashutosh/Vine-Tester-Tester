package com.vine.android.vinetestertester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * @author aneeshashutosh
 */
public final class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new FeedListAdapter(this));
    }
}
