package car;

import java.util.Random;

public class Car {
    static final int DETERMINANT = 4;
    private int position;

    public Car() {
        position = 0;
    }

    int move(int nextMove) {
        if (nextMove >= DETERMINANT) {
            return ++position;
        }
        return position;
    }

    int getPosition() {
        return this.position;
    }
}
