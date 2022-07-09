package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.recycleview.model.Student;
import com.example.recycleview.model.StudentAdapter;

import java.util.ArrayList;

public class StaggeredGridLayoutActivity extends AppCompatActivity {

    private StudentAdapter adapter;
    private RecyclerView view;
    private ArrayList<Student> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_grid_layout);

        view = findViewById(R.id.RViewStudent);
        list = new ArrayList<>();
        for (int i =0;i<=20;i++){
            list.add(new Student("Student Name"+i , 1995 + (i % 2)));
        }
        adapter = new StudentAdapter(list,this);
        view.setAdapter(adapter);

        StaggeredGridLayoutManager gridLayoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        view.setLayoutManager(gridLayoutManager);
    }
}