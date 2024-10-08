public class compressString {
    public static String compress(String str){
        StringBuilder sb= new StringBuilder("");
        Integer count=1;
        for(int i=0;i<str.length();i++){
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String st="aabbcccdd";
        System.out.println(compress(st));
    }
}
