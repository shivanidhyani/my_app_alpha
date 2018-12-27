package com.azurewebsites.httpsinnovation21.alpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



    }

    public void openlogin(View v) {
        setContentView(R.layout.login);
    }
    public void opensignup(View v){ setContentView(R.layout.activity_signup);}
    public void screen2(View v) { setContentView(R.layout.s1);}
    public void screen3(View v) { setContentView(R.layout.s3);}

}
