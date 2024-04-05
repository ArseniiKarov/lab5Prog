package data.generators;

import data.*;
import manager.Validator;

import java.util.Scanner;

public class WorkerGenerator {
    public static Worker createWorker(Long id) {
        System.out.println("Генерация");
        Scanner scanner = new Scanner(System.in);

        String input;
        Coordinates coordinates;
        long x;
        long y;
        Organization organization;
        String fullname;
        int employeesCount;
        OrganizationType type;
        Address officialAddress;
        String street;
        String zipCode;
        Location town;
        double locX;
        float locY;
        float locZ;


        Worker worker;
        if (id==0){
            worker = new Worker();
        }else{
            worker = new Worker(id);
        }

        while(true){
            try{
                System.out.println("Введите имя:");
                input = scanner.nextLine();
                worker.setName(input);
                if (!(input.isEmpty())){
                    break;
                }else{
                    System.out.println("имя не может быть пустым");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Введите координату x : ");
                x = Long.parseLong(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("необходимо ввести число");
            }
        }


        while (true) {
            try {
                System.out.println("Введите координату y (максимальное значение 581): ");
                y = Long.parseLong(scanner.nextLine());
                if(y<=581){
                    break;
                }else{
                    System.out.println("слишком большое значение");
                }
            } catch (Exception e) {
                System.out.println("необходимо ввести число");
            }
        }

        coordinates = new Coordinates(x, y);
        worker.setCoordinates(coordinates);

        while(true){
            try{
                System.out.println("Введите зарплату:");
                float salary = Float.parseFloat(scanner.nextLine());
                if(salary > 0){
                    worker.setSalary(salary);
                    break;
                }else{
                    System.out.println("зарплата не может быть отрицательной или 0");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Введите позицию: DIRECTOR" + "   HUMAN_RESOURCES" + "   BAKER");
                input = scanner.nextLine();
                if (Validator.intIsInt(input)){
                    int index = Integer.parseInt(input);
                    Position position = switch (index) {
                        case 1 -> Position.DIRECTOR;
                        case 2 -> Position.HUMAN_RESOURCES;
                        case 3 -> Position.BAKER;
                        default -> null;
                    };
                    if (position == null){
                        System.out.println("слишком большое значение");
                    }else{
                        worker.setPosition(position);
                        break;
                    }
                }else {
                    input = input.toUpperCase();
                    worker.setPosition(Position.valueOf(input));
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while(true){
            try{
                System.out.println("Введите имя организации:");
                fullname = scanner.nextLine();
                if (!(fullname.isEmpty())){
                    break;
                }else{
                    System.out.println("имя не может быть пустым");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        while(true){
            try{
                System.out.println("Введите количество работников:");
                employeesCount = Integer.parseInt(scanner.nextLine());
                if(employeesCount > 0){
                    break;
                }else{
                    System.out.println("количество работников не может быть отрицательной или 0");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Введите тип организации: COMMERCIAL" + "   GOVERNMENT" + "   TRUST" + "   PRIVATE_LIMITED_COMPANY" + "   OPEN_JOINT_STOCK_COMPANY");
                input = scanner.nextLine();
                if (Validator.intIsInt(input)){
                    int index = Integer.parseInt(input);
                    OrganizationType organizationType = switch (index) {
                        case 1 -> OrganizationType.COMMERCIAL;
                        case 2 -> OrganizationType.GOVERNMENT;
                        case 3 -> OrganizationType.TRUST;
                        case 4 -> OrganizationType.PRIVATE_LIMITED_COMPANY;
                        case 5 ->  OrganizationType.OPEN_JOINT_STOCK_COMPANY;
                        default -> null;
                    };
                    if (organizationType == null){
                        System.out.println("слишком большое значение");
                    }else{
                        type = organizationType;
                        break;
                    }
                }else {
                    input = input.toUpperCase();
                    type = OrganizationType.valueOf(input);
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        while(true){
            try{
                System.out.println("Введите улицу :");
                street = scanner.nextLine();
                if (!(street.isEmpty())){
                    break;
                }else{
                    System.out.println("улица не может быть пустым");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        while(true){
            try{
                System.out.println("Введите почтовый индекс:");
                zipCode = scanner.nextLine();
                if (zipCode.length() >= 7){
                    break;
                }else{
                    System.out.println("почтовый индекс должен быть не меньше 7");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        while(true){
            try{
                System.out.println("Введите почтовый индекс:");
                zipCode = scanner.nextLine();
                if (zipCode.length() >= 7){
                    break;
                }else{
                    System.out.println("почтовый индекс должен быть не меньше 7");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Введите координату x для локации: ");
                locX = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("необходимо ввести число");
            }
        }

        while (true) {
            try {
                System.out.println("Введите координату y для локации: ");
                locY = Float.parseFloat(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("необходимо ввести число");
            }
        }
        while (true) {
            try {
                System.out.println("Введите координату z для локации: ");
                locZ = Float.parseFloat(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("необходимо ввести число");
            }
        }
        town = new Location(locX, locY, locZ);

        officialAddress = new Address(street, zipCode, town);

        organization = new Organization(fullname, employeesCount, type, officialAddress);
        worker.setOrganization(organization);
        System.out.println("Генерация закончено");

        return worker;


    }
}
