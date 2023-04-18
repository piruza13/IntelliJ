class Mercedes extends Auto {

    private int customersCount;
    public Mercedes(int type, int speed, String brand) {

        super(type, speed, brand);
    }

    public int addStars (int speed) {
        customersCount = 10;
        if ((speed > 10) && (speed < 15))
            return customersCount + 3;

        else if ((speed > 16) && (speed < 30))
            return customersCount + 4;

            else return customersCount;
        }
    }


