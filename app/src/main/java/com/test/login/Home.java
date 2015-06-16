package com.test.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by amrsobhy on 6/16/15.
 */
public class Home extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        String name =getIntent().getStringExtra("name");
        TextView hello =(TextView)findViewById(R.id.helloworld);
        hello.setText("Hello " + name + "!");
    }

}
