public class SportsCar extends Car {


    private int topSpeed = 100;
    public int getTopSpeed() {


        return topSpeed;
    }

    final public int accelerate() {
        return topSpeed+10;
    }
}
