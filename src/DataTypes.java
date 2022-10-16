import lombok.Data;
import lombok.NoArgsConstructor;

//adding setters and getters and the overloaded constructor using Lombok
@Data
//adding no args constructor
@NoArgsConstructor
public class DataTypes {
    //int 4 Bytes range -+2147483648
    //2 * 2147483648
    private int number = 3;
    //short 2 bytes 32,768
    private short no = 2;
    //long 8 bytes 9,000,000,000,000,000,000
    private long longerNumber = 221231232;
    //byte 128 from 0 to 127 or from 0 to -128 because 0 is counted with +range
    private byte veryShortNumber = -128;
    //float range 3 * 10 ^ 38
    private float decimalNumber = 0.4F;
    //double 1.2 * 10 ^ 301
    private double bigDecimalNumber = 0.3D;
    //character
    private char character = 'c';
    //character stream string
    private String x = "This is a character stream";
    //boolean either true or false value
    private boolean condition = true;
}
