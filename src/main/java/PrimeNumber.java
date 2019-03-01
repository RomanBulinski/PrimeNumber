import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {


    public Integer getPrimeNumber(int number ){

        Integer tempPrime = 2;

        int tempint = 3;
        int counter = 0;
        while( counter < number-1 ){
            int i = 2;
            while(  i < tempint ){
                if( tempint%i == 0){
                    tempint++;
                }
                i++;
            }
            tempPrime = tempint;
            counter++;
            tempint++;
        }
        return tempPrime;
    }

}
