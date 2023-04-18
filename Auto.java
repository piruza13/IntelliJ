class Auto {
    private int type;
    private int speed;
    private String brand;

    public Auto() {
    }

    public Auto(int type, int speed, String brand) {

        this.type = type;
        this.speed = speed;
        this.brand = brand;
    }

    public int speedUp(int type, int speed) {

        if (type == 1)
            return speed + 5;

        else if (type == 2)
            return speed + 10;

        else return speed + 3;
    }

    public int speedUp() {
        speed = Integer.MAX_VALUE;
        return speed;
    }

    public int getType (int type) {
        return type;
    }

    public int getSpeed (int speed) {
        return speed;
    }
    public String getBrand (String brand) {
        return brand;
    }
   public void setBrand () {
        this.brand = brand;
   }

}

