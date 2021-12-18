import java.time.LocalDate;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        Long d1 = LocalDate.parse(date1).toEpochDay();
        Long d2 = LocalDate.parse(date2).toEpochDay();
        
        return (int) Math.abs(d1 - d2); 
    }
}
