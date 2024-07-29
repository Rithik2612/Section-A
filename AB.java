import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class AB 
{
        public static void main(String[] args) 
        {
            int[] arr1 = {1, 2, 3, 4, 5, 6};
            int[] arr2 = {1, 3, 5, 7};
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int num : arr1) 
            {
                set1.add(num);
            }
            for (int num : arr2) 
            {
                set2.add(num);
            }
            set1.retainAll(set2);
            List<Integer> commonList = new ArrayList<>(set1);
            System.out.println("" + commonList);
        }
    }
    
    

