class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("type", 0);
        m.put("color", 1);
        m.put("name", 2);
        
        int count = 0;
        for (List<String> item: items) {
            if (ruleValue.equals(item.get(m.get(ruleKey)))) {
                count++;
            }
        }
        return count;
    }
}
