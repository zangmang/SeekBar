package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * 이 함수는 액티비티가 실행될때 호출되는 함수 입니다.
 * 인텐트를 MainActivity 객체로 넘겨줍니다.
 * @param view 뷰클래스의 객체를 인자로 넘겨받습니다.
 * @return void 타입 입니다.
 * @warning 주의사항 없습니다.
 * @see
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar pb1;
        Button btnInc, btnDec;
        pb1=(ProgressBar) findViewById(R.id.progressBar1);
        btnInc=(Button) findViewById(R.id.btnInc);
        btnDec=(Button) findViewById(R.id.btnDec);

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.incrementProgressBy(10);
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.incrementProgressBy(10);
            }
        });

        final TextView tvSeek=(TextView) findViewById(R.id.tvSeek);
        SeekBar SeekBar1=(SeekBar) findViewById(R.id.SeekBar1);

        SeekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser){
                tvSeek.setText("진행률:"+ progress+" %");
            }
        })
    }
}
