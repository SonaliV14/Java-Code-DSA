
import java.util.Arrays;

public class validAnagram {
    public static void printArray(char[] a){
        for(char e: a){
            System.out.print(e+" ");
        }
    }
    public static boolean isAnagram(String s, String t){
        s= s.toLowerCase();
        t= t.toLowerCase();

        if(s.length()==t.length()){
            char[] sCharArray=s.toCharArray();
            char[] tCharArray= t.toCharArray();

            Arrays.sort(tCharArray);
            Arrays.sort(sCharArray);
            printArray(tCharArray);
            printArray(sCharArray);

            int n=tCharArray.length;
            for(int i=0;i<n;i++){
                if(tCharArray[i]!=sCharArray[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String st="a";
        String ts="ab";
        System.out.println(isAnagram(st,ts));
    }
}
