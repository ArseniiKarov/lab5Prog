package data;

public class Address {
    private String street; //Строка не может быть пустой, Поле может быть null
    private String zipCode; //Длина строки должна быть не меньше 7, Поле не может быть null
    private Location town; //Поле не может быть null

    public Address(String street, String zipCode, Location town){
        this.street = street;
        this.zipCode = zipCode;
        this.town = town;
    }

    public String getStreet(){
        return street;
    }
    public String getZipCode(){
        return zipCode;
    }
    public Location getTown(){
        return town;
    }
}
