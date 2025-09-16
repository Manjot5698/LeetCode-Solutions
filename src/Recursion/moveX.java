package Recursion;

class moveX {
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0;i <count;i++){
                newString +="x";
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar=='x'){
            count++;
            moveAllX(str,idx+1,count,newString);
        }
        else{
            newString+=currentChar;
            moveAllX(str,idx+1,count,newString);
        }

    }
    static void main() {
    String str = "axbcxxd";
    moveAllX(str,0,0,"");
    }
}
