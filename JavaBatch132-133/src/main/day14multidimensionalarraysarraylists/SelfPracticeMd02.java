package main.day14multidimensionalarraysarraylists;

public class SelfPracticeMd02 {
    public static void main(String[] args) {

        //Example 1: Type code to find the multiplication of all elements of multidimensional array
        //           [ [5, 4], [10, 6, 3] ] ==> 3600

        int arr[][]={{5,4},{10,6,3}};

        int multiplication=1;

        for(int []w:arr){

            for(int k: w){
                multiplication=multiplication*k;

            }
            System.out.println(multiplication);

        }




    }
}
