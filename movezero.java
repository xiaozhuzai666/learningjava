//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//        示例:
//
//        输入: [0,1,0,3,12]
//        输出: [1,3,12,0,0]
//        说明:
//
//        必须在原数组上操作，不能拷贝额外的数组。
//        尽量减少操作次数。
//1.遍历数组，遇到往后移动
public class movezero {
    public static void main(int[] a) {
        int j = 0;
        for (int i = 0;i<a.length;++i) {
            if (a[i] != 0) {
                a[j] = a[i];
                if (i != j) {
                    a[i] = 0;
                }
                ++j;
            }
        }
    }
}
