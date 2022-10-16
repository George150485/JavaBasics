import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        //This is a comment not seen by the compiler one line
        /* Multiple line comment
           set of lines
           not only one line
         */
        System.out.println("We will not say Hello world!");
        //declaring an object
        DataTypes dataTypes = new DataTypes();
        //starting from Java 10 variable binding is supported using keyword var
        var noToBeInterpretedAsANumber = 10;
        var stringToBeBinded = "This is a string";
        //Printing the value of the log 10
        System.out.println(Math.log10(100));
        //rounding the value using typecasting
        System.out.println((int) Math.log10(100));
        //another way of achieving the previous result by using Math.round
        System.out.println(Math.round((Math.log10(100))));
        int x = 3;
        x += 1.5;
        //The previous operation is valid and the value of the double will be considered as an Integer
        System.out.println(x);
        int m = 7;
        int n = 7;
        int a = 2 * ++m; // now a is 16, m is 8
        int b = 2 * n++; // now b is 14, n is 8
        System.out.println(a + " this is a " + b + " and this is b");
        //conditional () operator where if true n will take the 1st value else it will take 2nd
        n = (m == 16) ? 1 : 2;
        System.out.println(n);
        String currentSeason = input.nextLine();
        String season = switch (currentSeason){
            case "Summer"-> "summer";
            case "Winter"-> "winter";
            default -> "we do not know";
        };
        System.out.println(season);

    }
}