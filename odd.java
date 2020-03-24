public class odd {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0;i<=76543210;i++){
            if (i%2!=0){
                x++;
            }
        }
        System.out.println("奇数有"+x+"个");
    }
}
