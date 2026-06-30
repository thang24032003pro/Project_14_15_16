import java.util.Scanner;

public class TriangleChecker {

    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Lỗi: Các cạnh của tam giác phải là số dương!");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi: Tổng hai cạnh phải lớn hơn cạnh còn lại!");
        }
        System.out.printf("Ba cạnh %.2f, %.2f, %.2f tạo thành một tam giác hợp lệ.\n", a, b, c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleChecker checker = new TriangleChecker();

        try {
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double c = scanner.nextDouble();

            checker.checkTriangle(a, b, c);

        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi: Dữ liệu nhập vào phải là một số!");
        } finally {
            scanner.close();
        }
    }
}