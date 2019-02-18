package ysn.com.linetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ysn.com.linetextview.view.LineTextLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LineTextLayout test1 = findViewById(R.id.test1);
        test1.post(new Runnable() {
            @Override
            public void run() {
                test1.setText("很多很多和华东数控单独看那时的你卡上的那颗那肯定是你看书看得");
            }
        });

        final LineTextLayout test2 = findViewById(R.id.test2);
        test1.post(new Runnable() {
            @Override
            public void run() {
                test2.setText("很多很多和华东数控得");
            }
        });
    }
}
