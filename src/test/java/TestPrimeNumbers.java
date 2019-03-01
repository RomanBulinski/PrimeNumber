import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrimeNumbers {

    @Test
    public void  testPrime5(){
        PrimeNumbers prime = new PrimeNumbers();
        List<Integer> reuslList = Arrays.asList(2,3,5,7,11);
        assertEquals(  reuslList, prime.getlistOfPrimeNumbers(5));
    }

    //2, 3, 5, 7, 11, 13, 17, 19, 23,

    @Test
    public void  testPrime9(){
        PrimeNumbers prime = new PrimeNumbers();
        List<Integer> reuslList = Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19, 23 );
        assertEquals(  reuslList, prime.getlistOfPrimeNumbers(9));
    }

    @Test
    public void  testPrime1(){
        PrimeNumbers prime = new PrimeNumbers();
        List<Integer> reuslList = Arrays.asList( 2 );
        assertEquals(  reuslList, prime.getlistOfPrimeNumbers(1));
    }




}
