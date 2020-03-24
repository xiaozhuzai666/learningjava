public class oddnum {
    public static int oddNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num + 1; i++) {
            if (i == 1) {
                sum += (num + 1) / 2;
            } else if (i == 2) {
                sum += (num - 1) * (num + 1) / 2;
            } else {
                int multi = (num - 1) * (num + 1) / 2;
                for (int j = num - 1; j > num - i + 1; j--) {
                    multi *= j;
                }
                sum += multi;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(oddNum(7));
    }

}
