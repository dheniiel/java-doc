package data;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
/**
 *
 * @author Cliente
 */
public class MainData {
    
    public static void exemploDate(){
        Date date = new Date();
        System.out.println(date.getTime());
    }
    
    public static void exemploAntesDepois(){
        Date date = new Date();
        System.out.println(date.getTime());
        Date date2 = new Date();
        System.out.println(date2.getTime());
        
        if(date.before(date2)){
            System.out.println("Data 1 é antes da data 2.");
        }
        if(date2.after(date)){
            System.out.println("Data 2 é depois da data 1.");
        }
    }
    
    public static void exemploCalendar(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        
        Date date = calendar.getTime();
        System.out.println(date);
        
        calendar.set(calendar.YEAR, 2024);
        calendar.set(calendar.MONTH, 0);
        calendar.set(calendar.DAY_OF_MONTH, 1);
        calendar.set(calendar.HOUR_OF_DAY, 15);
        calendar.set(calendar.MINUTE, 15);
        calendar.set(calendar.SECOND, 15);
        
        calendar.set(2024, 0, 1, 15, 15, 15);
        
        System.out.println(date);
    }
    
    public static void exemploSomarSubtrair(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        
        calendar.add(calendar.YEAR, 6);
        System.out.println(calendar);
        calendar.add(calendar.YEAR, 7);
        System.out.println(calendar);
    }
    
    public static void exemploDateFormat(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        
        DateFormat dateFormat = DateFormat.getInstance();
        String format = dateFormat.format(date);
        System.out.println(format);
        
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String format2 = dateFormat2.format(date);
        System.out.println(format2);
        
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","US"));
        String format3 = dateFormat3.format(date);
        System.out.println(format3);
    }
    
    public static void exemploSimpleDateFormat(){
        Date dataSemFormatacao = new Date();
        System.out.println(dataSemFormatacao);
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM//yyyy HH:mm:ss EEEE MMMM", new Locale("en","US"));
        formatador.format(dataSemFormatacao);
    }
    
    public static void exemploDataString(){
        String dataAleatoria = "18/05/2025";
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dataAleatoria);
        
        try{
            Date date = formatador.parse(dataAleatoria);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }
    
    public static void exemploLocalDate(){
        LocalDate date = LocalDate.of(2022,1,27);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        agora.plusWeeks(4);
    }
   
    public static void exemploLocalTime(){
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.AMPM_OF_DAY));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
    
    public static void exemploLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ltd1 = date.atTime(time);
        LocalDateTime ltd2 = time.atDate(date);
        System.out.println(ltd1);
        System.out.println(ltd2);
    }
    
    public static void main(String[] args) {
        exemploDate();
        System.out.println("\n");
        exemploAntesDepois();
        System.out.println("\n");
        exemploCalendar();
        System.out.println("\n");
        exemploSomarSubtrair();
        System.out.println("\n");
        exemploDateFormat();
        System.out.println("\n");
        exemploSimpleDateFormat();
        System.out.println("\n");
        exemploDataString();
        System.out.println("\n");
        exemploLocalDate();
        System.out.println("\n");
        exemploLocalTime();
        System.out.println("\n");
        exemploLocalDateTime();
    }
}
