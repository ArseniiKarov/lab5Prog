package manager;
import data.OrganizationType;
import data.Position;
import errors.IncorrectInputException;
public class Validator {
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


    public static boolean intIsInt(String args) throws IncorrectInputException {
        try{
            int value = Integer.parseInt(args);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static void doubleIsDouble(String args, String data) throws IncorrectInputException {
        try{
            double value = Double.parseDouble(args);
            throw new IncorrectInputException(data);
        }catch (Exception e){
            throw new IncorrectInputException(data);
        }
    }

    public static void longIsLong(String args, String data) throws IncorrectInputException {
        try{
            double value = Long.parseLong(args);
            throw new IncorrectInputException(data);
        }catch (Exception e){
            throw new IncorrectInputException(data);
        }
    }

    public static void floatIsFloat(String args, String data) throws IncorrectInputException {
        try{
            double value = Float.parseFloat(args);
            throw new IncorrectInputException(data);
        }catch (Exception e){
            throw new IncorrectInputException(data);
        }
    }



    public static void positionIsRight(String args) throws IncorrectInputException {
        try {
            Position.valueOf(args);
        } catch (Exception e) {
            throw new IncorrectInputException("Position");
        }
    }

    public static void organizationTypeIsRight(String args) throws IncorrectInputException {
        try {
            OrganizationType.valueOf(args);
        } catch (Exception e) {
            throw new IncorrectInputException("OrganizationType");
        }
    }

    public static void inputIsNotEmpty(String args, String data) throws IncorrectInputException{
        if (args.isEmpty() || args.trim().isEmpty()) {
            throw new IncorrectInputException(data);
        }
    }

}
