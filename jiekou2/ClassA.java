package jiekou2;

    public class ClassA  implements demoa.InterfaceA {

        public int method(int n)
        {
            int sum = 1;

            for(int i = 1; i<=n;i++)
            {
                sum+=i;
            }
            return sum;

        }

    }
