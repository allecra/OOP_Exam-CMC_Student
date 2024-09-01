package test4;

import java.util.Scanner;

/**
 *
 * @author tienl
 */
public class TEST4 {

    public static void main(String[] args) {
        // Câu 1:
        ITStudent st1 = new ITStudent("luyen","123456789", 20, "nam", "IT");
        System.out.println("Thong tin sinh vien la: "+st1.toString());
        
        //Câu 2 + câu 3:
        // Khởi tạo một đối tượng TEST4 để nhập dữ liệu sinh viên
        TEST4 test = new TEST4();
        Scanner scanner = new Scanner(System.in);
        // Nhập số lượng sinh viên từ người dùng
        int n = enterPositiveInteger(scanner);
        // Nhập thông tin sinh viên và lưu vào mảng students
        Student[] students = test.enterStudentArray(scanner, n);

        // Tạo giao diện GUI và hiển thị
        GUI gui = new GUI(students);
        gui.displayStudents(students);
        gui.setVisible(true);
    }

    // Hàm nhập số nguyên dương
    public static int enterPositiveInteger(Scanner scanner) {
        int n;
        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
            n = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau khi nhập số
        } while (n <= 0);
        return n;
    }

    // Hàm nhập mảng n đối tượng Student
    public static Student[] enterStudentArray(Scanner scanner, int n) {
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student information for student " + (i + 1) + ":");
            String specialization = enterSpecialization(scanner);
            String studentID = enterStudentID(scanner); // Thay đổi ở đây
            String name = enterStringInput(scanner, "name");
            int age = enterPositiveInteger(scanner);
            String gender = enterStringInput(scanner, "gender");

            switch (specialization) {
                case "it":
                    students[i] = new ITStudent(name, studentID, age, gender, specialization);
                    break;
                case "kd":
                    students[i] = new BusinessStudent(name, studentID, age, gender, specialization);
                    break;
                case "nn":
                    students[i] = new LanguageStudent(name, studentID, age, gender, specialization);
                    break;
                default:
                    System.out.println("Invalid specialization. Please try again.");
                    i--;
                    break;
            }
        }
        return students;
    }

    // Hàm nhập chuỗi
    public static String enterStringInput(Scanner scanner, String fieldName) {
        String input;
        do {
            System.out.print("Enter " + fieldName + ": ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Invalid input. Please enter a valid " + fieldName + ".");
            } else {
                return input;
            }
        } while (true);
    }

    // Hàm nhập specialization
    public static String enterSpecialization(Scanner scanner) {
        String specialization;
        do {
            System.out.print("Enter specialization (it/kd/nn): ");
            specialization = scanner.nextLine().toLowerCase();
            if (!specialization.equals("it") && !specialization.equals("kd") && !specialization.equals("nn")) {
                System.out.println("Invalid specialization. Please enter it, kd, or nn.");
            } else {
                return specialization;
            }
        } while (true);
    }
    // Hàm nhập chuỗi và kiểm tra mã sinh viên
    public static String enterStudentID(Scanner scanner) {
        String input;
        do {
            System.out.print("Enter student ID (9 digits): ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Invalid input. Please enter a valid student ID.");
            } else if (!input.matches("\\d{9}")) {
                System.out.println("Invalid student ID. Please enter a 9-digit number.");
            } else {
                return input;
            }
        } while (true);
    }

}
