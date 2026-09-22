public class time {
    int hours;
    int minutes;
    int seconds;
    public void displaytime(){
        System.out.println("Hours:"+" "+hours+" "+"Minutes:"+" "+minutes+" "+"Seconds:"+" "+seconds);
    }

    public static void main(String[] args) {
        time t1 = new time();
        t1.hours = 4;
        t1.minutes = 12;
        t1.seconds = 33;
        t1.displaytime();
        time t2 = new time();
        t2.hours = 11;
        t2.minutes = 47;
        t2.seconds = 25;
        t2.displaytime();
    }
}