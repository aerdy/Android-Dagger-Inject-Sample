package com.necisstudio.danger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.necisstudio.danger.manage.ConfigApp;
import com.necisstudio.danger.utils.NetworkApi;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    NetworkApi networkApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((ConfigApp) getApplication()).getComponent().inject(this);

        boolean injected =  networkApi == null ? false : true;
        Log.e("data",String.valueOf(injected));
    }
}
