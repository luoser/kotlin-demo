package com.example.lisaluo.kotlinproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public final class MainActivity extends Activity {

    @BindView(R.id.emoji) ImageView emoji;
    @BindView(R.id.speaker_name) TextView name;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void configureWith(@NonNull final Person person) {
        // set the bigger emoji image

        // set the name

        // start the background color animation
    }

    @OnClick(R.id.lisa)
    public void dancerClicked() {
        configureWith(Person.LISA);
    }

    @OnClick(R.id.lisa)
    public void sleuthOrSpyClicked() {
        configureWith(Person.IZZY);
    }

    @OnClick(R.id.kevin)
    public void thinkingFaceClicked() {
        configureWith(Person.KEVIN);
    }
}
