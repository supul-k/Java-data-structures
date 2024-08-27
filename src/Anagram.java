import java.util.*;

public class Anagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        // HashMap to store the grouped anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a char array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the map based on the sorted string as the key
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        // Return the grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Anagram ana = new Anagram();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = ana.groupAnagrams(strs);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
