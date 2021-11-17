package stack;

import java.util.Arrays;
import java.util.Stack;

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int[] price, int n)
    {
        // Your code here

        Stack<Integer> st = new Stack<Integer>();
        int[] res = new int[price.length];

        for(int i =0; i< price.length; i++){
            if(st.size()==0){
                res[i]= 1;
            }
            else if(st.size()>0 && price[st.peek()]>price[i]){
                res[i] = st.peek();
            }
            else if(st.size()>0 && price[st.peek()]<price[i]){
                while(st.size()>0 && price[st.peek()]<price[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res[i] =1;
                }
                else{
                    res[i] = st.peek();
                }

            }
            st.push(i);
        }

        for(int i =0; i<price.length;i++){
            res[i] = Math.abs(i-res[i]);

        }
        System.out.println(Arrays.asList(res));
        return res;


    }

    public static void main(String[] args) {
        int N = 7; int[] price = {100 ,80, 60, 70, 60, 75, 85};

        System.out.println(Arrays.toString(calculateSpan(price, N)));

    }


}