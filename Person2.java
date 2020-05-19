public class Person2 {
    private String sex=null;
    private String data=null;
    public void setSex(){
        this.sex = sex;
    }
    public String getSex(String str) {
        return sex;
    }
    public void getDate(){
        this.data = data;
    }
    public String getData(String str) {
        return data;
    }
}
class Student extends Person2{
    private String name;
    private String number;
    private double grade;
    private String nation;
    public void setName(){
        this.name = name;
    }
    public String getName(String str) {
        return name;
    }
    public void setNumber(){
        this.number = number;
    }
    public String getNumber(String str) {
        return number;
    }
    public void setGrade(){
        this.grade = grade;
    }
    public double getGrade(String str) {
        return grade;
    }
    public void setNation(){
        this.nation = nation;
    }
    public String getNation(String str) {
        return nation;
    }
}