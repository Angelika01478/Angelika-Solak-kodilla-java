package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {

    private static SettingsFileEngine settingsFileEngineInstatce =null;
    private String fileName="";

    private SettingsFileEngine() {
    }


    public static SettingsFileEngine getInstance(){
        if(settingsFileEngineInstatce == null){
           synchronized (SettingsFileEngine.class){
               if(settingsFileEngineInstatce==null) {
                   settingsFileEngineInstatce = new SettingsFileEngine();
               }
           }
        }
        return settingsFileEngineInstatce;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName){
     this.fileName=fileName;
        System.out.println("Opening the settings file");
    }

    public void close(){
        this.fileName="";
        System.out.println("Closing the file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
