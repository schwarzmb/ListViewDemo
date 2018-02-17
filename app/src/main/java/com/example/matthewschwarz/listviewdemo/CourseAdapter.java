package com.example.matthewschwarz.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by matthewschwarz on 2/15/18.
 */

public class CourseAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Course> mDataSource;

    public CourseAdapter(Context context, ArrayList<Course> courses){
        mContext = context;
        mDataSource = courses;
        mInflator = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount(){
        return mDataSource.size();
    }

    @Override
    public Object getItem(int i){
        return mDataSource.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){
        View rowView = mInflator.inflate(android.R.layout.simple_expandable_list_item_2, viewGroup, false);

        TextView courseNumberView = rowView.findViewById(android.R.id.text1);
        TextView courseNameView = rowView.findViewById(android.R.id.text2);
        //TextView courseInstructorView = rowView.findViewById(android.R.id.text)

        Course course = (Course) getItem(position);
        courseNumberView.setText(course.getCourseNumber());
        courseNameView.setText(course.getCourseName());


        return rowView;
    }
}
