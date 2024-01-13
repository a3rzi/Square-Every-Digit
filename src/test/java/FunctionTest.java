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
}
