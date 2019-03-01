import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrimeNumber {

    //2, 3, 5, 7, 11, 13, 17, 19, 23,

    @Test
    public void  testgetPrimeNumber(){
        PrimeNumber prime = new PrimeNumber();
        assertEquals(  13, prime.getPrimeNumber(6));
    }


}
