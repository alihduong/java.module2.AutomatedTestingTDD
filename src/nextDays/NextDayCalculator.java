package nextDays;

public class NextDayCalculator {
    public static String nextDayCalculator(int day, int month, int year){
        if(day > 31 || month > 12){
            return "Error!!!!";
        }else {
            int dayOfMonth = dayOfMonth(month, year);
            if (day < dayOfMonth){
                return (day + 1) + "/" + month + "/" + year;
            }else {
                if(month < 12){
                    return "1/" + (month + 1) + "/" + year;
                }else {
                    return "1/1/" + (year + 1);
                }
            }
        }
    }
    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
    public static int dayOfMonth(int month, int year){
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
