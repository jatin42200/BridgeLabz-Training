class Solution {
    public String intToRoman(int num) {
         String st="";
         int[]n={1000,900,500,400,100,90,50,40,10,9,5,4,1};
         String[]rowan={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
         for(int i=0;num>0;i++)
         {
            while(num>=n[i])
            {
                st=st+rowan[i];
                num=num-n[i];
            }

         }
         return st;
        
    }
}