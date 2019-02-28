import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrime {

    @Test
    public void  testPrime5(){
        Prime prime = new Prime();
        List<Integer> reuslList = Arrays.asList(2,3,5,7,11);
        assertEquals(  reuslList, prime.getlistOfPrimeNumbers(5));
    }

    //2, 3, 5, 7, 11, 13, 17, 19, 23,

    @Test
    public void  testPrime9(){
        Prime prime = new Prime();
        List<Integer> reuslList = Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19, 23 );
        assertEquals(  reuslList, prime.getlistOfPrimeNumbers(9));
    }

    @Test
    public void  testPrime1(){
        Prime prime = new Prime();
        List<Integer> reuslList = Arrays.asList( 2 );
        assertEquals(  reuslList, prime.getlistOfPrimeNumbers(1));
    }




}
