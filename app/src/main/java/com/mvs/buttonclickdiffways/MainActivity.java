package com.mvs.buttonclickdiffways;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button sendMail;
    private Button sendImage;
    private Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendMail = (Button) findViewById(R.id.button1);
        sendImage = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
       /* b1.setOnClickListener(new clickListener());
        b2.setOnClickListener(new clickListener());
        b3.setOnClickListener(new clickListener());*/
        sendMail.setOnClickListener(btnClickListener);
        sendImage.setOnClickListener(btnClickListener);
        b3.setOnClickListener(btnClickListener);

    }

   /* public void performClick(View view) {
        if(view.getId()==R.id.button1)
            Log.d("mvs","Button 1 was clicked");
    }*/

    private class clickListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            switch(v.getId())
            {
                case R.id.button1:
                    Log.d("mvs","Button 1 was clicked");break;
                case R.id.button2:
                    Log.d("mvs","Button 2 was clicked");break;
                case R.id.button3:
                    Log.d("mvs","Button 3 was clicked");break;
            }
        }
    }

    View.OnClickListener btnClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId())
            {
                case R.id.button1:
                    Log.d("mvs","Button 1 was clicked");break;
                case R.id.button2:
                    Log.d("mvs","Button 2 was clicked");break;
                case R.id.button3:
                    Log.d("mvs","Button 3 was clicked");break;
            }
        }
    };
}
