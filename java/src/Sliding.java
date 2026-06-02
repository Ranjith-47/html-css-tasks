public class Sliding {
    public static void main(String[] args) {
        int[] arr = {10,11,20,21,30,31,40,41};
        int curr=0,ser;
        for(ser=0;ser<arr.length;ser++)
        {
            if(arr[ser] % 10 != 0)
            {
                int temp = arr[ser];
                for(int i=ser;i>curr;i--)
                {
                    arr[i]=arr[i - 1];
                }
                arr[curr] = temp;
                curr++;
            }
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
