public class StudentLeader extends studentclass{
    String job;
    public StudentLeader(String myname, String mygender, String mynationality, int myage, String myschool, int mystuNumber,String myjob) {
        super(myname, mygender, mynationality, myage, myschool, mystuNumber);
        job = myjob;
    }
    public void meeting(){
        System.out.println("学生干部开会!");
    }
}
