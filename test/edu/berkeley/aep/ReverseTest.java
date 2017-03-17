package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jolly on 3/7/17.
 */
public class ReverseTest {

    @Test
    public void jollyReversedShouldBeYlloj() {
        Reverse A = new Reverse();
        assertEquals( "ylloj", A.reverse("jolly"));
    }
}
