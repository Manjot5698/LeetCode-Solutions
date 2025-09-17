package Recursion;

public class removeDuplicates {
    public static boolean [] map = new boolean[26];

    public static void RemoveDuplicates(String str,int idx, String newString){
        if (idx ==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            RemoveDuplicates(str,idx+1,newString);
        }else{
            newString+= currChar;
            map[currChar-'a']=true;
            RemoveDuplicates(str,idx+1,newString);
        }
    }
    static void main() {
        String str = "abbccda";
        RemoveDuplicates(str,0,"");

    }
}
