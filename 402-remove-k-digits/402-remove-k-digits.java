class Solution {
    public String removeKdigits(String num, int k) {
        if (num == null || num.isEmpty() || num.length() <= k) {
            return "0";
        }
        int rem = num.length() - k;
        char[] buffer = new char[rem];
        int start = 0;
        for (int i = 0; i < rem; i++) {
            int end = num.length() - 1 - (rem - 1 - i);
            char minVal = num.charAt(start);
            int index = start;
            for (int j = start; j <= end; j++) {
                if (num.charAt(j) < minVal) {
                    minVal = num.charAt(j);
                    index = j;
                }
            }
            buffer[i] = minVal;
            start = index + 1;
        }
        int firstNonZero = -1;
        for (int i = 0; i < rem; i++) {
            if (buffer[i] != '0') {
                firstNonZero = i;
                break;
            }
        }
        if (firstNonZero == -1) {
            return "0";
        }
        return (new String(buffer)).substring(firstNonZero);
    }
}
