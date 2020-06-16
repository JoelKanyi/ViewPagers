package com.example.viewpagers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class QuestionsAdapter extends PagerAdapter {

    Context context;

    public QuestionsAdapter(Context context, List<Questions> questionsList) {
        this.context = context;
        this.questionsList = questionsList;
    }

    List<Questions> questionsList;


    @Override
    public int getCount() {
        return questionsList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        final View view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false);


        TextView question = view.findViewById(R.id.txtQuestion);
        Button option1 = view.findViewById(R.id.option1);
        Button option2 = view.findViewById(R.id.option2);

        question.setText(questionsList.get(position).getQuestion());
        option1.setText(questionsList.get(position).getOption1());
        option2.setText(questionsList.get(position).getOption2());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,""+questionsList.get(position).getQuestion(),
                        Toast.LENGTH_SHORT).show();

                }
        });

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,""+questionsList.get(position).getOption1(),
                        Toast.LENGTH_LONG).show();
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,""+questionsList.get(position).getOption2(),
                        Toast.LENGTH_LONG).show();
            }
        });

        container.addView(view);
        return  view;
    }

}
