package Recursion;

public class subSequences {
    public static void subsec(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subsec(str,idx+1,newString+currChar);

        //to not be
        subsec(str,idx+1,newString);

    }
    static void main() {
        String str = "abc";
        subsec(str,0,"");

    }
}
