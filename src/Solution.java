import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */

    public List<Integer> subarraySum(int[] nums) {

        List<Integer> result = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;

        map.put(sum,0); //(sum,前幾個數的和)

        for(int i = 0 ; i < nums.length ; i++){

            sum += nums[i];
            if(map.containsKey(sum)){
                result.add(map.get(sum));
                result.add(i);
                return result;
            }
            map.put(sum,i+1);
        }

        return result;

    }
}