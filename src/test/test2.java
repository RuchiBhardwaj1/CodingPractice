package test;

import java.util.*;

public class test2 {

    public static void nextGreaterElement(int[] arr){

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> res = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){
            if(stack.size()==0){
                res.push(-1);
            }
            if(stack.size()>0 && stack.peek()>arr[i]){
                res.push(stack.pop());
            }
            if(stack.size()>0 && stack.peek()<=arr[i]){
                while(stack.size()>0 && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    res.push(-1);
                }
                else{
                    res.push(stack.peek());
                }

            }
            stack.push(arr[i]);
        }

        while(!res.isEmpty()){
            System.out.println(res.pop());
        }

    }

    public static int[] nextGreterTwoArray(int[] arr1, int[] arr ){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map  = new HashMap<>();

        int[] res = new int[arr1.length];

        for(int i = arr.length-1; i>=0; i--){
            if(stack.size()==0){
                map.put(arr[i],-1);
            }
            if(stack.size()>0 && stack.peek()>arr[i]){
                map.put(arr[i], stack.peek());
            }
            if(stack.size()>0 && stack.peek()<arr[i]){
                while(stack.size()>0 && stack.peek()<arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    map.put(arr[i],-1);
                }
                else{
                    map.put(arr[i],stack.peek());
                }

            }
            stack.push(arr[i]);
        }

        for(int i =0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                res[i] = map.get(arr1[i]);
            }
        }
        return res;
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> qu,int k ){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> res = new LinkedList<>();

        for(int i =1; i<=k ; i++){
            stack.push(qu.poll());
        }

        while(!stack.isEmpty()){
            res.offer(stack.pop());
        }
        while(!qu.isEmpty()){
            res.offer(qu.peek());
            qu.poll();
        }
        return res;

    }

    public static void sortColors(int[] arr){
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
        System.out.println(Arrays.toString(arr));
    }

    public static int maxAreaHistogram(int[] arrea){
        Stack<Integer> stack = new Stack<>();
        int n = arrea.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i =0 ; i<n;i++){

            while(!stack.isEmpty() && arrea[i]<=arrea[stack.peek()]){
                stack.pop();

            }
            if(stack.isEmpty()) left[i]=0;
            else left[i] = stack.peek()+1;
            stack.push(i);

        }
        stack.clear();
        for(int i =n-1 ; i>=0;i--){

            while(!stack.isEmpty() && arrea[i]<=arrea[stack.peek()]){
                stack.pop();

            }
            if(stack.isEmpty()) right[i]=0;
            else right[i] = stack.peek()-1;
            stack.push(i);

        }

        int maxarea = 0;
        for(int i =0; i<n;i++ ){
            int width = right[i]-left[i]+1;
            int area = arrea[i]*width;
            maxarea = Math.max(maxarea,area);
        }
        return maxarea;



    }

    public static List<List<Integer>> threesum(int[] ques){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(ques);

        for(int i =0; i< ques.length-2;i++){
            if(i ==0 || ques[i]!=ques[i-1]){
                int j =i+1 ;
                int k = ques.length-1;
                while(j<k){
                    int s = ques[i]+ques[j]+ques[k];
                    if(s == 0){
                        res.add(Arrays.asList(ques[i],ques[j],ques[k]));
                        while(j<k && ques[j]==ques[j+1]) j++;
                        while(j<k&& ques[k]==ques[k-1]) k--;
                        j++; k--;
                    }
                    else if(s >0) k--;
                    else j++;
                }

            }
        }
        return res;
    }

    public static List<List<Integer>> twosum(int[] ques, int k){

        List<List<Integer>> res = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i< ques.length ;i++){
            if(map.containsKey(k-ques[i])){
                res.add(Arrays.asList(i,map.get(k-ques[i])));
            }
            map.put(ques[i],i);
        }
        return res;

    }

//
//    public static void sortArray(int[] arr){
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i :arr){
//                map.put(i,map.getOrDefault(i,0)+1);
//        }
//
//        PriorityQueue<int[]> pq =  new PriorityQueue<>((a,b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
//
//        for(Map.Entry(Integer,Integer) entry : ){
//        }
//        int[] res = new int[arr.length];
//        for(int i =0; i<arr.length;i++){
//            res[i] = pq.poll();
//        }
//        System.out.println(res);
//
//    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int[] arr1= {4,1,2};
//       nextGreaterElement(arr);
//        System.out.println(Arrays.toString(nextGreterTwoArray(arr1,arr)));

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int k =3;
        System.out.println(reverseQueue(q,k));
        int[] sort = {2,0,2,1,1,0};

        sortColors(sort);
//        int[] arrea = {2,1,5,6,2,3};
//        System.out.println(maxAreaHistogram(arrea));
//        int[] arr2= {1,1,2,2,2,3};
//        sortArray(arr2);

//        int[] ques = {2,7,11,15,6,3};
//        int k1 = 9;
//        System.out.println(twosum(ques,k1));

    }

}
