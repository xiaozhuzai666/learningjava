public class workerclass extends personclass {
    String unit,workAge;

    public workerclass(String myname, String mygender, String mynationality, int myage,String myunit,String myworkAge) {
        super(myname, mygender, mynationality, myage);
        unit = myunit;
        workAge = myworkAge;
        super.work();
    }
    public void work(){
        System.out.println("工人的工作是盖房子!");
    }



}
