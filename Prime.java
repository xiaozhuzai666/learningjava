import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int m=cin.nextInt();
        int b=0,e=0,z;
        int c[]=new int[100];
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {
            a[i]=cin.nextInt();
        }
        for(int w=0;w<m;w++)
        {
            for(int i=2;i<=a[w];i++)
            {
                if(a[w]%i==0)
                {
                    for(int q=i;q>1;q--)
                    {
                        if(i%q==0)
                        {
                            b+=1;
                        }
                    }
                    if(b==1)
                    {
                        c[e]=i;
                        e+=1;
                    }
                    b=0;
                }
            }
        }
        for(int i=0;i<=e;i++) {
            for(int j=1;j<=e;j++)
            {
                if(c[j]<c[j-1])
                {
                    z=c[j];
                    c[j]=c[j-1];
                    c[j-1]=z;
                }
            }
        }
        for(int i=0;i<=e;i++) {
            for(int j=i+1;j<=e;j++) {
                if(c[i]==c[j]) {
                    c[j]=0;
                }
            }
        }
        for(int i=0;i<=e;i++) {
            if(c[i]!=0) {
                System.out.print(c[i]+" ");
            }
        }
    }
}