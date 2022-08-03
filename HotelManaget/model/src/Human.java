import java.util.Scanner;

public class Human {
    private String name;
    private String CCCD;
    private String birthplace;

    public Human() {
    }

    public Human(String name, String CCCD, String birthplace) {
        this.name = name;
        this.CCCD = CCCD;
        this.birthplace = birthplace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    public void CustomerInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên khách hàng: ");
        name = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        birthplace = scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân: ");
        CCCD = scanner.nextLine();
    }
    public void ShowCustomerInformation(){
        System.out.println("Họ và tên khách hàng: " + name);
        System.out.println("Quê quán: " + birthplace);
        System.out.println("Số chứng minh nhân dân: " + CCCD);
    }
}
