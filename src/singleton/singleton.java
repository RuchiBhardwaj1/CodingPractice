package singleton;

public class singleton {


    // In oop singleton class is a class that have only once object (instance of the class) at a time.
    //how to design singleton class
    //1.make constructor as private
    //2.write a public static method (get instance) that has return type of object of this singleton claas(Lazy Initialization)
    private static singleton singleton_instance = null;
    public String  str;

    private singleton(){
        str = "Hellooo Ji";
    }

    public static singleton getInstance(){
        if(singleton_instance==null)
            singleton_instance = new singleton();
        return singleton_instance;
    }

    public static void main(String[] args) {
        singleton x = singleton.getInstance();
        singleton y = singleton.getInstance();
        singleton z = singleton.getInstance();

        x.str = (x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

    }
}
