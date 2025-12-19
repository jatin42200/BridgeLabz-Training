class Solution {
    public int reverse(int x) {
       int k=x;
            long sum=0;
            if(x<0)
            {
                x=(-1)*x;
            }
        while(x>0)
        {
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        } 
         if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE)
        {
            return 0;
        }
if(k<0)
{
    return (int)((-1)*sum);

}
else
{
return (int)(sum);
}
    }
}