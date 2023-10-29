//1. print all the subsequnces of the string 
public class Recursion{
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curChar= str.charAt(idx);
        // to choose 
        subsequences(str, idx+1, newString+curChar);
        //or not to choose
        subsequences(str, idx+1, newString);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str, 0, "");

    }
    
}

// for the above pproblem the Time complexity = O(2^n)


 


   



