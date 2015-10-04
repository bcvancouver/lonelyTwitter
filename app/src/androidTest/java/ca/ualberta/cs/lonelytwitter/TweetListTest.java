package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by michaelximac on 15-09-29.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testHoldsStuff() {
        TweetList list = new TweetList();
        Tweet tweet=new NormalTweet("test");
        list.add(tweet);
        assertSame(list.getMostRecentTweet(),tweet);
    }

    public void testHoldsManyThings(){
        TweetList list=new TweetList();
        Tweet tweet=new NormalTweet("test");
        list.add(tweet);
        assertEquals(list.count(), 1);
        list.add(new NormalTweet("test1"));
        assertEquals(list.count(),2);
    }

    public void testAddTweet(){
        try {
            TweetList list = new TweetList();
            Tweet tweet=new NormalTweet("test");
            list.add(tweet);
            Tweet tweet2=new NormalTweet("test");
            list.add(tweet2);
            assertTrue(false);
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

}
