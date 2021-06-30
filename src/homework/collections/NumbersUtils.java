package homework.collections;

import java.util.ArrayList;
import java.util.List;

public class NumbersUtils {
    public Integer getSum(List<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        return sum;
    }

    public List<Integer> multiplyOddNumber(List<Integer> numbers){
        List<Integer> multiplyNumbers = new ArrayList<Integer>();

        for (int i=0;i<numbers.size();i++){
            int count=numbers.get(i)%2;
            if (count==0){
           multiplyNumbers.add(i);
            }
        }

            return multiplyNumbers;
    }




}
