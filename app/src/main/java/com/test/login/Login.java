package com.test.login;
 import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pushbots.push.Pushbots;

public class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Pushbots.sharedInstance().init(this);
		
		
        setContentView(R.layout.activity_login);
        Button clickButton = (Button) findViewById(R.id.email_sign_in_button);
        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                EditText email   = (EditText)findViewById(R.id.email);
                EditText password   = (EditText)findViewById(R.id.password);

                if(email.getText().toString().equals("john") && password.getText().toString().equals("demo")){
                    Intent show = new Intent(getApplicationContext(), Home.class);
                    Pushbots.sharedInstance().setAlias("john");
                    show.putExtra("name",email.getText().toString() );
                    startActivity(show);
                }else{
                    Toast.makeText(getApplicationContext(),"Login Failed!",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
