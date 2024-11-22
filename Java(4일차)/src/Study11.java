public class Study11 {
    public static void main(String[] args){
        Study11 st = new Study11();

        String[][] arr=st.InputValue();
        st.PrintValue(arr);
        
        //String[][] rotateArr=st.RotateValue(arr);
        arr=st.RotateValue(arr);
        //st.PrintValue(rotateArr);
        st.PrintValue(arr);
    }

    public String[][] InputValue(){
        String[][] arr = new String[10][10];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j<=i){
                    arr[i][j]="*";
                }
                else{
                    arr[i][j]=" ";
                }
            }
        }
        return arr;
    }

    public void PrintValue(String[][] arr){
        for(String[] ar: arr){
            for(String a: ar){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public String[][] RotateValue(String[][] arr){
        String[][] rotateArr=new String[10][10];

        System.out.println("90도 회전");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                rotateArr[j][arr.length-i-1]=arr[i][j];
            }
        }

        return rotateArr;
    }
}
