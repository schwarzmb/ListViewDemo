package com.example.matthewschwarz.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);

        Course course;
        ArrayList<Course> courses = new ArrayList<>();

        course = new Course();
        course.setCourseName("Operating Systems");
        course.setCourseNumber("CSCI340");
        course.setInstructor("Dr. Munsell");
        courses.add(course);

        course = new Course();
        course.setCourseName("Software Engineering");
        course.setCourseNumber("CSCI362");
        course.setInstructor("Dr. Bowring");
        courses.add(course);

        course = new Course();
        course.setCourseName("Advanced Algorithms");
        course.setCourseNumber("CSCI 310");
        course.setInstructor("Dr. Van Delden");
        courses.add(course);

        //String[] classes = {"CSCI230", "Biology", "Golf", "CSCI310"};
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, classes);

        CourseAdapter adapter = new CourseAdapter(this, courses);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Short Click", Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Looooooong Click", Toast.LENGTH_SHORT).show();
                //return false;
                return true;
            }
        });
    }
}
