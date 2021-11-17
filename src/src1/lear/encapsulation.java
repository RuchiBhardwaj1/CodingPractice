package src1.lear;
//encapsulation is here inheritance... eg of inheritance
class encapsulation {
    public void m1(){
        System.out.println("parent");
    }
}
class baby extends encapsulation{
    public void m2(){
        System.out.println("child");
    }
}
class last{
    public void m3(int i , float f){
        System.out.println("int,float");
    }
    public void m3(float f , int i){
        System.out.println("float,int");
    }
}
class parent{
    public void property(){
        System.out.println("abc");
    }
    public void marry(){
        System.out.println("subha");
    }
}
class child extends parent{
    public void marry(){
        System.out.println("kat");
    }
    public void my(int i){
        System.out.println("value"+i);
    }
}
class Test{
    public static void main(String[] args){
        encapsulation p = new encapsulation();
        p.m1();
        baby k = new baby();
        k.m2();
        k.m1();
        encapsulation p1 = new baby();
        p1.m1();
        last l = new last();
        l.m3(10.5f,10);
        l.m3(10,10.5f);
        parent p2 = new child();
        p2.marry();
        Object o = new String("durga");
        String sb = (String) o;
        child c = new child();
        c.my('a');





    }
}
