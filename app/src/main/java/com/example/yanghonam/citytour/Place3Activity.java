package com.example.yanghonam.citytour;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

/**
 * Created by Yanghonam on 2015. 3. 17..
 */
public class Place3Activity extends Activity implements OnClickListener {

    Button btn_map, btn_info;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place3);

        btn_map = (Button)findViewById(R.id.button_mapit);
        btn_map.setOnClickListener(this);
        btn_info = (Button)findViewById(R.id.button_info);
        btn_info.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_mapit :
                break;
            case R.id.button_info :
                break;
        }
    }
}
