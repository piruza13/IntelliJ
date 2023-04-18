public class Withreco {
    public class reco {
        int a;


        public long fibo (int a) {
            if (a<=1) {
                return a;
            }
            else  return (fibo(a - 1) + fibo (a+1));




        }

    }
    public static void main (String [] args) {
        Withreco rec = new Withreco();

    }
}
