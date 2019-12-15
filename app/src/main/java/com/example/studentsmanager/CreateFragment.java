package com.example.studentsmanager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CreateFragment extends Fragment {
    private  Context CONTEXT;
    CreateFragment(Context ctx){
        super();
        CONTEXT = ctx;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup parent, @Nullable final Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_create, parent, false);
        Button createButton = view.findViewById(R.id.createButton);
        createButton.setText("Create");

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(CONTEXT, "creating", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        return view;
    }
}
