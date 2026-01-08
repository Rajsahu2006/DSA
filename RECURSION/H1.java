package RECURSION;
public class H1 {
    public static void printNum(int n) {
//if(n==0){ // base condition
       // return ;
       // }
        //System.out.println(n);//print condition
       // printNum(n-1); //recursion condition

         //}
//public static void main(String[] args) {
     
if(n==6){ //base conditipn
    return;

}
System.out.println(n);
printNum(n+1); //ricurision
    }
public static void main(String[] args){
    int n=1;
    printNum(n);
}
}
         
