class Solution {
    public String decodeString(String s) {
        Stack<Integer> stackn = new Stack<>();
        Stack<String> stack = new Stack<>();
        String current = "";
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                stackn.push(k);
                stack.push(current);
                current = "";
                k = 0;
            } else if (ch == ']') {
                int repeat = stackn.pop();
                StringBuilder temp = new StringBuilder(stack.pop());
                for (int i = 0; i < repeat; i++) temp.append(current);
                current = temp.toString();
            } else {
                current += ch;
            }
        }

        return current;
    }
}
