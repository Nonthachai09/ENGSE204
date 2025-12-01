package PJ;

import java.util.Scanner;

class Address {
    String street;
    String city;
    String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}

class StudentInfo {
    String name;
    Address address;

    public StudentInfo(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}

public class LAP2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String street = sc.nextLine();
        String city = sc.nextLine();
        String zipCode = sc.nextLine();

        Address addr = new Address(street, city, zipCode);
        StudentInfo student = new StudentInfo(name, addr);
        student.displayProfile();
        sc.close();
    }
}
