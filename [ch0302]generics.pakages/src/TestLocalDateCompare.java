import java.time.LocalDate;
public class TestLocalDateCompare {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 1, 15);
        System.out.println(date1.isAfter(date2)); //false
        System.out.println(date1.isBefore(date2)); //true
    }
}
