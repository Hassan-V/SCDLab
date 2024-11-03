package lab3.task3;

public class Customer {
    private char customerId;
    private String name;
    private String address;
    private int phNo;
    private int age;

    public Customer(char customerId, String name, String address, int phNo, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
        this.age = age;
    }

    public void addDetails() {
        System.out.println("Added customer details");
    }

    public void modifyDetails() {
        System.out.println("Modified customer details");
    }

    // Getters and Setters
    public char getCustomerId() {
        return customerId;
    }

    public void setCustomerId(char customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(char name) {
        this.name = String.valueOf(name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(char address) {
        this.address = String.valueOf(address);
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

