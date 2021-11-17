package binarytree;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void te(){
//        List<Integer> values = new ArrayList<Integer>();

        int sum = 0;
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        List<Integer> ls1=new ArrayList<>();
        ls1.add(3);
        ls1.add(4);
        List<List<Integer>> ls2=new ArrayList<>();
        ls2.add(ls);
        ls2.add(ls1);

        for(int i =0 ; i< ls2.size(); i++){
            int y = ls2.get(i).size();
            sum+=y* (i+1);
        }
        System.out.println(sum);
//

//        int y =10;
//        int z =12;
//
//        values.add(0,y);
//        values.add(z);
    }

    public static void main(String[] args) {
        te();

    }
}
