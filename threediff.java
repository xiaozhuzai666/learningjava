public class threediff {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(i!=j && j!=k && k!=i){
                        System.out.print(i*100+j*10+k +" ");
                        count++;
                    }
                }
            }
        }
        System.out.println("共有"+count+"个");
    }
}

