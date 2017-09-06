package com.example.andrewsamtoy.busterbearsalmonjournal;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/5/17.
 */

public class BearSalmonJournalTest {
    Bear bear;
    Salmon salmon;
    Journal journal;

    @Before
    public void before() {
        bear = new Bear("Buster");

    }

    @Test
    public void testBearName(){
        assertEquals("Buster", bear.getName());

    }

    @Test
    public void testBellyEmpty(){
        assertEquals(0, bear.getBelly());
    }

    @Test
    public void testEat(){
        bear.eat();
        assertEquals(1, bear.getBelly());
    }
}
