import java.util.Scanner;
public class NumberMonth {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng: ");
        month = scanner.nextInt();
        switch (month) {
            // Các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày.");
                break;
            // Các tháng 4, 6, 9 và 11 có 30 ngày
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày.");
                break;
            //  Tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
            case 2:
                int year;
                System.out.println("Mời bạn nhập năm: ");
                year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                }
                break;
            default:
                System.out.println("Nhập tháng không đúng .");
        }
    }

}
