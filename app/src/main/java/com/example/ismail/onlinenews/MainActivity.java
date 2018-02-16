package com.example.ismail.onlinenews;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bdnews(View view){
        Intent bdnewsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bangla.bdnews24.com/"));
        startActivity(bdnewsIntent);
    }

    public void prothomalo(View view){
        Intent prothomaloIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.prothom-alo.com/"));
        startActivity(prothomaloIntent);
    }

    public void ittefaq(View view){
        Intent ittefaqIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ittefaq.com.bd/"));
        startActivity(ittefaqIntent);
    }

    public void amardesh(View view){
        Intent amardeshIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amardeshonline.com/"));
        startActivity(amardeshIntent);
    }

    public void samakal(View view){
        Intent samakalIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://samakal.com/"));
        startActivity(samakalIntent);
    }

    public void kalerkantho(View view){
        Intent kalerkanthoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kalerkantho.com/"));
        startActivity(kalerkanthoIntent);
    }

    public void jugantor(View view){
        Intent jugantorIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jugantor.com/"));
        startActivity(jugantorIntent);
    }

    public void janakantha(View view){
        Intent janakanthaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dailyjanakantha.com/"));
        startActivity(janakanthaIntent);
    }

    public void inqilab(View view){
        Intent inqilabIntetnt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dailyinqilab.com/"));
        startActivity(inqilabIntetnt);
    }

    public void manabkantha(View view){
        Intent manabkanthaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.manobkantha.com/"));
        startActivity(manabkanthaIntent);
    }
}
