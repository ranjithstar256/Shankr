package com.droidmanifester.shankr;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.TextView;

public class Notificnclas extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificnclas);
        sharedPreferences=getSharedPreferences("gopi",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        textView=findViewById(R.id.textView2);
    }

    public void sw(View view) {
        // 1. create a Intent
        // 2. create a PendingIntent
        // 3. design Notification
        // 4. initilaze NotifivstionManager

        Intent intent = new Intent(this,SmsSend.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);

        Notification notification = new Notification.Builder(Notificnclas.this)
                .setSmallIcon(android.R.drawable.ic_media_play)
                .setContentTitle("New message received")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setContentText("message from Naveen")
                .build();

        NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(6,notification);
    }

    public void fghjk(View view) {
        String s1 = sharedPreferences.getString("ind","def val");
        String s2 = sharedPreferences.getString("india","def val");

        textView.setText(s1+"\n"+s2);
    }
}
