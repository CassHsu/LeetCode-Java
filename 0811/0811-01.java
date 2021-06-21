class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String cp: cpdomains) {
            String[] cpArr = cp.split(" ");
            String[] domArr = cpArr[1].split("\\.");
            List<String> domains = Arrays.asList(domArr);
            
            int count = Integer.valueOf(cpArr[0]);
            int size = domains.size();
            for (int i = size - 1; i >= 0; i--) {
                String curr = String.join(".", domains.subList(i, size));
                countMap.put(curr, countMap.getOrDefault(curr, 0) + count); 
            }
        }
        
        List<String> ret = new ArrayList<>();
        for (String domain: countMap.keySet()) {
            ret.add("" + countMap.get(domain) + " " + domain);
        }
        return ret;
    }
}
