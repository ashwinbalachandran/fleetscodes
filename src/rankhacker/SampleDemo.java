package rankhacker;

class SampleDemo implements Runnable{
    private Thread t;
    private String threadName;

    public SampleDemo(String threadName) {
        this.threadName = threadName;
    }
    public void run() {
        while (true) {
            System.out.println(threadName);
        }
    }
    public void start(){
        if(t== null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
