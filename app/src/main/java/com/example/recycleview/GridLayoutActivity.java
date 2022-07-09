package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recycleview.model.Student;
import com.example.recycleview.model.StudentAdapter;

import java.util.ArrayList;

public class GridLayoutActivity extends AppCompatActivity {

    private StudentAdapter adapter;
    private RecyclerView view;
    private ArrayList<Student> list;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        view = findViewById(R.id.RViewStudent);
        bt = findViewById(R.id.bt2);
        list = new ArrayList<>();
        for (int i =0;i<=20;i++){
            list.add(new Student("Student Name"+i , 1995 + (i % 2)));
        }
        adapter = new StudentAdapter(list,this);
        view.setAdapter(adapter);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        view.setLayoutManager(gridLayoutManager);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GridLayoutActivity.this,StaggeredGridLayoutActivity.class);
                startActivity(intent);
            }
        });
    }

}