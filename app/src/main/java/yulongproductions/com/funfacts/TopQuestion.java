package yulongproductions.com.funfacts;

import java.util.Random;

/**
 * Created by Yulong on 5/13/2015.
 */
public class TopQuestion {

    public String[] mFactQuestion = {
            "Did you know?",
            "Wow! Interesting!",
            "Learn something new everyday!",
            "Knowledge is one click away.",
            "More facts = more knowledge = more babes.",
            "In fear, we turn to those with power."
    };
    public String[] mZachQuestion = {
            "Heres' more to know about Zach!",
            "No lie.",
            "He's certainly the best!",
            "Another fact about him!",
            "The most interesting man in the world.",
            "Did you know that?",
            "Factivity feat. Zachamack"
    };

    public String getFactQuestion() {
        Random r = new Random();
        int random = r.nextInt(mFactQuestion.length);
        return mFactQuestion[random];
    }

    public String getZachQuestion() {
        Random r = new Random();
        int random = r.nextInt(mZachQuestion.length);
        return mZachQuestion[random];
    }
}
