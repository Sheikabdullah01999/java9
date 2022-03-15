import java.util.Random;
//before java 9
public interface PrivateMethod {

    static void displayRandomNum()
    {
        Random r = new Random();
        int random = r.nextInt(100);
        System.out.println("Random number" + random);
    }

    ;

    static void displayRandomNum2()
    {
        Random r = new Random();
        int random = r.nextInt(200);
        String append = "this is " + random;
        System.out.println(append);
    }

    private static int generateRandomNum()
    {
        Random r = new Random();
        return r.nextInt(200);
    }


    //From java 9
    static void displayRandomNum3()
    {
        System.out.println("Random number" + generateRandomNum());
    }




    static void displayRandomNum4()
    {
        String append = "sample" + generateRandomNum();
        System.out.println(append);
    }



}
