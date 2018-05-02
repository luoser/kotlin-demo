package com.example.lisaluo.kotlinproject;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public final class MainActivity extends Activity {

    @BindView(R.id.content) View content;
    @BindView(R.id.emoji) ImageView emoji;
    @BindView(R.id.speaker_name) TextView name;

    int currentColor;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        currentColor = Color.WHITE;
    }

    public void configureWith() {
        // set the bigger emoji image

        // set the name

        // start the background color animation
    }
}
