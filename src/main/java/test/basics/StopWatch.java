package test.basics;// Created by ZG on 15/7/5.
// 

public class StopWatch {

    private long startTime;
    private long stopTime;

    public static final double MANOS_PER_SEC = 1000000000.0;

    // start the stop watch
    public void start(){
        startTime = System.nanoTime();
    }

    // stop the stop watch
    public void stop(){
        stopTime = System.nanoTime();
    }

    // elapsed time in seconds.
    // @return the time recorded on the stopwatch in seconds
    public double time(){
        return (stopTime - startTime) / MANOS_PER_SEC;
    }

    public String toString(){
        return "elapsed time: " + time() + " seconds.";
    }

    // elapsed time in nanoseconds.
    // @return the time recorded on the stopwatch in nanoseconds
    public long timeInNanoseconds(){
        return (stopTime - startTime);
    }

}
