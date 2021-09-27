package sorting;

public class lc1895 {
    /**
     * 첫번째 풀이
     * Runtime: 3ms
     * Memory: 37.3 MB
     */
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] bucket = new String[words.length];

        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            System.out.println(index);
            bucket[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", bucket);
    }
}
