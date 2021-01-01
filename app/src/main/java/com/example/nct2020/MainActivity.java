package com.example.nct2020;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void onClickLogo (View V) { //onClick 속성이용
        String str = getString(R.string.go);
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
        // } // 메인화면에서 로고이미지를 클릭하면 토스트창에 "TO THE WORLD 여긴 NCT!" 띄워짐
        Intent intentM = new Intent(getApplicationContext(), MenuActivity.class); //intentM 객체를 생성
        intentM.putExtra("page","menu"); //page의 값 menu을 부가 데이터로 넣기
        startActivity(intentM); //메뉴 화면으로 이동
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}