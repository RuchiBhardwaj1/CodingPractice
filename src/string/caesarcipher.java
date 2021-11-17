package string;

public class caesarcipher {

    public static String caes(String s , int k){
        char[] newle = new char[s.length()];
        int newkey = k%26;

        for(int i = 0; i< s.length();i++){

            newle[i] = get(s.charAt(i),newkey);
        }
        return new String(newle);

    }


    public static char get(char s, int newkey){
        int newcde = s+newkey;

//        return newcde < 122 ? (char) newcde: (char) (96+newcde%122);

        if(newcde<=122)
            return (char) newcde;
        int b = newcde%122;

        return (char) (96+newcde%122);
    }

    public static void main(String[] args){
        String s = "xyz";
        int k =25;
        System.out.println(caes(s,k));
        String[] s1 = new String[]{"ab", "c"};
        String s2 = String.join("",s1);
        String[] s3 = new String[]{"a", "bc"};
        String s4 = String.join("",s3);
        System.out.println(s2+" "+s4);
        if(s2==s4)
            System.out.println(true);
        System.out.println(false);



    }
}
