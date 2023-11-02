// 884. Uncommon Words from two Sentences.java

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : str1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : str2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> myList = new ArrayList<>();

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                myList.add(entry.getKey());
            }
        }

        String[] ans = new String[myList.size()];
        return myList.toArray(ans);
    }
}
