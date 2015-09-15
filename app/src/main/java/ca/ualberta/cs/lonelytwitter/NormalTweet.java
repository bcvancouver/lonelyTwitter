package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by michaelximac on 15-09-15.
 */
public class NormalTweet extends Tweet{
    public NormalTweet(Date date, String tweet) {
        super(date, tweet);
    }

    public NormalTweet(String text) {
        super(text);
    }

    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
