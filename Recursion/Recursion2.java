// 2. Print all the uniques subsequences of a string
// hash set to solve the problem

import java.util.HashSet;
public class Recursion2{
    public static void uniqueSequence(String str, int i , String newString, HashSet<String> set){
        if(i == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curChar = str.charAt(i);
        uniqueSequence(str, i+1, newString+curChar, set);
        uniqueSequence(str, i+1, newString, set);
    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSequence(str, 0 , "", set);

    }
}
