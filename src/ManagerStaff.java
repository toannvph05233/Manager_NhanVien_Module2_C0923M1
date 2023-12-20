import model.FullTime;
import model.PartTime;
import model.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStaff {
    ArrayList<Staff> staffs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void display() {
        for (int i = 0; i < staffs.size(); i++) {
            System.out.println(staffs.get(i));
        }
    }

    public void showSalaryByName(String name) {
        int index = findByName(name);
        if (index != -1) {
            System.out.println(staffs.get(index).salary());
        } else {
            System.out.println("Khong có nhân viên cần tìm");
        }
    }

    public void edit(String name) {
        int index = findByName(name);
        if (index != -1) {
            boolean isFullTime = staffs.get(index) instanceof FullTime;
            Staff staff = createStaff(isFullTime);
            staffs.set(index,staff);
        } else {
            System.out.println("Khong có nhân viên cần tìm");
        }
    }

    public void deleteStaff(String name) {
        int index = findByName(name);
        if (index != -1) {
            staffs.remove(index);
        } else {
            System.out.println("Khong có nhân viên cần tìm");
        }

    }


    public int findByName(String name) {
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void salaryFull() {
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i) instanceof FullTime) {
                System.out.println(staffs.get(i).salary());
            }
        }
    }

    public void salaryPart() {
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i) instanceof PartTime) {
                System.out.println(staffs.get(i).salary());
            }
        }
    }

    public void addStaff(Staff staff) {
        staffs.add(staff);
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
