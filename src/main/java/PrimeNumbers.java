import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public List<Integer> getlistOfPrimeNumbers( int number ){
        List<Integer> templist = new ArrayList<>();
        templist.add(2);
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
            templist.add(tempint);
            counter++;
            tempint++;
        }
        return templist;
    }
}
