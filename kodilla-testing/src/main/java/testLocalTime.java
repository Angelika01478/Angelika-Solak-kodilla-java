import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;


class Kodilla {
    public static void main (String[] args) {

        LinkedList <Clock> clocks = new LinkedList<>();



        Clock warsawTime = new Clock (LocalTime.now(), "Warsaw");
        Clock newYorkTime = new Clock (LocalTime.now().plusHours(-6), "New York");
        Clock londonTime = new Clock (LocalTime.now().getHour()-1,LocalTime.now().getMinute(), LocalTime.now().getMinute(), "London");
        Clock moscowTime = new Clock (LocalTime.now().getHour()+2,LocalTime.now().getMinute(), LocalTime.now().getMinute(),"Moscow");
        Clock sydneyTime = new Clock (LocalTime.now().plusHours(10), "Sydney");
        Clock test= new Clock(20,11,10, "ZZZ");

        clocks.add(warsawTime);
        clocks.add(newYorkTime);
        clocks.add(londonTime);
        clocks.add(moscowTime);
        clocks.add(sydneyTime);
        clocks.add(test);



        for(Clock el: clocks){
            System.out.println(el);
        }

        //adding one minute

        for(Clock el: clocks){
            System.out.println(el.getCurrentMinute());
            el.setCurrentMinute(1);
            System.out.println(el);
        }


    }
}

class Clock{
    private LocalTime time;
    private int currentHour;
    private int currentMinute;
    private int currentSecond;
    private String town;


    Clock (int currentHour, int currentMinute, int currentSecond, String town){

        this.currentHour=currentHour;
        this.currentMinute=currentMinute;
        this.currentSecond=currentSecond;
        this.time = LocalTime.of(currentHour, currentMinute, currentSecond);
        this.town=town;
    }


    Clock (LocalTime time, String town){

        this.currentHour=time.getHour();
        this.currentMinute=time.getMinute();
        this.currentSecond=time.getSecond();
        this.time = time;
        this.town=town;
    }



    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;

    }

    public int getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(int currentHour) {
        this.currentHour = currentHour;
    }

    public int getCurrentMinute() {
        return currentMinute;
    }


    public void setCurrentMinute(int add) {
        this.time.plusMinutes(add);
    }





    public int getCurrentSecond() {
        return currentSecond;
    }

    public void setCurrentSecond(int currentSecond) {
        this.currentSecond = currentSecond;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "time=" + time +
                ", town='" + town + '\'' +
                '}';
    }


}