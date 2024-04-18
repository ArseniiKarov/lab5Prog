package manager;

import data.OrganizationType;
import data.Position;
import data.Worker;
import data.generators.IdGenerator;
import errors.IncorrectInputException;

public class Validator {
    IdGenerator idGenerator = new IdGenerator();
    public Worker getValidatedElement(Worker worker){
        if (worker.getId() < 0 || worker.getName() == null || worker.getName().isBlank() || worker.getCoordinates() == null || worker.getCoordinates().getY() > 581 || worker.getSalary() < 0 || worker.getStartDate() == null || worker.getEndDate() == null || worker.getPosition() == null || worker.getOrganizationType() == null){
            return null;
        }else{
            if (worker.getId() == 0){
                worker.setId(IdGenerator.generateid());
            }
            return worker;
        }
    }

    /**
     * Метод для проверки значений больше нуля
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void moreThanZeroLong(String args) throws IncorrectInputException {
        try {
            long id = Long.parseLong(args);
            if (id < 0) {
                throw new IncorrectInputException("id");
            }
        } catch (Exception e) {
            throw new IncorrectInputException("id");
        }
    }

    /**
     * Метод для проверки значений больше нуля
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void moreThanZeroFloat(String args) throws IncorrectInputException {
        try {
            float salary = Float.parseFloat(args);
            if (salary < 0) {
                throw new IncorrectInputException("salary");
            }
        } catch (Exception e) {
            throw new IncorrectInputException("salary");
        }
    }
    /**
     * Метод для проверки значений больше нуля
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void moreThanZeroInt(String args) throws IncorrectInputException {
        try {
            int employeesCount = Integer.parseInt(args);
            if (employeesCount < 0) {
                throw new IncorrectInputException("employeesCount");
            }
        } catch (Exception e) {
            throw new IncorrectInputException("employeesCount");
        }
    }


    /**
     * Метод для проверки координаты x
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */
    public static void coordinateYIsRight(String args) throws IncorrectInputException, NullPointerException {
        try {
            long y = Long.parseLong(args);
            if (y > 581) {
                throw new IncorrectInputException("y");
            }
            throw new NullPointerException("y");
        } catch (Exception e) {
            throw new IncorrectInputException("y");
        }
    }

    /**
     * Метод для проверки координаты y
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static boolean intIsInt(String args) throws IncorrectInputException {
        try{
            int value = Integer.parseInt(args);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    /**
     * Метод для проверки типа данных
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void doubleIsDouble(String args, String data) throws IncorrectInputException {
        try{
            double value = Double.parseDouble(args);
            throw new IncorrectInputException(data);
        }catch (Exception e){
            throw new IncorrectInputException(data);
        }
    }

    /**
     * Метод для проверки типа данных
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void longIsLong(String args, String data) throws IncorrectInputException {
        try{
            double value = Long.parseLong(args);
            throw new IncorrectInputException(data);
        }catch (Exception e){
            throw new IncorrectInputException(data);
        }
    }
    /**
     * Метод для проверки типа данных
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void floatIsFloat(String args, String data) throws IncorrectInputException {
        try{
            double value = Float.parseFloat(args);
            throw new IncorrectInputException(data);
        }catch (Exception e){
            throw new IncorrectInputException(data);
        }
    }



    /**
     * Метод для проверки позиции
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */
    public static void positionIsRight(String args) throws IncorrectInputException {
        try {
            Position.valueOf(args);
        } catch (Exception e) {
            throw new IncorrectInputException("Position");
        }
    }
    /**
     * Метод для проверки типа организации
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void organizationTypeIsRight(String args) throws IncorrectInputException {
        try {
            OrganizationType.valueOf(args);
        } catch (Exception e) {
            throw new IncorrectInputException("OrganizationType");
        }
    }

    /**
     * Метод для проверки непустой строки
     * @param args аргумент
     * @throws IncorrectInputException ошибка неправильного значения
     */

    public static void inputIsNotEmpty(String args, String data) throws IncorrectInputException{
        if (args.isEmpty() || args.trim().isEmpty()) {
            throw new IncorrectInputException(data);
        }
    }
    public IdGenerator getIdGenerator(){
        return idGenerator;
    }

}
