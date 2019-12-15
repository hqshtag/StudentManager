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

public class DeleteFragment extends Fragment {

    private Context CONTEXT;


    DeleteFragment(Context ctx){
        super();
        CONTEXT = ctx;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_delete, parent, false);
        Button deleteButton = view.findViewById(R.id.deleteButton);
        deleteButton.setText("Delete");

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(CONTEXT, "deleting", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        return view;    }
}
