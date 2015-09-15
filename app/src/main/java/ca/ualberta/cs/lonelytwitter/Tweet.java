package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by michaelximac on 15-09-15.
 */
public abstract class Tweet extends Object{
    private String text; /*types always starts with upper-cased letter*/
    private Date date; /*Attribute starts with lower-cased letter*/

    public Tweet(Date date, String tweet        ) {
        this.date = date; /*this is the pointer to the current object*/
        text = tweet;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws IOException {
        if (text.length()<=140){
            this.text = text;
        } else {
            throw new IllegalArgumentException("Tweets can't be that long, Shakespear!");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Tweet(String text) {
        this.text = text;
        this.date=new Date();
    }

    public abstract Boolean isImportant();

}
