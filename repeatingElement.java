package geeks.searching;

// time complexity is : O(nlogn)
class repeatingElement{
    static int revEle(int arr [],int n){
        for (int i =0 ;i<n-1;i++){
            if(arr[i] == arr[i+1]){
            return arr[i];
        }
    }return -1;
}
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,2,2};
        int n = arr.length;

        int result = revEle(arr, n);

        if (result != -1){
            System.out.println("Reapeating element is : "+ result);
        }
        else{
            System.out.println("in the array no element found repeating" + result);
        }
    }
}