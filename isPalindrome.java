public class isPalindrome {
    public static boolean isPalindrome(String str){
        String newStr ="";
        String ans="";
        for(int i=0;i<str.length();i++){
            newStr+=Character.toLowerCase(str.charAt(i));
        }
        System.out.println(newStr);
        for(int i=0;i<newStr.length();i++){
            if(newStr.charAt(i)>='a' && newStr.charAt(i)<='z'){
                ans+=newStr.charAt(i);
            }
        }
        System.out.println(ans);

        for(int i=0;i<ans.length()/2;i++){
            int n=ans.length();
            if(ans.charAt(i)!=ans.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String st="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(st));
    }
}
