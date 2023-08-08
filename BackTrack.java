import java.util.ArrayList;
import java.util.List;

public class BackTrack {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,9};
        int sum = 10;
        List<List<Integer>> integers = new ArrayList<>();
        int ind=0;
        for(int i=0; i<arr.length; i++){
            for(int j=(i+1); j<arr.length; j++){
                if(arr[i] + arr[j]==sum)
                {
                    integers.add(new ArrayList<>());
                    integers.get(ind).add(arr[i]);
                    integers.get(ind).add(arr[j]);
                    ind++;
            
                }
            }
        }

        for (List<Integer> subList : integers) {
            System.out.println(subList);
        }
        
    }
}

    
    