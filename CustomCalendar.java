import java.util.Scanner;

public class CustomCalendar {

    public static boolean isValidCalendar(int daysInYear, int daysInMonth) {
        int rem = daysInYear % daysInMonth;
        int months = daysInYear / daysInMonth;
        int acc = 0;

        for (int year = 1; year < 1000; year++) {
            int m = months;
            acc += rem;
            if (acc >= daysInMonth) {
                m += 1;
                acc -= daysInMonth;
            }
            if (m > 99 || daysInMonth > 99) return false;
        }

        return true;
    }

    public static int[] parseDate(String dateStr) {
        try {
            String[] parts = dateStr.trim().split("-");
            int y = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int d = Integer.parseInt(parts[2]);
            return new int[]{y, m, d};
        } catch (Exception e) {
            return new int[]{-1, -1, -1};
        }
    }

    public static boolean isValidDate(int y, int m, int d, int daysInYear, int daysInMonth) {
        if (y < 1 || m < 1 || d < 1) return false;

        int baseMonths = daysInYear / daysInMonth;
        int rem = daysInYear % daysInMonth;

        int acc = rem * (y - 1);
        int leapMonths = acc / daysInMonth;
        acc = acc % daysInMonth;

        int leap = (acc + rem >= daysInMonth) ? 1 : 0;
        int totalMonths = baseMonths + leap;

        return m <= totalMonths && d <= daysInMonth;
    }

    public static int totalDaysFromStart(int y, int m, int d, int daysInYear, int daysInMonth) {
        int totalDays = 0;
        int rem = daysInYear % daysInMonth;
        int monthsPerYear = daysInYear / daysInMonth;
        int acc = 0;

        for (int year = 1; year < y; year++) {
            totalDays += daysInYear;
            acc += rem;
            if (acc >= daysInMonth) {
                totalDays += daysInMonth;
                acc -= daysInMonth;
            }
        }
// Check if current year gets a leap month before month m
if ((acc + rem) >= daysInMonth && m > monthsPerYear) {
    totalDays += daysInMonth;
}
totalDays += (m - 1) * daysInMonth + (d - 1);
        return totalDays;
    }

    public static String getDayLetter(int n, int daysInWeek) {
        return Character.toString((char) ('A' + (n % daysInWeek)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String s = scanner.nextLine().trim();
            String[] parts = s.split(" ");
            if (parts.length != 4) {
                System.out.println("-1");
                return;
            }

            int daysInYear = Integer.parseInt(parts[0]);
            int daysInMonth = Integer.parseInt(parts[1]);
            int daysInWeek = Integer.parseInt(parts[2]);
            String dateStr = parts[3];

            if (!(1 <= daysInYear && daysInYear <= 2000 &&
                  1 <= daysInMonth && daysInMonth <= 200 &&
                  1 <= daysInWeek && daysInWeek <= 26 &&
                  daysInMonth < daysInYear)) {
                System.out.println("-1");
                return;
            }

            if (!isValidCalendar(daysInYear, daysInMonth)) {
                System.out.println("-1");
                return;
            }

            int[] date = parseDate(dateStr);
            int y = date[0], m = date[1], d = date[2];

            if (y == -1) {
                System.out.println("-1");
                return;
            }

            if (!isValidDate(y, m, d, daysInYear, daysInMonth)) {
                System.out.println("-1");
                return;
            }

            int totalDays = totalDaysFromStart(y, m, d, daysInYear, daysInMonth);
            System.out.println(getDayLetter(totalDays, daysInWeek));

        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}
