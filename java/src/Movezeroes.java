public class Movezeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,4,6,8};
        int j = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        for(int k = j ;k<=arr.length - 1;k++)
        {
            arr[k] = 0;
        }
        for(int z: arr)
        {
            System.out.println(z);
        }

    }
}
