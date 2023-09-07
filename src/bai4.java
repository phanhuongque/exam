public class bai4 {
    public static void main(String[] args){
        int arr[]= {2,7,6,8,9,21,34,56,32,12,37};
        int max=arr[1];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("\nSố lớn nhất của mảng là: %d", max);
        System.out.printf("\nTổng số đầu tiên và số cuối cùng trong mảng: %d", arr[0] + arr[arr.length-1]);
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.printf("\nTổng các số chẵn trong mảng: %d", sum);
    }
}
