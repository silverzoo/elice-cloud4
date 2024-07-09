import java.time.LocalTime;
import java.util.Scanner;

public class TestLocalTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lateMin = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();

        //of()메서드는 통해 받은 매개변수를 LocalTime 객체로 반환
        //plusMinutes()메서드는 분단위를 더해 LocalTime 객체로 반환
        LocalTime newTime = LocalTime.of(hour, min, sec).plusMinutes(lateMin);

        System.out.println(newTime);
    }
}
