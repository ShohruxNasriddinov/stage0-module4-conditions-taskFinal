package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year<0){
            System.out.println("invalid date");

        }else {
            int a = year / 100;
            int b = a % 4;
            if (b == 0 && year % 4 == 0 && month == 2) {
                System.out.println("29");
            } else {
                switch (month) {
                    case 12:
                    case 10:
                    case 8:
                    case 7:
                    case 5:
                    case 3:
                    case 1:
                        System.out.println("31");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30");
                        break;
                    case 2:
                        System.out.println("28");
                        break;
                    default:
                        System.out.println("invalid date");
                }
            }
        }
    }
}
