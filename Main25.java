// Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int k=x;
        int s=0;
        while(x!=0)
        {
            int a=x%10;
            s=s*10+a;
            x=x/10;
        }
        if(s==k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
