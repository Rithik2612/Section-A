import java.util.*;
public class SumOfLarge {
    public static void main(String[] args) 
    {
        int[] arr = {1, 5, 8, 6, 7, 9, 9, 9};
        Set<Integer> uniqueValues = new HashSet<>();
        for (int num : arr) 
        {
            uniqueValues.add(num);
        }
        List<Integer> uniqueList = new ArrayList<>(uniqueValues);
        Collections.sort(uniqueList, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < 3 && i < uniqueList.size(); i++) 
        {
            sum += uniqueList.get(i);
        }
        System.out.println("" + sum);
    }
}

