package com.example.nct2020;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.nct2020.R;

public class VideoActivity extends AppCompatActivity {
    VideoView v1,v2,v3,v4,v5,v6,v7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        v1 = findViewById(R.id.videoViewRes);
        v2 = findViewById(R.id.videoViewlove);
        v3 = findViewById(R.id.videoViewWork);
        v4 = findViewById(R.id.videoViewWish);
        v5 = findViewById(R.id.videoViewHome);
        v6 = findViewById(R.id.videoViewMisFit);
        v7 = findViewById(R.id.videoViewDejavu);
        //v1~v7까지의 id 속성값을 얻어옴

        v1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.resonance));
        v2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lovemv));
        v3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.workitmv));
        v4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wishmv));
        v5.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.homemv));
        v6.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.misfitmv));
        v7.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dejamv));
       //v1~v7까지의 각각 동영상의 URI 지정

        MediaController mc1 = new MediaController(v1.getContext());
        MediaController mc2 = new MediaController(v2.getContext());
        MediaController mc3 = new MediaController(v3.getContext());
        MediaController mc4 = new MediaController(v4.getContext());
        MediaController mc5 = new MediaController(v5.getContext());
        MediaController mc6 = new MediaController(v6.getContext());
        MediaController mc7 = new MediaController(v7.getContext());
        //미디어 컨트롤러 지정

        v1.setMediaController(mc1);
        v2.setMediaController(mc2);
        v3.setMediaController(mc3);
        v4.setMediaController(mc4);
        v5.setMediaController(mc5);
        v6.setMediaController(mc6);
        v7.setMediaController(mc7);
        //각각의 videoView 에 MediaController 셋팅하기


        v1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
            }
        });
        v2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
            }
        });
        v3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
            }
        });
        v4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
            }
        });
        v5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
            }
        });
        v6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
            }
        });
        v7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
            }
        });


    }

}






