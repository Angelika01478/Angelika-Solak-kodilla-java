package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){

        String lastLog = "User logged in";

        Logger.getInstance().log(lastLog);

        Assert.assertEquals(lastLog, Logger.getInstance().getLastLog());

    }


}
