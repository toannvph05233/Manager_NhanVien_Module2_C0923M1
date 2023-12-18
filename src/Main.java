import model.Staff;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ManagerStaff manager = new ManagerStaff();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản lý Nhân Viên");
            System.out.println("1. Hiển thị toàn bộ nhân viên");
            System.out.println("2. Thêm Nhân viên");
            System.out.println("3. Tính Lương Nhân Viên");
            System.out.println("4. Tính Lương Nhân Viên Theo Tên");
            System.out.println("5. Sửa Nhân viên");
            System.out.println("6. Xóa Nhân viên");
            System.out.println("7. THoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manager.display();
                    break;
                case 2:
                    menuAdd();
                    break;
                case 3:
                    menuSalary();
                    break;
                case 4:
                    manager.showSalaryByName(inputName());
                    break;
                case 5:
                    manager.edit(inputName());
                    break;
                case 6:
                    manager.deleteStaff(inputName());
                    break;
                case 7:
                    break;
            }
        }
    }

    public static String inputName(){
        System.out.println("Nhập name nhân viên muốn tính lương");
        return scanner.nextLine();
    }

    public static void menuAdd() {
        while (true) {
            System.out.println("1. Nhân viên fullTime");
            System.out.println("2. Nhân viên PartTime");
            System.out.println("3. Quay lại");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Staff fullTime = manager.createStaff(true);
                    manager.addStaff(fullTime);
                    break;
                case 2:
                    Staff partTime = manager.createStaff(false);
                    manager.addStaff(partTime);
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void menuSalary() {
        while (true) {
            System.out.println("1. Nhân viên fullTime");
            System.out.println("2. Nhân viên PartTime");
            System.out.println("3. Quay lại");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manager.salaryFull();
                    break;
                case 2:
                    manager.salaryPart();
                    break;
                case 3:
                    return;
            }
        }
    }
}