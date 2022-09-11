import java.util.Arrays;
import java.util.ArrayList;
public class Exercise7 {

public static void main(String[] args)
    {
        String [] alphabets = {"A", "B", "C", "D" };

        System.out.println(alphabets);

        alphabets.remove("D");          //Element is present

        System.out.println(alphabets);

        alphabets.remove("Z");          //Element is NOT present

        System.out.println(alphabets);
    }
 }