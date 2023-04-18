 class general {
    public static void main (String [] args) {
        BMW bmw0 = new BMW ( 1, 100, "Rolls-Royce",  1000);
        BMW bmw1 = new BMW ("MINI", 2000);

        System.out.println (bmw0.getBrand("Rolls-Royce"));
        System.out.println (bmw1.getBrand("MINI"));




    }
}
