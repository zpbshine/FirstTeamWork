package com.example.administrator.testvoice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        King.init(getApplication());
        Button btn = (Button) findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final List<String> list = new VoiceTemplate()
                        .prefix("success")
                        .numString("22.54")
                        .suffix("yuan")
                        .gen();

                VoiceSpeaker.getInstance().speak(list);
            }
        });
    }
}
