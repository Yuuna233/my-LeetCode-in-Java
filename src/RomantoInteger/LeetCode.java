class Solution {
    public int romanToInt(String s) {
        int output = RomanINT(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            int next = RomanINT(s.charAt(i + 1));
            if (RomanINT(s.charAt(i)) >= next) {
                output += RomanINT(s.charAt(i));
            } else {
                output -= RomanINT(s.charAt(i));
            }
        }
        return output;
    }

    private int RomanINT(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}