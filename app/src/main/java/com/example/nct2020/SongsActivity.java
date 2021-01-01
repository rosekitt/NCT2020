package com.example.nct2020;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class SongsActivity extends AppCompatActivity {

    ImageButton imgBtnPlay1, imgBtnPlay2, imgBtnPlay3, imgBtnPlay4,
            imgBtnPlay5, imgBtnPlay6, imgBtnPlay7, imgBtnPlay8,
            imgBtnPlay9, imgBtnP1, imgBtnP2, imgBtnP3,
            imgBtnP4, imgBtnP5, imgBtnP6, imgBtnP7,
            imgBtnP8, imgBtnP9, imgBtnPl1,  imgBtnPl2,
            imgBtnPl3;
    MediaPlayer mp;

    public void onClickPlay(View v) { //onClick속성 이용하여 클릭 이벤트 처리
        if (mp != null && mp.isPlaying()) {
            mp.stop(); //재생 되고있다면 멈춤
            imgBtnPlay1.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay2.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay3.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay4.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay5.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay6.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay7.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay8.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPlay9.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP1.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP2.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP3.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP4.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP5.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP6.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP7.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP8.setImageResource(android.R.drawable.ic_media_play);
            imgBtnP9.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPl1.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPl2.setImageResource(android.R.drawable.ic_media_play);
            imgBtnPl3.setImageResource(android.R.drawable.ic_media_play);
            return;//다시 재생 할 수 있다는 이미지로 바꿔줌
        }

        if (v.getId() == R.id.imageButtonPlayLove) {
            Toast.makeText(getApplicationContext(), R.string.lovep, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.love); //mp에 love.mp3 저장
            imgBtnPlay1.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayMis) {
            Toast.makeText(getApplicationContext(), R.string.misp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.misfit);//mp에 misfit.mp3 저장
            imgBtnPlay2.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayRoof) {
            Toast.makeText(getApplicationContext(), R.string.roofp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.roof); //mp에 roof.mp3 저장
            imgBtnPlay3.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayVol) {
            Toast.makeText(getApplicationContext(), R.string.volp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.volcano);//mp에 volcano.mp3 저장
            imgBtnPlay4.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayBul) {
            Toast.makeText(getApplicationContext(), R.string.bulbp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.lightbulb);//mp에 lightbulb.mp3 저장
            imgBtnPlay5.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayDan) {
            Toast.makeText(getApplicationContext(), R.string.rainp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.dancingintherain);//mp에 dancingintherain.mp3 저장
            imgBtnPlay6.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayMy) {
            Toast.makeText(getApplicationContext(), R.string.myp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.myeverything);//mp에 myeverything.mp3 저장
            imgBtnPlay7.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayPast) {
            mp = MediaPlayer.create(getApplicationContext(), R.raw.past);//mp에 past.mp3 저장
            imgBtnPlay8.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayWish) {
            Toast.makeText(getApplicationContext(), R.string.wishp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.wish);//mp에 wish.mp3 저장
            imgBtnPlay9.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayDeja) {
            Toast.makeText(getApplicationContext(), R.string.dejap, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.dejavu);//mp에 deja vu.mp3 저장
            imgBtnP1.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayWay) {
            Toast.makeText(getApplicationContext(), R.string.wayvp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.nectar);//mp에 nectar.mp3 저장
            imgBtnP2.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayMusic) {
            Toast.makeText(getApplicationContext(), R.string.musicp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.musicdance);//mp에 musicdance.mp3 저장
            imgBtnP3.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayPia) {
            Toast.makeText(getApplicationContext(), R.string.pianop, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.piano);//mp에 piano.mp3 저장
            imgBtnP4.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayHome) {
            Toast.makeText(getApplicationContext(), R.string.homep, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.fromhome);//mp에 fromhome.mp3 저장
            imgBtnP5.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayHomeK) {
            Toast.makeText(getApplicationContext(), R.string.homekp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.fromhomekor);//mp에 fromhomekor.mp3 저장
            imgBtnP6.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayWishE) {
            Toast.makeText(getApplicationContext(), R.string.wishep, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.wisheng);//mp에 wisheng.mp4 저장
            imgBtnP7.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayPre) {
            mp = MediaPlayer.create(getApplicationContext(), R.raw.present);//mp에 present.mp3 저장
            imgBtnP8.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayIt) {
            Toast.makeText(getApplicationContext(), R.string.itp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.workit);//mp에 workit.mp3 저장
            imgBtnP9.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayAby) {
            Toast.makeText(getApplicationContext(), R.string.abyp, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.allaboutyou);//mp에 allaboutyou.mp3 저장
            imgBtnPl1.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayIou) {
            Toast.makeText(getApplicationContext(), R.string.ioup, Toast.LENGTH_LONG).show(); //곡에 참여한 멤버 이름 토스트창에 넣고 띄우기
            mp = MediaPlayer.create(getApplicationContext(), R.raw.iou);//mp에 iou.mp3 저장
            imgBtnPl2.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }
        else if (v.getId() == R.id.imageButtonPlayOut) {
            mp = MediaPlayer.create(getApplicationContext(), R.raw.outro);//mp에 outro.mp3 저장
            imgBtnPl3.setImageResource(android.R.drawable.ic_media_pause); //클릭 하자마자 pause버튼으로 바뀜
        }

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {  //재생 종료 이벤트 처리기 등록
            @Override
            public void onCompletion(MediaPlayer mp) {

                imgBtnPlay1.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay2.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay3.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay4.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay5.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay6.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay7.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay8.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPlay9.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP1.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP2.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP3.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP4.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP5.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP6.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP7.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP8.setImageResource(android.R.drawable.ic_media_play);
                imgBtnP9.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPl1.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPl2.setImageResource(android.R.drawable.ic_media_play);
                imgBtnPl3.setImageResource(android.R.drawable.ic_media_play);
                // 버튼 이미지를 media_play로 변경
                    Toast.makeText(getApplicationContext(), "END", Toast.LENGTH_LONG).show(); //"END"가 표시되는 토스트창 띄워줌
            }
        });
        mp.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        imgBtnPlay1 = findViewById(R.id.imageButtonPlayLove);
        imgBtnPlay2 = findViewById(R.id.imageButtonPlayMis);
        imgBtnPlay3 = findViewById(R.id.imageButtonPlayRoof);
        imgBtnPlay4 = findViewById(R.id.imageButtonPlayVol);
        imgBtnPlay5 = findViewById(R.id.imageButtonPlayBul);
        imgBtnPlay6 = findViewById(R.id.imageButtonPlayDan);
        imgBtnPlay7 = findViewById(R.id.imageButtonPlayMy);
        imgBtnPlay8 = findViewById(R.id.imageButtonPlayPast);
        imgBtnPlay9 = findViewById(R.id.imageButtonPlayWish);
        imgBtnP1 = findViewById(R.id.imageButtonPlayDeja);
        imgBtnP2 = findViewById(R.id.imageButtonPlayWay);
        imgBtnP3 = findViewById(R.id.imageButtonPlayMusic);
        imgBtnP4 = findViewById(R.id.imageButtonPlayPia);
        imgBtnP5 = findViewById(R.id.imageButtonPlayHome);
        imgBtnP6 = findViewById(R.id.imageButtonPlayHomeK);
        imgBtnP7 = findViewById(R.id.imageButtonPlayWishE);
        imgBtnP8 = findViewById(R.id.imageButtonPlayPre);
        imgBtnP9 = findViewById(R.id.imageButtonPlayIt);
        imgBtnPl1 = findViewById(R.id.imageButtonPlayAby);
        imgBtnPl2 = findViewById(R.id.imageButtonPlayIou);
        imgBtnPl3 = findViewById(R.id.imageButtonPlayOut);
    }

    @Override
    protected void onDestroy() { //액티비티가 소멸될 때 불려짐
        super.onDestroy();
        if(mp != null) {
            if(mp.isPlaying())
                mp.stop(); //재생을 멈춤
            mp.release(); //mp객체에 할당된 리소스 해제하기
        }
    }
}
