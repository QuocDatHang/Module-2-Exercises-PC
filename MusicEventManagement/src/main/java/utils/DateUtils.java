package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static LocalDate parseDate(String strDate){
        try{
            return LocalDate.parse(strDate, dateTimeFormatter);
        } catch (DateTimeParseException e){
            System.err.println("Vui lòng nhập theo định dạng 'dd-mm-yyyy'");
        }
        return null;
    }
}
