public class zero {
//    1.count0
public static void main(int[] nums) {
    int countzero  = 0;
    for (int i = 0;i < nums.length;++i) {
        if (nums[i] == 0) {
            countzero ++;
        }
    }

//    2.not zero origin ,开辟一个新数组

    int [] newarray = new int[100];
    for (int i = 0;i < nums.length;++i) {
        if (nums[i] != 0) {
            newarray[i] = nums[i];
        }
    }

//    3.move 0 to end
    while (countzero) {
        newarray.
    }
}
}
