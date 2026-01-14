class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int k=x;
        while(x>0)
        {
            int r=x%10;
            sum=sum+r;
            x=x/10;

        }
        if(k%sum==0)
        return sum;
        else
        return -1;
        
    }
}