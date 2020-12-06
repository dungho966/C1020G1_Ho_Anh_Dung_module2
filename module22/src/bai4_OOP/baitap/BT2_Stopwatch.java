package bai4_OOP.baitap;

import java.time.LocalTime;
public class BT2_Stopwatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }
    public LocalTime getEndTime(LocalTime endTime){
        return endTime;
    }
    public void setStartTime(){
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }
    public void setEndTime(){
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }
    public void getElapsedTime(){
        int elaspedTime = (endTime.toSecondOfDay() - startTime.toSecondOfDay()) * 100;
        System.out.println("Số mili giây đếm đc:" + elaspedTime);
    }

    public static void main(String[] args) {
        BT2_Stopwatch stopWatch = new BT2_Stopwatch();
        stopWatch.setStartTime();
        System.out.println("Đang đếm thời gian");
        for(int i = 0; i <= 10000000;i++)
            stopWatch.setEndTime();
        stopWatch.getElapsedTime();
    }
}
