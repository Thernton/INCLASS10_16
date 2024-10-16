package AgeException;

public class Bio {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Bio(int age) {
        this.age= age;
    }
    public boolean checkAge() throws InvalidAgeException {
        if (age < 150) {
            return true;
        } else {
            throw new InvalidAgeException("This is a invalid age!! Enter in a age between 0- 149");
        }
    }

    public static void main(String[] args) {
        try {
            Bio age1 = new Bio(10);
            if (age1.checkAge())
                System.out.println("The age " +age1.age+ " is a vaild age!!");
        } catch (InvalidAgeException j) {
            System.out.println(j.getMessage());
        }
        try {
            Bio age2 = new Bio(15);
            if (age2.checkAge())
                System.out.println("The age " +age2.age+ " is a vaild age!!");
        } catch (InvalidAgeException j) {
            System.out.println(j.getMessage());
        }
        try {
            Bio age3 = new Bio(200);
            if (age3.checkAge())
                System.out.println("The age " +age3.age+ " is a vaild age!!");
        } catch (InvalidAgeException j) {
            System.out.println(j.getMessage());
        }

        }
    }

