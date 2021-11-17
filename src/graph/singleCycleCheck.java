package graph;

public class singleCycleCheck {
    public static boolean hasSingleCycle(int[] array) {
        // Write your code here.
        int numElementVisited = 0;
        int currentIdx = 0;

        while(numElementVisited < array.length){
            if(numElementVisited > 0 && currentIdx == 0) return false;
            numElementVisited++;
            currentIdx = getNextIdx(currentIdx, array);
        }
        return currentIdx ==0;
    }

    public static int getNextIdx(int currentIdx , int[] array){
        int jump = array[currentIdx];
        int nextIdx = (currentIdx+ jump) % array.length;
        return nextIdx >=0 ? nextIdx : nextIdx+array.length;
    }

    public static void main(String[] args) {
        int[] array = { 2,3,1,-4,-4,2};
        System.out.println(hasSingleCycle(array));
    }
}
