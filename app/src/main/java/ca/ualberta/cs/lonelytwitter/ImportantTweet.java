package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by michaelximac on 15-09-15.
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(Date date, String tweet) {
        super(date, tweet);
    }

    public ImportantTweet(String text) {
        super(text);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    @Override
    public String getText(){
        return "important: "+super.getText();
    }
}

