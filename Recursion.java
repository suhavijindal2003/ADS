public  class Recursion{
    public static void main(String[] args) {
        //Recursion isna method in which a function calls itself
        //types of recursion:
        //direct  ,indirect
        int[] arr={11,15,18,21,24};
        int target=18;
        int index=binanrySear(arr, target, 0, arr.length-1);
        System.out.println(index);
    }
    public static int binanrySear(int[] arr,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binanrySear(arr, target, left, mid-1);
        }
        else{
            return  binanrySear(arr, target, mid+1, right);
        }
    }
}