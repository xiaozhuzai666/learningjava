public class personclass {
    String name,gender,nationality;
    int age;
    public personclass(String myname,String mygender,String mynationality,int myage){
        name = myname;
        gender = mygender;
        nationality = mynationality;
        age = myage;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
    public void work(){
        System.out.println(name+"正在工作");
    }

}
