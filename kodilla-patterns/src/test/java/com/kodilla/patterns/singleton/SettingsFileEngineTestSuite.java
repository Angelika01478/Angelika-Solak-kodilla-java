package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {

    private static SettingsFileEngine settingsFileEngine;


    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myapp.settings");
    }


    @AfterClass
    public static void closeSettingsFile(){
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName(){
        //Given
        //When
        String result= "myapp.settings";
        //Then
        Assert.assertEquals(result, SettingsFileEngine.getInstance().getFileName());
    }

    @Test
    public void testLoadSettings(){
        //Given
        //When
        //Then
        Assert.assertTrue(SettingsFileEngine.getInstance().loadSettings());
    }

    @Test
    public void testSaveSettings(){
        //Given
        //When
        //Then
        Assert.assertTrue(SettingsFileEngine.getInstance().saveSettings());
    }


}
