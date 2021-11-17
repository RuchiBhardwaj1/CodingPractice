package inter;

public class question {

    public static void main(String[] args) {
//        Object[] array = new Object[2];
//        array[0] = 1;
//        array[1] = "abc";
//        System.out.println(Arrays.toString(array));
//
//        customer c = new customer();
//        c.ID=99;
//        c.Name="abc";
//
//        ArrayList arr = new ArrayList();
//        arr.add(3);
//        arr.add("gabc");
//        System.out.println(arr);

        String[][] jaggedArray = new String[3][];
        jaggedArray[0] = new String[3];
        jaggedArray[1] = new String[1];
        jaggedArray[2] = new String[2];
        jaggedArray[0][0] = "Bachelor";
        jaggedArray[0][1] = "master";
        jaggedArray[0][2] = "doctorate";

        jaggedArray[1][0]="Bachelor";

        jaggedArray[2][0] ="Bachelor";
        jaggedArray[2][1] ="master";



        for(int i =0; i< jaggedArray.length; i++){
            String[] innerArray = jaggedArray[i];
            for(int j =0; j<innerArray.length; j++){

                System.out.println(innerArray[j]);
            }
        }





    }

    static class customer{
        public int ID;
        public String Name;



        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }
    }

}
