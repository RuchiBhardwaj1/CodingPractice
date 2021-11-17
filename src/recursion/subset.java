package recursion;

public class subset {
    private static void permutationFind(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String out1 = output;
        String out2 = output;
        out2 += input.charAt(0);
        input = input.substring(1);

        permutationFind(input,out1);
        permutationFind(input,out2);
    }

    public static void main(String[] args){
        String input= "abc";
        String output = " ";

        permutationFind(input,output);
    }
}
