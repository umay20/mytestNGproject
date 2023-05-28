package main.day14multidimensionalarraysarraylists;

public class SelfPracticeMd03 {
    public static void main(String[] args) {

        //EX 1: Find the sum of the min and maximum elements in a md array

        //Note:bu kod her tur md array ve de - elementler icin de gecerli


        int arr[][]= {{5,4},{10,6,7}};

        //int sum=0; //WE REMOVED THIS,WE DIDNT USE IT

        int small=arr[0][0]; //I am making the first element small here, if you select the last element it works, but general practice
                                //is selecting the first element as a small in the array
        int big=arr[0][0];

        for(int[] w:arr){
            for(int k:w){

                small=Math.min(small,k);  //FIRST ELEMENTI GELEN k ILE KIYASLIYORUM VE small CONTAINERIN ICINE KOYUYORUM
                                            //min() WILL COMPARE 2 VARIABLE (INSIDE OF THE PARANTHESIS) THEN RETURN ME THE MIN ONE
                                           //IF small IS MINIMUM IT WILL GIVE ME THAT ONE,IF k IS MINIMUM IT WILL RETURN ME THE VALUE OF "k"
                big=Math.max(big,k);


            }
        }

        System.out.println(small);
        System.out.println(big);
        System.out.println(small+big);


    }
}
