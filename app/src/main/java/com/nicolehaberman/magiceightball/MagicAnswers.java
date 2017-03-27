package com.nicolehaberman.magiceightball;

import java.util.Random;

/**
 * Created by Nicole on 11/2/15.
 */
public class MagicAnswers {

    private String mAnswers;
    public MagicAnswers(){
        mAnswers = "";

    }
    public String setmAnswers(){
        Random rand = new Random();
        int random = rand.nextInt(8)+1;
        if(random == 1){
            this.mAnswers= "Yes";
        }
        if(random == 2){
            this.mAnswers= "No";

        }
        if(random == 3){
            this.mAnswers= "Most likely";
        }
        if(random == 4){
            this.mAnswers="Very doubtful";
        }
        if(random == 5){
            this.mAnswers="Ask again later";
        }
        if(random == 6){
            this.mAnswers="My sources say no";
        }
        if(random == 7){
            this.mAnswers = "As I see it, yes";
        }
        if(random == 8){
            this.mAnswers="Reply Hazy, try again";
        }

        return this.mAnswers;
    }

    public String getmAnswers() {
        return mAnswers;
    }
}
