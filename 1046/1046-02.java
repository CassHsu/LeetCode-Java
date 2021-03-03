class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        
        int m1 = list.get(0);
        list.remove(0);
        int m2 = list.get(0);
        list.remove(0);
        list.add(m1 - m2);
        
        return lastStoneWeight(list.stream().mapToInt(i -> i).toArray());
    }
}
