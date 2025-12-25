package PJ3;

import java.util.Scanner;

class User {
    protected String name;

    public User(String uName) {
        name = uName;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String dName, int dProjects) {
        super(dName);
        projects = dProjects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String aName, int aProjects, String aKey) {
        super(aName, aProjects);
        adminKey = aKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class LAP5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String devName = sc.nextLine();
        int devProjects = sc.nextInt();
        sc.nextLine();

        String adminName = sc.nextLine();
        int adminProjects = sc.nextInt();
        sc.nextLine();
        String adminKey = sc.nextLine();

        User u1 = new User("Guest");
        Developer d1 = new Developer(devName, devProjects);
        Admin a1 = new Admin(adminName, adminProjects, adminKey);

        User[] users = {u1, d1, a1};

        int totalClearance = 0;
        for (User u : users) {
            totalClearance += u.getClearanceLevel();
        }

        for (User u : users) {
            if (u instanceof Admin) {
                Admin ad = (Admin) u;
                System.out.println(ad.getAdminKey());
            }
        }

        System.out.println(totalClearance);
    }
}
