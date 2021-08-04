class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ansList = new ArrayList<>();
        Map<Character, Integer> m = Stream.of(new Object[][] {
            {'q', 0}, {'w', 0}, {'e', 0}, {'r', 0}, {'t', 0}, {'y', 0}, {'u', 0}, {'i', 0}, {'o', 0}, {'p', 0},
            {'Q', 0}, {'W', 0}, {'E', 0}, {'R', 0}, {'T', 0}, {'Y', 0}, {'U', 0}, {'I', 0}, {'O', 0}, {'P', 0},
            {'a', 1}, {'s', 1}, {'d', 1}, {'f', 1}, {'g', 1}, {'h', 1}, {'j', 1}, {'k', 1}, {'l', 1},
            {'A', 1}, {'S', 1}, {'D', 1}, {'F', 1}, {'G', 1}, {'H', 1}, {'J', 1}, {'K', 1}, {'L', 1},
            {'z', 2}, {'x', 2}, {'c', 2}, {'v', 2}, {'b', 2}, {'n', 2}, {'m', 2},
            {'Z', 2}, {'X', 2}, {'C', 2}, {'V', 2}, {'B', 2}, {'N', 2}, {'M', 2},
        }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));
        
        // m.forEach((k, v) -> {
        //     System.out.println("key:" + k + ",value:" + v);
        // });
        
        for (String word: words) {
            int initRow = m.get(word.charAt(0));
            boolean isOneRow = true;
            
            for (int i = 1; i < word.length(); i++) {
                if (m.get(word.charAt(i)) != initRow) {
                    isOneRow = false;
                    break;
                }
            }
            
            if (isOneRow) {
                ansList.add(word);
            }
        }
        
        String[] ansArr = new String[ansList.size()];
        ansArr = ansList.toArray(ansArr);
        return ansArr;
    }
}
