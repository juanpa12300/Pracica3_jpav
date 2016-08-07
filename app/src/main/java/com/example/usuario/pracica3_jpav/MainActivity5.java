package com.example.usuario.pracica3_jpav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.database.Cursor;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity5 extends Activity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button boton3= (Button) findViewById(R.id.button3);
        boton3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

}
