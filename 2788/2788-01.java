class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();

        for (String word: words) {            
            String[] arr = word.split("\\" + separator);

            for (String w: arr) {
                if ("".equals(w) == false) {
                    res.add(w);
                }
            }
        }

        return res;
    }
}
