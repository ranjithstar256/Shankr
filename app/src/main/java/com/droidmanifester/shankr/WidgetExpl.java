package com.droidmanifester.shankr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class WidgetExpl extends AppCompatActivity {
    RadioGroup radioGroup;
    String f;
    CheckBox m ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_expl);
        radioGroup=findViewById(R.id.som);
        m=findViewById(R.id.checkBox);
    }
    public void na(View view) {
        int l = radioGroup.getCheckedRadioButtonId();

        switch (l){
            case R.id.radioButton:
                f="Male";
                break;

            case R.id.radioButton2:
                f="Female";
                break;
        }

        Toast.makeText(this, m.isChecked()+" "+f, Toast.LENGTH_SHORT).show();
    }
}
