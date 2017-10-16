package com.example.victor.apiyoutube;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import android.view.View;
import android.widget.*;

public class MainActivity extends YouTubeBaseActivity {

    Button b;
    private YouTubePlayerView youTubePlayerView;
     YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener(){
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b){
                youTubePlayer.loadVideo("w_Rql2RPaFc&t=867s");
            }
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult){

            }
        };
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                youTubePlayerView.initialize("AIzaSyA64ZF-SghOnjiJFygJvccnp-zd0Rkyl18",onInitializedListener);
            }

        });
    }
}
