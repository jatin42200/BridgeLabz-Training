import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static int sherlockAndAnagrams(String s) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                freq[s.charAt(j) - 'a']++;

                String key = Arrays.toString(freq);

                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int ans = 0;

        for (int value : map.values()) {
            ans += value * (value - 1) / 2;
        }

        return ans;
    }
}

public class SherlockAnagram {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}