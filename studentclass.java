public class studentclass extends personclass{
    public String school;
    int stuNumber;
    public studentclass(String myname, String mygender, String mynationality, int myage,String myschool,int mystuNumber) {
        super(myname, mygender, mynationality, myage);
        school = myschool;
        stuNumber = mystuNumber;

    }
    public void work(){
        return name+"正在" +super.work()；
    }


}
