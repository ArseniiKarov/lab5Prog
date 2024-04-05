package data;
import data.generators.IdGenerator;
import manager.Validator;
import java.time.LocalDate;

public class Worker implements Comparable<Worker>{
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float salary; //Значение поля должно быть больше 0
    private java.time.LocalDate startDate; //Поле не может быть null
    private java.time.LocalDate endDate; //Поле может быть null
    private Position position; //Поле не может быть null
    private Organization organization; //Поле может быть null

    public Worker(String[] data) throws Exception{
        Validator.moreThanZeroLong(data[1]);
        Validator.inputIsNotEmpty(data[2], "name");
        Validator.longIsLong(data[3], "x");
        Validator.coordinateYIsRight(data[4]);
        Validator.moreThanZeroFloat(data[5]);
        Validator.positionIsRight(data[6]);
        Validator.inputIsNotEmpty(data[7], "fulllname");
        Validator.moreThanZeroInt(data[8]);
        Validator.organizationTypeIsRight(data[9]);
        Validator.inputIsNotEmpty(data[10], "street");
        Validator.inputIsNotEmpty(data[11], "zipCode");
        Validator.doubleIsDouble(data[12], "x");
        Validator.floatIsFloat(data[13], "y");
        Validator.floatIsFloat(data[14], "z");


        this.id = Long.parseLong(data[1]);
        this.name = data[2];
        this.coordinates = new Coordinates(Long.parseLong(data[3]), Long.parseLong(data[4]));
        this.creationDate = LocalDate.now();
        this.salary = Float.parseFloat(data[5]);
        this.startDate = LocalDate.now();
        this.endDate= LocalDate.now();
        this.position = Position.valueOf(data[6]);
        this.organization = new Organization(data[7], Integer.parseInt(data[8]), OrganizationType.valueOf(data[9]), new Address(data[10], data[11], new Location(Double.parseDouble(data[12]), Float.parseFloat(data[13]), Float.parseFloat(data[14]))));

    }

    public Worker(){
        this.id = IdGenerator.generateid();
        this.name = null;
        this.coordinates = null;
        this.creationDate = LocalDate.now();
        this.salary = 0;
        this.startDate = LocalDate.now();
        this.endDate= LocalDate.now();
        this.position = null;
        this.organization = null;
    }

    public Worker(long id){
        this.id = id;
        this.name = null;
        this.coordinates = null;
        this.creationDate = LocalDate.now();
        this.salary = 0;
        this.startDate = LocalDate.now();
        this.endDate= LocalDate.now();
        this.position = null;
        this.organization = null;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinate_x=" + coordinates.getX() +
                ", coordinate_y=" + coordinates.getY() +
                ", creation_date=" + creationDate +
                ", salary=" + salary+
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", position='" + position +
                ", organization full name= " + organization.getFullName() +
                ", organization employeesCount=" + organization.getEmployeesCount() +
                ", organizationType=" + organization.getType()+
                ", organizationOfficialAddress=" + organization.getOfficialAddress()+
                '}';
    }



    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getEndDate(){
        return endDate;
    }

    public Position getPosition(){
        return position;
    }
    public String getOrganizationFullName() {
        return organization.getFullName();
    }
    public Integer getEmployeesCount() {
        return organization.getEmployeesCount();
    }
    public OrganizationType getOrganizationType(){
        return organization.getType();
    }
    public Address getOfficalAddress(){
        return organization.getOfficialAddress();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public void setOrganization(Organization organization){
        this.organization = organization;
    }

    @Override
    public int compareTo(Worker worker){
        return this.organization.getEmployeesCount() - worker.organization.getEmployeesCount();
    }



}
