public class diamond {
    public static void main(String[] args) {
        //upper part
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for(int i=4;i>=1;i--){
            for(int j=4-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
