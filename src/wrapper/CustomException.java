package wrapper;

public class CustomException {
    public static void main(String[] args) {
        int age = 810;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeExcetion("age needs between 18 and 20");
        }
        System.out.println("right age area");
    }
}

class AgeExcetion extends RuntimeException {
    public AgeExcetion(String message) {
        super(message);
    }
}