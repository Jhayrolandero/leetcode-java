class Solution {
    public boolean isPalindrome(int x) {
    int digit, palindrome = 0, y = x;
     if( x < 0)//negative numbers are not palindrome
     {
         return false;
     }
        if (x == 0)// 0 is a palindrome
        {
            return true;
        }
        while(x != 0)
        {
            digit = x%10;
            x = x/10;
            palindrome = (palindrome * 10) + digit;// counter for our palindrome
        }
        if(y == palindrome)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
