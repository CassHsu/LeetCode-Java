class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        ArrayList<String> ans = new ArrayList<>();
        
        for (String w: words) {
            if (w.length() <= 2) {
                ans.add(w.toLowerCase());
            } else {
                ans.add(Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase());
            }
        }
        
        return String.join(" ", ans);
    }
}
