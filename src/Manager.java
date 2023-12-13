import model.FullTime;
import model.PartTime;
import model.Staff;

import java.util.Scanner;

public class Manager {
    Staff[] staffs = {};
    Scanner scanner = new Scanner(System.in);


    public void display() {
        for (int i = 0; i < staffs.length; i++) {
            System.out.println(staffs[i]);
        }
    }

    public void salaryFull() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof FullTime) {
                System.out.println(staffs[i].salary());
            }
        }
    }
    public void salaryPart() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof PartTime) {
                System.out.println(staffs[i].salary());
            }
        }
    }

    public void addStaff(Staff staff) {
        Staff[] newArr = new Staff[staffs.length + 1];
        for (int i = 0; i < staffs.length; i++) {
            newArr[i] = staffs[i];
        }
        newArr[newArr.length - 1] = staff;
        staffs = newArr;
    }

    public Staff createStaff(boolean isFullTime) {
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập phone");
        String phone = scanner.nextLine();
        if (isFullTime) {
            System.out.println("Nhập date");
            int date = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập heso");
            int heso = Integer.parseInt(scanner.nextLine());
            return new FullTime(name, address, phone, date, heso);
        } else {
            System.out.println("Nhập count");
            int count = Integer.parseInt(scanner.nextLine());
            return new PartTime(name, address, phone, count);
        }
    }

}