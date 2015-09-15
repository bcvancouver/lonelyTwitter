package ca.ualberta.cs.lonelytwitter;

import java.sql.Time;
import java.util.Date;

/**
 * Created by michaelximac on 15-09-15.
 */
public abstract class CurrentMood {
    private Time date;

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }
    public abstract String getMood();
}
