package patikaOdevleri_Hafta4;

public class DizidekiElemanlarinFrekansi


    public static void main(String[] args) {

        int [] arr = {390,1,50,11,50,30,78,50,78,1,87,52,87,50};
        int f [] = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            f[i] =1;
            for(int j= i+1; j<arr.length;j++){
                if( (arr[i]==arr[j])){
                    f[i]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] == arr[j])) {
                    arr[j] = 0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(f[i]>1){
                if(arr[i] != 0){
                    System.out.println(arr[i]+ " sayısı "+ f[i]+" kere tekrar edildi.");
                }
            }else if(f[i] ==1){
                if(arr[i] != 0){
                    System.out.println(arr[i]+ " sayısı "+ f[i]+" kere tekrar edildi.");
                }

            }
        }
    }
}