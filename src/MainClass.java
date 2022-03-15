import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        System.out.println("____private method_____");

        System.out.println("Before java 9");
        System.out.println("__________________");
         PrivateMethod.displayRandomNum();
         PrivateMethod.displayRandomNum2();

        System.out.println("FROM java 9");
        System.out.println("__________________");
         PrivateMethod.displayRandomNum3();
         PrivateMethod.displayRandomNum4();

        System.out.println("_____TRY with resource____");

        Java9TrywithResource java=new Java9TrywithResource();
        java.display();

        System.out.println("______@SafeVarargs______");

        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        MainClass m=new MainClass();
        //m.display(list);
        m.display(1,2,2,5,5,6,7,7,8);

       //AnonymousClass
        System.out.println("____AnonymousClass______");
        //Java 9 introduced a new feature that allows us to use diamond operator with anonymous classes

        AbstractClass<String> a = new AbstractClass<>()
        {                                      // diamond operator is empty, compiler infer type
            String show(String a, String b)
            {
                return a+b;
            }
        };
        String result = a.show("Java","9");
        System.out.println(result);

    }

    //It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
    @SafeVarargs
    private void display(int... products)
    {
        for (Integer product : products)
        {
            System.out.println(product);
        }
    }


}


