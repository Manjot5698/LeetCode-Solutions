package Recursion;

public class RevStr {
    public static void printReverse(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(idx));
        printReverse(str,idx-1);
    }

    public static void main(String[] args) {
        String name = "RaceCAR";
        int idx = name.length()-1;
        printReverse(name,idx);
    }
}
