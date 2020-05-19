package Dongwu;

public class Dog {
    public void wan(){
        System.out.println("www");
    }
    void eat(){
        System.out.println("yaoyaoyao");
    }
}
class xDog extends Dog{
    void eat(){
        System.out.println("xixixi");
    }

    public static void main(String[] args) {
        Dog d = new xDog();
        d.wan();
        d.eat();
    }

        }

