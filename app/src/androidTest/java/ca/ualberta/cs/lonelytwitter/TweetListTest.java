package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

<<<<<<< HEAD
/**
 * Created by michaelximac on 15-09-29.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
=======
import junit.framework.TestCase;

/**
 * Created by joshua2 on 9/29/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
>>>>>>> 91744dda89005127b64b4b53e842db9a38a75a60
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testHoldsStuff() {
        TweetList list = new TweetList();
<<<<<<< HEAD
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
=======
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertSame(list.getMostRecentTweet(), tweet);
    }

    public void testHoldsManyThings() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertEquals(list.count(), 1);
        list.add(new NormalTweet("test"));
        assertEquals(list.count(), 2);
    }
}
>>>>>>> 91744dda89005127b64b4b53e842db9a38a75a60
