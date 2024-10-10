public class minLength {
    public static int minLength(String s){
     
        char[] arr = s.toCharArray();
        int top = -1; // This will act as the "stack pointer"
        
        for (char c : arr) {
            
            if (top >= 0 && 
                ((arr[top] == 'A' && c == 'B') || 
                 (arr[top] == 'C' && c == 'D'))) {
                // Move the "pointer" back to simulate removing the last character
                top--;
            } else {
                // Move the pointer up and assign the current character
                arr[++top] = c;
            }
        }
        
        return top + 1;
    }

    public static void main(String[] args) {
        String tr="ABFCACDB";
        minLength(tr);
    }
}
