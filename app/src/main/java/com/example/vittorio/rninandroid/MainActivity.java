package com.example.vittorio.rninandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                if (Build.VERSION.SDK_INT >= 23) {
                    if(!Settings.canDrawOverlays(this)) {
                        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
                        startActivity(intent);
                        return;
                    } else {
                        //绘ui代码, 这里说明6.0系统已经有权限了
                    }
                } else {
                    //绘ui代码,这里android6.0以下的系统直接绘出即可
                }
                Intent intent = new Intent(MainActivity.this,MyReactActivity.class);
                startActivity(intent);
                break;
        }
    }

}
