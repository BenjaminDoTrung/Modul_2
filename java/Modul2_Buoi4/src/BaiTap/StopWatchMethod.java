package BaiTap;

public class StopWatchMethod {
    private long startTime, endTime, elapsedTime;
    public StopWatchMethod() {
    }
    public long getStartTime() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime-this.startTime;
    }
}
