class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> m = new HashMap<>();
        
        for (String email: emails) {
            String[] names = email.split("@");
            
            String local = names[0].replaceAll("\\+.*","");
            local = local.replace(".", "");
            
            StringBuffer sb = new StringBuffer();
            sb.append(local);
            sb.append("@");
            sb.append(names[1]);
            String k = sb.toString();
            
            if (m.get(k) == null) {
                m.put(k, 1);
            }
        }
        
        return m.size();
    }
}
