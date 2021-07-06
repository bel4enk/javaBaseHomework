package homework.exceptions;

public class ControlAge {
    public void SetAge (int age) throws InvalidAgeException {
        if (age<0) {
            throw new InvalidAgeException("Age value must be greater than 0. But -6 value was given!",age);
        }
        this.age = age;
    }


}

class InvalidAgeException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public InvalidAgeException(String message, int num){

        super(message);
        number=num;
    }
}
