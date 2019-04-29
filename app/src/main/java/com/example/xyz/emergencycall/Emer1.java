package com.example.xyz.emergencycall;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class Emer1 extends AppCompatActivity {

    private static final Object REQUEST_PHONE_CALL = 1;
    private int request_code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emer1);
    }

    public void call(View view) {


        if (ActivityCompat.checkSelfPermission(Emer1.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Emer1.this, new String[]{Manifest.permission.CALL_PHONE}, request_code);

        } else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            if (view.getId() == R.id.pol) {
                callIntent.setData(Uri.parse("tel:15"));//change the number
                startActivity(callIntent);
            }
            else if(view.getId() == R.id.amb) {
                callIntent.setData(Uri.parse("tel:115"));//change the number
                startActivity(callIntent);}
            else if(view.getId() == R.id.Fireb) {
                callIntent.setData(Uri.parse("tel:16"));//change the number
                startActivity(callIntent);}
            else if(view.getId() == R.id.traf) {
                callIntent.setData(Uri.parse("tel:915"));//change the number
                startActivity(callIntent);}
            else if(view.getId() == R.id.bombd) {
                callIntent.setData(Uri.parse("tel:02139212680"));//change the number
                startActivity(callIntent);}




            }

    }

    public void ambulan(View view) {
    }
}