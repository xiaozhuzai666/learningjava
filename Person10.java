public class Person10 {
 String name;
 int age;
 public Person10(String name,int age){
     this.name=name;
        this.age=age;
        }
}
class display {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person10 person=new Person10("朱冠典",19);
        System.out.println(person.name+person.age);
    }
}