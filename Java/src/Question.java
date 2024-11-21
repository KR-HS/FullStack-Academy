public class Question{

    public static void main(String[] args) {
        // int a = 10;
        // boolean b = false;
        // System.out.print( (a + b) ); // error



        // String a = "자바";
        // String b = new String("자바");
        // if(a == b) {
        //     System.out.print("참");
        // } else {
        //     System.out.print("거짓"); // 거짓
        // }
        
        for(int 단 = 1; 단 <= 9; 단++) {
            if(단%2!=0){
                continue;
            }
            System.out.println(단 + "단");
            for(int i = 1; i <= 9; i++) {
                System.out.print(단 + " * " + i + " = " + (단 * i) + "\t" );
            }
            System.out.println();
        }
        
    }
}