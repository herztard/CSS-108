public class Main {
    public static void main(String[] args) {
        Time time = new Time(24, 60,60);
        System.out.println(time.toString());
        Time time2 = new Time(3, 2, 3);
        System.out.println(time2.toString());
        System.out.println("Hour: " + time2.getHour());
        System.out.println(time2.nextSecond().toString());
        System.out.println(time.previousSecond().toString());
        System.out.println("==============================");
        Ball ball1 = new Ball(10, 10, 5, 10, 10);
        System.out.println(ball1.toString());
        ball1.move();
        System.out.println(ball1.toString());
        ball1.reflectHorizontal();
        ball1.reflectVertical();
        ball1.move();
        System.out.println(ball1.toString());

    }
}