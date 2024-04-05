package data;

public class Organization {
    private String fullName; //Поле не может быть null
    private int employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле может быть null
    private Address officialAddress; //Поле может быть null

    public Organization(String fullName, int employeesCount, OrganizationType type, Address officialAddress){
        this.fullName = fullName;
        this.employeesCount = employeesCount;
        this.type = type;
        this.officialAddress = officialAddress;
    }
    public String getFullName(){
        return fullName;
    }
    public int getEmployeesCount(){
        return employeesCount;
    }
    public OrganizationType getType(){
        return type;
    }
    public Address getOfficialAddress(){
        return officialAddress;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setEmployeesCount(int employeesCount){
        this.employeesCount = employeesCount;
    }
    public void setType(OrganizationType type){
        this.type = type;
    }
    public void setOfficialAddress(Address officialAddress){
        this.officialAddress = officialAddress;
    }
}
