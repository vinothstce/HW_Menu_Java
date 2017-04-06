package com.internet.hw_menu_java;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (ConstraintLayout) findViewById(R.id.rl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,3, "RED");
        menu.add(0,1,0, "BLUE");
        menu.add(0,2,1, "GREEN");
        menu.add(0,3,2, "YELLOW");
        menu.add(0,4,8, "GRAY");
        menu.add(0,5,4, "PINK");
        menu.add(0,6,5, "WHITE");
        menu.add(0,7,7, "BLACK");
        menu.add(0,8,6, "CLOSE");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case 0:
                rl.setBackgroundColor(Color.RED);
                break;
            case 1:
                rl.setBackgroundColor(Color.BLUE);
                break;
            case 2:
                rl.setBackgroundColor(Color.GREEN);
                break;
            case 3:
                rl.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                rl.setBackgroundColor(Color.GRAY);
                break;
            case 5:
                rl.setBackgroundColor(Color.MAGENTA);
                break;
            case 6:
                rl.setBackgroundColor(Color.WHITE);
                break;
            case 7:
                rl.setBackgroundColor(Color.BLACK);
                break;
            case 8:
                finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
