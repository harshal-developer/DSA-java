package Mock_Dated_26_05_25;

class customException extends Exception{
    public customException(String msg){ //constructuor
        super(msg);
    }
}
public class Custom_exception {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (customException e) {
            System.out.println("Caught : " + e.getMessage());
        }
    }

    static void validateAge(int age) throws customException{
        if(age < 18){
            throw new customException("Age must be greater than 18");
        }

        System.out.println("Age is valid");
    }
}
