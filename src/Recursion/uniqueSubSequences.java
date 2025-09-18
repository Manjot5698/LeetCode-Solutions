package Recursion;

import java.util.HashSet;

public class uniqueSubSequences {
    public static void subsec(String str,int idx,String newString,HashSet<String>set){
        if(idx == str.length()){
            if(set.contains(newString)){
            return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);
        //to be
        subsec(str,idx+1,newString+currChar,set);

        //to not be
        subsec(str,idx+1,newString,set);

    }
    static void main() {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsec(str,0,"",set);

    }
}
