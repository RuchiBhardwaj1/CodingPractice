package test;

import java.util.*;

public class Ninejulytest {

    public int[] sortColors(int[] arr){
        int i =0;
        int j =0;
        int k = arr.length-1;
        while(j<k){
            if(j>i && arr[j]  ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            else if( arr[j] ==2){
                int temp= arr[j];
                arr[j] = arr[k];
                arr[k]= temp;
                k--;
            }
            else{
                j++;
            }

        }
        return arr;
    }

    public List<List<Integer>> threeSum(int[] threeS){
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(threeS);

        for(int i = 0; i<threeS.length-2;i++ ){
            if( i ==0 || threeS[i] != threeS[i-1]){
                int j =i+1;
                int k =threeS.length-1;
                while(j<k){
                    int s = threeS[i]+threeS[j]+threeS[k];
                    if( s==0){
                        res.add(Arrays.asList(threeS[i],threeS[j],threeS[k]));
                        while(j<k && threeS[j] == threeS[j+1]) j++;
                        while(j<k && threeS[k]== threeS[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(s>0){
                        k--;
                    }
                    else {
                        j++;
                    }

                }
            }
        }
        return res;
    }
//
//    public int maximaRectangle(char[][] matrix){
//        int m = matrix.length;
//        if(m == 0) return 0;
//        int n = matrix[0].length;
//        int ans =0;
//        int a
//    }

    public boolean validPranthesis(String s){
        if(s.length()==0) return false;

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c =='(' || c =='['||c=='{' ){
                stack.push(c);
            }
            else {
                if(stack.isEmpty())
                    return false;
                if(c ==']' && stack.peek()!='['){
                    return false;
                }
                if(c =='}' && stack.peek()!='{') {
                    return false;
                }
                if(c ==')' && stack.peek()!='(') {
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }

    public void topKFrequent(int[] freq, int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<freq.length;i++){
            map.put(freq[i],map.getOrDefault(freq[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));

        for(int x: map.keySet()){
            pq.add(x);

        }
        int[] test = new int[k];

        for(int i =0; i< k; i++){
            test[i] = pq.poll();
        }

        System.out.println(Arrays.toString(test));

    }


    public int[] sortArray(int[] arry){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i: arry){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]==b[1] ? b[0]-a[0] : a[1]-b[1]);

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            pq.add(new int[] {entry.getKey(), entry.getValue()});
        }

        int index =0;
        while (!pq.isEmpty()){
            int[] min = pq.poll();
            while (index<arry.length&& min[1]>0){
                arry[index++] = min[0];
                min[1]--;
            }
        }
        return arry;

    }


    public void permutaion(String inp , String op){
        if(inp.length()==0) {
            System.out.println(op);
            return;
        }

        String op1 = op;
        String op2 = op;
        op2 = op1+inp.charAt(0);
        inp = inp.substring(1);
        permutaion(inp,op1);
        permutaion(inp,op2);
    }




    public static void main(String[] args) {
        Ninejulytest n = new Ninejulytest();
//        sort colors
        int[] arr = { 0,1,2,0,2,1,0};
        System.out.println(Arrays.toString(n.sortColors(arr)));
//        threesum
        int[] threeS = {-1,0,1,2,-1,4};
        System.out.println(n.threeSum(threeS));

//        validPranathesis
        String  s = "{}()(";
        System.out.println(n.validPranthesis(s));

//        kthfreq
                int[] arr2 = { 1,1,1,2,2,3,4,4,4,4};
        int k =2;
      n.topKFrequent(arr2,k);

//      sortArrayByIncreasingFrequency
        int[] arry = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(n.sortArray(arry)));

//        permutation

        String inp = "abc";
        String op = "";
        n.permutaion(inp,op);
    }


}
