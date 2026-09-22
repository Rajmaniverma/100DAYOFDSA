package Day1;

public class Arr1 {
    static int [] ages = new int[10] ;
//   first way of intializing array 
    public static void main(String[] args) {
        
        ages[0]=1;
        ages[1]=3;
        ages[2]=2;
        ages[3]=4;
        ages[4]=5;
        ages[5]=6;
        ages[6]=7;
        ages[7]=8;
        ages[8]=9;
        ages[9]=10;
        for(int i = 0 ; i<ages.length-1;i++){
            System.out.println(ages[i]);

        }

    }
}
