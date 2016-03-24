package main.tempcon.com.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText message_text;
    public final static String MESSAGE_KEY = "main.tempcon.com.demoapp.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        message_text = (EditText)findViewById(R.id.message_text);
        String message = message_text.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        //Attach data and it has to be in the form of key-value pair
        intent.putExtra(MESSAGE_KEY, message);

        startActivity(intent);



    }
}
