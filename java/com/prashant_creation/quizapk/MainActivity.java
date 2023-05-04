package com.prashant_creation.quizapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"1. Java is Developed in 1990 ?","2. Is Java was Developed By James Gosling ?","3. java Support Interface ?"};
    private boolean[] answers={false,true,true};
    private int index=0;
    private int score=0;
    Button yes;
    Button no;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                 3<=2 it will become false
                if(index <= questions.length-1){
//                    if answer[index//true] score ++
                    if(answers[index]){
                        score++;
                    }
//                    incrementing the index
                    index++;
                    //                 3<=2 it will become false
                    // set the next que

                    if (index <= questions.length-1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is "+score+"/3", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "You Need To Restart The App", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length-1){
                    if(!answers[index]){
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is "+score+"/3", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "You Need To Restart The App", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}