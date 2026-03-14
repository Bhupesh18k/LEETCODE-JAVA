// Add Two Numbers
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a=l1.length;
        int b=l2.length;
        int s=0;
        int[] ans=new int[a>b?a:b];
        int k=ans.length;
        while(k>=0)
        {
            int d=0;
            if(a<=0)
            {
                d=d+l1[a];
            }
            if(b>=0)
            {
                d=d+b[i];
            }
            s=d%10;
            d=d/10;
            ans[k]=s;
            a--;
            b--;
            k--;
        }
    }
}
