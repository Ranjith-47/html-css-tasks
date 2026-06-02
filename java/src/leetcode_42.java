public class leetcode_42 {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int size = arr.length;
        int left = 0, right = size - 1;
        int left_max = 0, right_max = 0;
        int res = 0;
        while(left < right)
        {
            if(arr[left]<arr[right])
            {
                if(left_max < arr[left])
                {
                    left_max = arr[left];
                }
                else{
                    res += left_max - arr[left];
                }
                left++;
            }
            else{
                if(right_max <= arr[right])
                {
                    right_max = arr[right];
                }
                else{
                    res += right_max - arr[right];
                }
                right--;
            }
        }
        System.out.println(res);
    }
}
