import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        System.out.println(checkDayOfWeek(data));
        System.out.println(checkDay(data));
        System.out.println(checkMonth(data));
        System.out.println(checkYear(data));
    }
    public static String checkDayOfWeek(OffsetDateTime data){

       return String.valueOf(data.getDayOfWeek());

    }
    public static String checkDay(OffsetDateTime data){

        return String.valueOf(data.getDayOfMonth());

    }
    public static String checkMonth(OffsetDateTime data){

        return String.valueOf(data.getMonth());

    }
    public static String checkYear(OffsetDateTime data){

        return String.valueOf(data.getYear());

    }
}