class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        
        float im3;
        float im5;
        for (int i = 1; i <= n; i++) {
            im3 = i % 3;
            im5 = i % 5;
            if (im3 == 0.0f && im5 == 0.0f) {
                res.add("FizzBuzz");
            } else if (im3 == 0.0f) {
                res.add("Fizz");
            } else if (im5 == 0.0f) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}