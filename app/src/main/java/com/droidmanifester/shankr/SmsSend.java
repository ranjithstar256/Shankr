package com.droidmanifester.shankr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SmsSend extends AppCompatActivity {

    EditText editText, editText2;
    String s1, s2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_send);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        sharedPreferences = getSharedPreferences("naveen", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        textView = findViewById(R.id.textView4);
    }

    public void smsabc(View view) {
       /* s1=editText.getText().toString();
        s2=editText2.getText().toString();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(s1,null,s2,null,null);
 */

       s1=sharedPreferences.getString("ram","def val");
       s2=sharedPreferences.getString("sita","def val");

       textView.setText(s1+"\n"+s2);
    }
}
