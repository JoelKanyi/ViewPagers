package com.example.viewpagers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    List<Questions> quesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intiData();
        viewPager = findViewById(R.id.myViewpager);
         QuestionsAdapter adapter = new QuestionsAdapter(this,quesList);
         viewPager.setAdapter(adapter);
    }

    private void intiData(){
        quesList.add(new Questions("Do you have a fever","Yes","No"));
        quesList.add(new Questions("Do you have a headache","Yes","No"));
        quesList.add(new Questions("Do you have a backache","Yes","No"));
        quesList.add(new Questions("Do you have a toothache","Yes","No"));
        quesList.add(new Questions("Do you have a cough","Yes","No"));
        quesList.add(new Questions("Do you have a leg pain","Yes","No"));
        quesList.add(new Questions("Do you have a hand pain","Yes","No"));
        quesList.add(new Questions("Do you have a 1","Self","Other"));
        quesList.add(new Questions("Do you have a 2","Yes","No"));
        quesList.add(new Questions("Do you have a 3","Yes","No"));
        quesList.add(new Questions("Do you have a 3","Yes","No"));
        quesList.add(new Questions("Do you have a 4","Yes","No"));
        quesList.add(new Questions("Do you have a 5","Yes","No"));
    }
}