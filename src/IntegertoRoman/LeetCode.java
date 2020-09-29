class Solution {
    public String intToRoman(int num) {
        int[] needNums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] needStrings = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String output = "";
        for (int i = 0; i < needNums.length; i++) {
            while (num >= needNums[i] ) {
                num -= needNums[i];
                output += needStrings[i];
            }
        }
    return output;
    }
}