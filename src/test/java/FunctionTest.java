import org.junit.jupiter.api.Test;

public class FunctionTest {
    @Test
    void charAtFunction() {
        String str = "maryam";
        for (int i = 0; i<str.length(); i++){
        char result = str.charAt(i);
            System.out.println(result);
    }
}

    @Test
    void CharacterGetNumericValue() {
        char a = '8';
        int i = Character.getNumericValue(a);
        System.out.println(i*i);
    }

    @Test
    void process() {
        StringBuilder stringBuilder = new StringBuilder();

        int n = 765;
        String n2str = String.valueOf(n);
        System.out.println("string"+n2str);
        for (int i = 0; i< n2str.length(); i++){
            char str2char = n2str.charAt(i);
            System.out.println("char" + str2char);
            int char2int = Character.getNumericValue(str2char);
            System.out.println("int"+ char2int);
            int squared = char2int*char2int;
            System.out.println("squar"+squared);
            stringBuilder.append(squared);
            System.out.println(stringBuilder);

        }
    }

    @Test
    void stringBuilder() {
        StringBuilder stringBuilder = new StringBuilder("welcome");
        stringBuilder.append(20);
//        stringBuilder.append(" to");
//        stringBuilder.append(" iran");
//        stringBuilder.insert(3,"java");
 //       stringBuilder.replace(2,4,"abd");
 //       stringBuilder.delete(2,4);
 //       stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    @Test
    void toSTRING() {
        Integer n = 5;
        String n2string = n.toString();
    }

    @Test
    void valueOF() {
        int n = 10;
        String n2string = String.valueOf(n);
    }
}
