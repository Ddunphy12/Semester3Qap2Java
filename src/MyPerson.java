public class MyPerson {
    private String lastName;
    private String firstName;
    private MyAddress home;


    public MyPerson(String lastName, String firstName, MyAddress home){
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public MyAddress getHome(){
        return this.home;
    }
    public String toString(){
        return this.getFirstName() + " " + this.getLastName() + "\n" + this.home.toString();
    }
}
