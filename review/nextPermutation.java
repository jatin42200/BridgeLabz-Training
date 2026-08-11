import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w) {
       
        char [] arr=w.toCharArray();
        int l = arr.length;
        
        int i=l-2;
      while(i>=0 && arr[i]>=arr[i+1])
      {
        i--;
      }
      
      if(i<0)
      {
        return "no answer";
      }
      
      
      int k=l-1;
      while(arr[k]<=arr[i])
      {
        k--;
      }
      //swapping
      char swap=arr[i];
      arr[i]=arr[k];
      arr[k]=swap;
      
      
      int left=i+1;
      int right=l-1;
      
      while(left < right)
      {
        swap=arr[left];
        arr[left]=arr[right];
        arr[right]=swap;
        
        left++;
        right--;
      }
      String ans = "";
      for(int j=0;j<arr.length;j++)
      {
        ans =ans+arr[j];
      }
      return ans;

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
