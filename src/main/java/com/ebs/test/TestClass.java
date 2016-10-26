package com.ebs.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Leon on 2016-10-26.
 */
public class TestClass {
    String message = "Hello World";
    String messageUtil = "Hi";

    @Test
    public void testPrintMessage() {
        message = "New Word";
        assertEquals(message,messageUtil);
    }
}
