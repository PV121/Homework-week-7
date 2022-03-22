package homework;

public class Person {

    //variables
    String fisrtName, lastname;
    int age;

    //main method
    public static void main(String[] args) {
        Person person = new Person();
        person.setFisrtName(""); // firstName is set to empty string
        person.setLastname(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFisrtName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastname("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }

    public String getFirstName() {// instance method (getFirstName without any parameters)
        return fisrtName;
    }

    public String getLastName() {// instance method (getLastName without any parameters)
        return lastname;
    }

    public int getAge() { //instance method (getAge without any parameters)
        return age;
    }

    public void setFisrtName(String fisrtName) {// instance method (setfirstname with parameter)
        this.fisrtName = fisrtName;
    }

    public void setLastname(String lastname) {// instance method (setlastname with parameter)
        this.lastname = lastname;
    }

    public void setAge(int age) { //instance method (setAge with parameter)
        if (age > 0 || age < 100) {
            this.age = age;
        } else {
            age = 0;
        }
    }

    public boolean isTeen() {//instance method without any parameter(boolean return type)
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() { //instance method without any paramters, return fullName
        if (fisrtName.isEmpty() && lastname.isEmpty()) {
            return "  ";

        } else if (fisrtName.isEmpty()) {
            return lastname;
        } else  {
            return fisrtName + " " + lastname;

        }


}}
