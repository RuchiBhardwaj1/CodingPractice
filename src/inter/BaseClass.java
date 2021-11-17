package inter;

public abstract class BaseClass {

    public int ID;
    public String FirstName;
    public String LastName;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getFullName(){
        return this.FirstName+ " "+ LastName;
    }

    public abstract  int GetMonthlySalary();




}
