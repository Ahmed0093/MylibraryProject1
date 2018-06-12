package com.example1.iti.libraryadd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ahmed on 2/21/2018.
 */

public class CalacTest {
    RssFeedProvider rssFeedProvider = new RssFeedProvider();
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4,RssFeedProvider.Add(2,2) );
    }
}
