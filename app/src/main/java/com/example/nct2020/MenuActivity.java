package com.example.nct2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MenuActivity extends AppCompatActivity {


    public void onClickText(View v) {    //onClick 속성 이용
        int nId = v.getId();

        switch (nId) {
            case R.id.textViewM :
                Intent intentMem = new Intent(getApplicationContext(), MembersActivity.class); //명시적 intent사용
                startActivity(intentMem); //MEMBERS 소개 화면으로 이동
                break;
            case R.id.textViewA :
                Intent intentA = new Intent(getApplicationContext(), AlbumActivity.class); //명시적 intent사용
                startActivity(intentA); //ALBUM 소개 화면으로 이동
                break;
            case R.id.textViewP :
                Intent intentP = new Intent(getApplicationContext(), SongsActivity.class); //명시적 intent사용
                startActivity(intentP); //ALBUM 노래 듣기 화면으로 이동
                break;
            case R.id.textViewV :
                Intent intentV = new Intent(getApplicationContext(), VideoActivity.class); //명시적 intent사용
                startActivity(intentV); //Music Video 보기 화면으로 이동
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }
}