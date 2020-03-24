public class random {
    public static void main(String[] args) {
        int number[] = new int[100];
        int record = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) Math.round(99*Math.random());
            if (number[i] > 50) {
                record++;
            }
        }
        System.out.println("大于50的整数有:" + record + "个");
        // 给数组排序（冒泡排序）
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] < number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }

        System.out.println("最大的整数:" + number[0]);
        System.out.println("最小整数" + number[99]);
    }
}

