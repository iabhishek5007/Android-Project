package com.ontrack.ontrack_faq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView rvFaqActivity;

    List<QnA> QuestionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFaqActivity = findViewById(R.id.recyclerView);

        initData();
        initRecyclerView();
    }


    private void initRecyclerView() {
        QnAAdapter qnAAdapter = new QnAAdapter(QuestionList);
        rvFaqActivity.setLayoutManager(new LinearLayoutManager(this));
        rvFaqActivity.setAdapter(qnAAdapter);
    }


    //add data which you want to add in your RecyclerView

    private void initData() {
        QuestionList = new ArrayList<>();
        QuestionList.add(new QnA("1. How do I get a bike on rent?",  "Well, you are already on our site so that’s one step ahead. Kudos to you. Now, go to this login/signup page and complete the registration process. Once you are registered, go through the models and select a bike that you desire. Then, you may proceed to make the payment. For any queries or issues during this process, feel free to reach out to our customer support team."));
        QuestionList.add(new QnA("2. Do you give bike on rent if I only have a learner’s driving license?",  "We are not your doctors but we do care for you. You need to have a valid and original MVWG License or MVWOG (for gearless) before renting a bike"));
        QuestionList.add(new QnA("3. Is Motor Vehicle with Gear (MVWG) or MVWOG License necessary to rent a bike?",  "Did you know you aren’t allowed to fly a plane until you are a licensed pilot. Trust me, two-wheelers don’t fly but will make you feel like you are. To feel so, it is important to submit a signed photocopy of the MVWG or MVWOG License before you take a two wheeler on rent."));
        QuestionList.add(new QnA("4. Do you accept cash for your bike rentals?",  "We are super eco-friendly. No ‘green’ notes please! We only accept online payment."));
        QuestionList.add(new QnA("",  " "));
        QuestionList.add(new QnA("",  " "));
        QuestionList.add(new QnA("",  " "));
    }

}
