class Solution {
    String[] digits;
    ArrayList<Integer> signed;
    int size;

    public int alternateDigitSum(int n) {
        this.digits = Integer.toString(n).split("");
        this.size = digits.length;
        this.signed = new ArrayList<Integer>();
        
        this.sign(0, 1);
        int sum = 0;

        for (Integer v: this.signed) {
          sum += v;
        }

        return sum;
    }

    private void sign(int i, int s) {
        if (i < 0 || i >= this.size) return;

        Integer v = Integer.valueOf(this.digits[i]);
        if (s < 0) this.signed.add(v * -1);
        else this.signed.add(v);

        this.sign(i + 1, s * -1);
    }
}
