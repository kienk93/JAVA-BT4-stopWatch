
public class stopWatch {
    private double startTime;
    private double endTime;

    public stopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    private void start() {
        this.startTime = System.currentTimeMillis();
    }
    private void end() {
        this.endTime = System.currentTimeMillis();
    }
    private double getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        stopWatch stopWatch1 = new stopWatch();
        stopWatch1.start();
        for(int i=0;i<1000;i++) {
            for(int j=0;j<1000;j++){
                System.out.println(i);
            }
        }
        stopWatch1.end();
        System.out.println(stopWatch1.getElapsedTime());







    }
}