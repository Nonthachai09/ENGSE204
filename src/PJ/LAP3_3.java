package PJ;

import java.util.Scanner;

class userid {
    private String password;

    public userid(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class LAP3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String initialPass = sc.nextLine();
        String newPass = sc.nextLine();

        userid u = new userid(initialPass);
        u.setPassword(newPass);

        System.out.println(u.getPassword());
    }
}
