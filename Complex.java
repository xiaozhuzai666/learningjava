public class Complex {
    int real;
    int iamge;
     Complex(){
        this.real = 0;
        this.iamge = 0;
    }
     Complex(int real){
        this.real = real;
        this.iamge = 0;
    }
     Complex(int real,int iamge){
        this.real = real;
        this.iamge = iamge;
    }
    static Complex Add(Complex p1,Complex p2)
    {
        Complex p =new Complex(p1.real+p2.real,p1.iamge+p2.iamge);
        return p;
    }
    Complex Min(Complex p1,Complex p2)
    {
        Complex p =new Complex(p1.real-p2.real,p1.iamge-p2.iamge);
        return p;
    }
    void print()
    {
        System.out.println("复数的值为：");
        if(this.iamge!=0)
            System.out.println("("+this.real+","+this.iamge+")");
        else System.out.println(this.real);
    }
}
