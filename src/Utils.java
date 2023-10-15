public class Utils {
    public static void check(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("excellent");
        } else if ((x > 0 && y > 0) || (y > 0 && z > 0) || (x > 0 && z > 0)) {
            System.out.println("good");
        } else if (x > 0 || y > 0 || z > 0) {
            System.out.println("fine");
        } else {
            System.out.println("bad");
        }
    }

    public static void checkDayAndMonthIsHoliday(int day, int month){
        if (day< 1 || day > 31 || month < 1 || month>12){
            System.out.println("error");
            return;
        }
        if((day==30 || day==31) && month==2){
            System.out.println("incorrect data");
            return;
        }
        if (((day==1 || day==7) && month == 1) || (day==8 && month==3) || ((day==1 || day==9) && month ==5) || (day ==3 && month== 7) || (day==7 && month==10) || (day==25 && month==12)){
            System.out.println("holiday");
        } else
            System.out.println("not holiday");
    }
}
