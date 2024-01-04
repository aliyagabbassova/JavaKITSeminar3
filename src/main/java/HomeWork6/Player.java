package HomeWork6;
import java.util.Random;

public class Player {
    boolean choiceAltered() {
        return false;
    }

    int initialChoice(){
        return new Random().nextInt(3);
    }
}
