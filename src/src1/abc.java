package src1;

abstract public class abc {
   public abstract int getnoofwheels();
}

class bus extends abc{
    public int getnoofwheels(){
        return 6;
    }
}
 class auto extends abc{
    public int getnoofwheels(){
        return 3;
    }
 }
 class Test{
    public static void main(String[] args){
        bus b = new bus();
        System.out.println(b.getnoofwheels());
        auto a = new auto();
        System.out.println(a.getnoofwheels());
    }
  }