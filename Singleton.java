public class Singleton {

   private static Singleton s = new Singleton();

    private Singleton () {

    }

   public static Singleton getObject()
    {return s;
    }
}
