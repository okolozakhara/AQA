package org.example.homework.task4;

public class Clock implements Readable{
    private int hour;
    private int min;
    private int sec;

    public Clock (int hour, int min, int sec) {
        setTime (hour, min, sec);
    }

    public void setTime (int hour, int min, int sec) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;

        } else {
            this.hour = 0;
        }
        if (min >= 0 && min < 60) {
            this.min = min;
        } else {
            this.min = 0;
        }
        if (sec >= 0 && sec < 60) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }

    public int getHour() {
        return hour;
        }

    public int getMin() {
        return min;
        }

    public int getSec() {
        return sec;
        }

    public void tick() {
        sec++;
        if (sec >= 60) {
            sec = 0;
            min++;
        }
        if (min >= 60) {
            min = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }
    }


    @Override
    public void readTime() {
        System.out.println(String.format("%02d:%02d:%02d", hour, min, sec));
    }

}
