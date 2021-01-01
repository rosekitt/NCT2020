package com.example.nct2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ImageView imgPartOne = findViewById(R.id.imageViewP1); //이미지뷰를 사용하기 위해 findViewById 메소드를 통해 xml에서 id값을 찾은 후 imgPartOne 변수에 할당.
        ImageView imgPartTwo = findViewById(R.id.imageViewP2); //이미지뷰를 사용하기 위해 findViewById 메소드를 통해 xml에서 id값을 찾은 후 imgPartTwo 변수에 할당.




        View.OnClickListener ocl = new View.OnClickListener() {//익명 클래스로 구현: 개체생성과 클래스 정의를 동시에 함
            @Override
            public void onClick(View view) {  //onClick 속성 이용
                if(view.getId() == R.id.imageViewP1) {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.smtownandstore.com/product/nct-the-2nd-album-resonance-pt1random-cover-ver/8428/category/148/display/1/")); //암시적 intent사용
                    startActivity(intent1);
                }//imageViewP1 클릭하면 Part.1 앨범 공식 판매 사이트로 이동
                else {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.smtownandstore.com/product/nct-the-2nd-album-resonance-pt2-departure-ver/9018/category/53/display/1/"));//암시적 intent사용
                    startActivity(intent2);
                }//imageViewP2 클릭하면 Part.2 앨범 공식 판매 사이트로 이동
            }
        };

        imgPartOne.setOnClickListener(ocl); //클릭 이벤트를 처리하고자 imgPartOne의 이벤트 리스너로 등록
        imgPartTwo.setOnClickListener(ocl); //클릭 이벤트를 처리하고자 imgPartTwo의 이벤트 리스너로 등록
    }
}



