package GuideTour.demo.model;

public class Book {
    //declaration of variables
    private Integer id; 
    private String name;
    private String surname;
    private String PassportNumber;
    public Object demo;

    public Book(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {  //get/set method for each variables. Get() returns the value of the variable name  
        return name;
    }
    public String getPassportNumber() {
        return PassportNumber;
    }
    public void setPassportNumber(String passportNumber) {  // set() takes a parameter and assigns it to the name variable
        this.PassportNumber = passportNumber;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public Book (Integer id, String name, String surname, String PassportNumber){
        //constructor called when an instance of the class is created
        this.id = id; //this. refers to the current object in a method or constructor
        this.name = name;  
        this.surname = surname;
        this.PassportNumber = PassportNumber; 

    }

    public boolean containsKey(Integer id2) {
        return false;
    }

   

}
