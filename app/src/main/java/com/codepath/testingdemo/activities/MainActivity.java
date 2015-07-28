package com.codepath.testingdemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codepath.testingdemo.R;

/*
 * Launch other activities from this activity
 */
public class MainActivity extends GameLevelActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchAsyncTaskActivity(View view) {
        launchActivity(AsyncTaskActivity.class);
    }

    public void launchRecyclerViewActivity(View view) {
        launchActivity(RecyclerViewActivity.class);
    }

    public void launchSearchHistoryActivity(View view) {
        launchActivity(SearchHistoryActivity.class);
    }

    public void launchLocalizedActivity(View view) {
        launchActivity(LocalizedActivity.class);
    }


    private void launchActivity(Class klass) {
        Intent intent = new Intent(this, klass);
        startActivity(intent);
    }

    public void launchFirstActivity(View view) {
        Intent intent = new Intent(this, IntentOneActivity.class);
        intent.putExtra(IntentOneActivity.EXTRA_MESSAGE, "First Activity");
        startActivity(intent);
    }

    public void launchDemo(View view) {
        launchActivity(EspressoDemoActivity.class);
    }

    public void launchGame(View view) {
        launchLevelPassedActivity();
    }
}
