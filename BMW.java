class BMW extends Auto {
    private int revenue;
    public BMW (int type, int speed, String brand, int revenue) {
        super(type, speed, brand);
        this.revenue = revenue;
    }

   public BMW(String brand, int revenue) {
        super.setBrand();
        this.revenue = revenue;
    }

    public int speedUp (int speed) {

        return speed + 20;
    }

}
