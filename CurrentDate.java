import java.time.LocalDate;

public class CurrentDate {
    public static void main(String[] args) {
        LocalDate now= LocalDate.now();
        System.out.println(now.getMonth());
    }
}
