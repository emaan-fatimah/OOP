public class rectangle{
    double length;
    double width;
    public void abc(){
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Length:"+" "+length+" "+"Width:"+" "+width+" "+"Area:"+" "+area+"Perimeter:"+" "+perimeter);
    }
    public static void main(String[]args){
        rectangle r1 = new rectangle();
        r1.length = 5;
        r1.width = 8;
        r1.abc();
        rectangle r2 = new rectangle();
        r2.length = 22;
        r2.width = 39;
        r2.abc();

    }
}