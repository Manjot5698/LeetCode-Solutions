package Recursion;

public class IstNlastoccurence {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String a,int idx,char element){

        if(idx == a.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar  =a.charAt(idx);
        if (currentChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurence(a,idx+1,element);
    }

    static void main() {
        String str = "abaacdaefaah";
        findOccurence(str,0,'a');


    }
}
