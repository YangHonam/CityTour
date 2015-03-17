package com.example.yanghonam.citytour;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button btn_place1, btn_place2, btn_place3, btn_place4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_place1 = (Button)findViewById(R.id.button_place1);
        btn_place1.setOnClickListener(this);
        btn_place2 = (Button)findViewById(R.id.button_place2);
        btn_place2.setOnClickListener(this);
        btn_place3 = (Button)findViewById(R.id.button_place3);
        btn_place3.setOnClickListener(this);
        btn_place4 = (Button)findViewById(R.id.button_place4);
        btn_place4.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_place1 :
                Intent plc1 = new Intent(this, Place1Activity.class);
                startActivity(plc1);
                break;
            case R.id.button_place2 :
                Intent plc2 = new Intent(this, Place2Activity.class);
                startActivity(plc2);
                break;
            case R.id.button_place3 :
                Intent plc3 = new Intent(this, Place3Activity.class);
                startActivity(plc3);
                break;
            case R.id.button_place4 :
                Intent plc4 = new Intent(this, Place4Activity.class);
                startActivity(plc4);
                break;
        }
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
