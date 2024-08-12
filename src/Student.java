public class Student {
    //properties
    String firstName;
    String lastName;
    int id;
    String address;
    static String college="Sheridan";



    // constructor

    public Student(String firstName,String lastName, int id, String address, String college) {
        this.firstName =firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;

    }
    // method
    public String display() {
       String  StudentInfo =
        "My First Name is  : " + firstName +" \n " + " My Last Name is  : " + lastName + " \n " + " My ID is  : " +
                id + " \n " + " My address is  : " + address + " \n " + " My College is  : " + college;
        System.out.println(StudentInfo);
        return StudentInfo;
    }

}
