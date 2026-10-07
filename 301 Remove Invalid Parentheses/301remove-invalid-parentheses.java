class Solution {
    public int n;
    public String s;
    public Set<String> ans;

    public void compute(String x, int i, int bal, int remL, int remR) {
        if (i == n) {
            if (remL == 0 && remR == 0) ans.add(x);   // bal is 0 here automatically
            return;
        }

        char c = s.charAt(i);

        if (c == '(') {
            if (remL > 0) compute(x, i + 1, bal, remL - 1, remR);   // remove it
            compute(x + c, i + 1, bal + 1, remL, remR);             // keep it
        } else if (c == ')') {
            if (remR > 0) compute(x, i + 1, bal, remL, remR - 1);   // remove it
            if (bal > 0) compute(x + c, i + 1, bal - 1, remL, remR); // keep only if matched
        } else {
            compute(x + c, i + 1, bal, remL, remR);                 // letters always kept
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        this.s = s;
        n = s.length();
        ans = new HashSet<>();

        int remL = 0, remR = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') remL++;
            else if (c == ')') {
                if (remL > 0) remL--;
                else remR++;
            }
        }

        compute("", 0, 0, remL, remR);
        return new ArrayList<>(ans);
    }
}