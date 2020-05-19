    interface StudentManageInterface{
        public abstract void setFree(double fee);
        public abstract double getFree();
    }
    interface TeacherManageInterface{
        public abstract void setPay(double pay);
        public abstract double getPay();
    }
    class Graduate implements StudentManageInterface,TeacherManageInterface{
        private String name,sex;
        private int age;
        private double fee,pay;
        Graduate(String name,String sex,int age,double fee,double pay){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.fee=fee;
            this.pay=pay;
        }
        public String getName(){
            return name;
        }
        public String getSex(){
            return sex;
        }
        public int getAge(){
            return age;
        }
        public void setFree(double fee){
            this.fee=fee;
        }
        public double getFree(){
            return fee;
        }
        public void setPay(double pay){
            this.pay=pay;
        }
        public double getPay(){
            return pay;
        }
    }
    class Test8 {
        public static void main(String[] args){
            Graduate gr= new Graduate("zhangsan", "男", 25, 8000, 3000);
            isnotLoan(gr);
        }
        public static void isnotLoan(Graduate gr){
            if(gr.getPay()*12-gr.getFree()*2<2000){
                System.out.println("provide a loan");
            }
            else
                System.out.println("don't need a loan");
        }
    }

