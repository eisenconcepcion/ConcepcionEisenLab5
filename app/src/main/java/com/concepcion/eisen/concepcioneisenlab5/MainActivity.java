package com.concepcion.eisen.concepcioneisenlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lab5","onCreate() has executed..");
        Intent i = new Intent(this,MyCustomService.class);
        startService(i);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lab5","onStart() has executed..");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lab5","onResume() has executed..");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lab5","onStop() has executed..");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lab5","onPause() has executed..");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lab5","onDestroy() has executed..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lab5","onRestart() has executed..");
    }



    public void process(View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.goToAct2){
            i = new Intent(this,Main2Activity.class);
            startActivity(i);
        }else if (v.getId() ==R.id.btnMapAct1){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.603359, 120.973502"));
            chooser = Intent.createChooser(i, "Select map app");
            startActivity(chooser);
        }
    }
}
