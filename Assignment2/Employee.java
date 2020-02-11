//Assignment 2 - Understanding Inheritance: Creating Superclass and utilizing toString methods
//CSIS 312-BO3
//Superclass Employee
public class Employee {

    //Create instance variables
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    //three-argument constructor that are common to all employees
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //set firstName
    public void setfirstName (String firstName)
    {
        this.firstName = firstName;
    }

    //set lastName
    public void setlastName (String lastName)
    {
        this.lastName = lastName;
    }

    //get firstName
    public String getfirstName() {
        return this.firstName;
    }

    //get lastName
    public String getlastName() {
        return this.lastName;
    }

    //set socialSecurityNumber
    public void setSocialSecurityNumber (String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //get socialSecurityNumber
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    //return String representation of Employee object
    @Override
    public String toString()
    {
        return String.format("%s %s %s\nsocial security number: %s\n",
                "commission employee:",getfirstName(),getlastName(),getSocialSecurityNumber());
    }

}
