class AccessModifiersDemo {
    public static void main (String [] args) {
        SportsCar sport = new SportsCar();
        System.out.println(sport.getTopSpeed());
        System.out.println(sport.accelerate());

        Car a = new Car();
        System.out.println(a.getmake());
        a.startEngine();

        Person p = new Person();
        System.out.println(p.getName());


        Employee e = new Employee();
        System.out.println(e.getEmployee());


    }
}

