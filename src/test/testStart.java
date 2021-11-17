package test;

import java.util.*;

public class testStart {

    public static int secondLargets(int[] arr){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i =0; i< arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if( arr[i]<=first && arr[i]>second){
                second = arr[i];
            }

        }
        return second;
    }

    public static boolean paranthesis(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                    return false;
                if(c==')'&& stack.peek()!='(')
                    return false;
                if(c=='}'&& stack.peek()!='{')
                    return false;
                if(c==']'&& stack.peek()!='[')
                    return false;
                stack.pop();
            }

        }

        return stack.isEmpty();
    }

    public static Stack<Integer> sorAstack(Stack<Integer> stack){

        Stack<Integer> temp = new Stack<>();

        while(!stack.isEmpty()){
            int tempq = stack.pop();

            while(!temp.isEmpty()&& tempq<temp.peek()){
                    stack.push(temp.peek());
                    temp.pop();
            }
            temp.push(tempq);

        }
        return temp;
    }

    public static int minStack(Stack<Integer> st){

        int min =st.pop();
        while(!st.isEmpty()){

            int temp = st.peek();
            if(temp<min){
                min = temp;
            }
            st.pop();
        }
        return min;
    }

    public static int KthLargest(int[] arr,int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i =0; i< arr.length;i++){
            pq.add(arr[i]);

            while(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void kthFrequent(int[] arr , int k){
        Map<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        for(int x: map.keySet() ){
            pq.add(x);
        }

        int[] test = new int[k];

        for(int i =0; i<k;i++){

            test[i] = pq.poll();
        }
        System.out.println(Arrays.toString(test));
    }

    public static void permutationWithSpaces(String inp, String op){

        if(inp.length()==0){
            System.out.println(op);
            return;
        }

        String op1 = op;
        String op2 = op;
        op1=op1+"_";
        op1=op1+inp.charAt(0);
        op2 = op2+inp.charAt(0);
        inp = inp.substring(1);
        permutationWithSpaces(inp,op1);
        permutationWithSpaces(inp,op2);

    }



    public static void generateAllPranthesis(int n){
        ArrayList<String> res  = new ArrayList<>();

        int open = n;
        int close = n;
        String op="";
        solve(open,close,res,op);
        System.out.println(res);


    }
    public static void solve(int open, int close, ArrayList<String> li , String op){

        if(open ==0  && close == 0){
            li.add(op);
            return;
        }

        if(open!=0){
            String op1 = op;
            op1= op1+"(";
            solve(open-1, close, li,op1);
        }
        if(open< close){
            String op2 = op;
            op2 = op2+")";
            solve(open, close-1,li,op2);

        }

    }

    public static void permutationOfString(String inp , String op){


    }

    public static boolean pallindrome(String str){

        int i = 0;
        int j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;

    }

    public static boolean validAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int[] re = new int[26];

        Arrays.fill(re,0);
        for(int i =0; i<s.length();i++){
            re[s.charAt(i) - 'a']++;
            re[t.charAt(i) - 'a']--;
        }

        for(int i : re){
            if(i!=0)
                return false;
        }
        return true;

    }

    public static List<List<String>>  groupAnagram(String[] s){
        List<List<String>> res = new ArrayList<>();

        Map<String , List<String>> map = new HashMap<>();

        for(String i: s){
           char[] c = i.toCharArray();
           Arrays.sort(c);
           String sorted = new String(c);

           if(!map.containsKey(sorted)){
               map.put(sorted,new  ArrayList());
           }
           map.get(sorted).add(i);
        }
        res.addAll(map.values());
        return res;
    }

    public static int[] twoSum(int[] arr, int target){

        if(arr==null) return arr;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{i, target-arr[i]};
            }
            map.put(arr[i],i);
        }
        return null;

    }

    public static List<List<Integer>> threeSum(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n<3) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        for(int i =0; i< arr.length-2; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                int j = i+1;
                int k = n-1;
                while(j<k){
                    int s = arr[i]+arr[j]+arr[k];
                    if(s==0){
                        res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                        while(j<k && arr[j] == arr [j+1]) j++;
                        while(j<k&& arr[k] == arr[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(s>0){
                        k--;
                    }
                    else{
                        j++;
                    }
                }

            }

        }
        return res;
    }

    public static int print(int num){
        if(num==0){
            return 0;
        }
        return print(num-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,7,3,9,4,6};
//        System.out.println(secondLargets(arr));
//        String s = "()";
//        System.out.println(paranthesis(s));

//        Stack<Integer> st = new Stack<>();
//        st.push(2);
//        st.push(10);
//        st.push(5);
//        st.push(7);
//        st.push(6);
//        st.push(4);

//        System.out.println(sorAstack(st));
//        System.out.println(minStack(st));

        int k = 2;

//        System.out.println(KthLargest(arr,k));

//        int[] arr2 = { 1,1,1,2,2,3,4,4,4,4};
//
//
//        kthFrequent(arr2,k);

//        String inp = "ABC";
//        String op = "";
//        op = op+inp.charAt(0);
//        inp = inp.substring(1);
//
//        permutationWithSpaces(inp,op);

//        int n = 3;
//        generateAllPranthesis(n);

//        String s = "aba";
//        System.out.println(pallindrome(s));

//        String s = "dog";
//        String t ="god";
//
//        System.out.println(validAnagram(s,t));
//
//         String[] s = {"eat","tea","tan","ate","nat","bat"};
//        System.out.println(groupAnagram(s));

//        int[] n = {2,7,11,15};
//        int target =9;
//        System.out.println(Arrays.toString(twoSum(n,target)));

//        int[] y = {-1,0,1,2,-1,-4};
//        System.out.println(threeSum(y));

        int num =100;
        System.out.println(print(num));


    }


}
