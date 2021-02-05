package de.hsba.app.lifecycledemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import de.hsba.app.lifecycledemo.listitem.ListItemClass;

public class MainActivity extends AppCompatActivity {
    ListItemClass listitem = new ListItemClass();
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.edit);

        Log.d("lifeCycle","onCreate");
        if (savedInstanceState!=null)
            Log.d("onRIS",savedInstanceState.getString("editText"));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String userInput = edit.getText().toString();
        outState.putString("editText", userInput);
        Log.d("lifeCycle","state saved");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("lifeCycle","state restored: "+savedInstanceState.getString("editText"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifeCycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifeCycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifeCycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("lifeCycle","onDestroy\n");
    }

    public void nextScreenClick(View view) {
        //Intent nextScreenIntent = new Intent(this,ActivityB.class);
        //startActivity(nextScreenIntent);
        finish();

    }
}