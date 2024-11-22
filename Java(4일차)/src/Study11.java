public class Study11 {
    public static void main(String[] args){
        String[][] arr = new String[5][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j%2==1){
                    arr[i][j]=(i%2==0)?"X":"O";
                }
                else{
                    arr[i][j]=(i%2==0)?"O":"X";
                }
            }
        }
        
        for(String[] ar:arr){
            for(String a:ar){
                System.out.print(a+" ");
            }
            System.out.println();
        }



    }
}
