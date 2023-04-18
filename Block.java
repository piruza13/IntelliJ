public class Block {

    private static String person;
    private static int age;
    private static String a;

    static {
        person = "I am ";
        age = 27;
        a = " years old.";
        System.out.println("How old are you?");

    }
    public int getage() {
        return age;
    }
    public String getPerson () {
        return person;
    }
    public String geta () {
        return a;
    }
}
