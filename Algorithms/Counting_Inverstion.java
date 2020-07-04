public class Counting_Inverstion
{
public static void main(String[]args){
int [] Array = {1,3,5,2,4,6};
System.out.println(CountingInversion(Array));
}
/*
 * Counting Inversion Using Brute Force
 * Complexity O(N**2)
 */
public static int CountingInversion(int[]Array){
int counter = 0;
for(int i=0;i < Array.length;i++){
for(int j=i+1; j  < Array.length;j++){
    if(Array[i] > Array[j]){
        counter++;
    }
}
}
return counter;
}
}
