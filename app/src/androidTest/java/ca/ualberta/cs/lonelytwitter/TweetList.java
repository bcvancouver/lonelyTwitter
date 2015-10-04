package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by michaelximac on 15-09-29.
 */
public class TweetList{
    private Tweet mostRecentTweet;
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        mostRecentTweet = tweet;
        existed(tweets,tweet);
        tweets.add(tweet);

    }

    private boolean existed(ArrayList<Tweet> list, Tweet tweet) {
        boolean more=false;
        for (Tweet target:list){
            if (target.getText()==tweet.getText()){
                throw new IllegalArgumentException();
            }
        }
        return false;
    }

    public Tweet getMostRecentTweet() {
        return mostRecentTweet;
    }

    public int count() {
        return tweets.size();
    }

}
