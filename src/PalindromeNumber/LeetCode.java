class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int judge=0;
        while(num!=0){
            judge=judge*10+num%10;
            num/=10;
        }
        return x==judge;
    }
}