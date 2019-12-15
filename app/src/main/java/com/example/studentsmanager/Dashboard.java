package com.example.studentsmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        BottomNavigationView bnv = findViewById(R.id.btmNavBar);
        bnv.setOnNavigationItemSelectedListener(this);

        //Button createButton = findViewById(R.id.createButton);
        //createButton.setText("Create");
/*

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(),"creating",Toast.LENGTH_SHORT);
                t.show();
            }
        });*/
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.iFrame, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        Fragment fragment = null;
        switch(item.getItemId()) {
            case R.id.crud_create:
                fragment = new CreateFragment(getApplicationContext());
                break;
            case R.id.crud_view:
                fragment = new ViewFragment();
                break;
            case R.id.crud_update:
                fragment = new ModifyFragment();
                break;
            case R.id.crud_delete:
                fragment = new DeleteFragment(getApplicationContext());
                break;
        }

        return loadFragment(fragment);
    }
}
