import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count=sc.nextInt();
        /*
         * 백준 알고리즘
         * https://www.acmicpc.net/problem/2563
         */
        // int[][] position = new int[100][100];

        // sc.nextLine();
        
        // while(count>0){
        //     System.out.print("두 변 입력 : ");
        //     String line = sc.nextLine();

        //     if(line.isEmpty()){
        //         break;
        //     }
            
        //     String[] tokens=line.split(" ");
        //     int x=Integer.parseInt(tokens[0]);
        //     int y=Integer.parseInt(tokens[1]);
            
        //     for(int i=x;i<x+10;i++){
        //         for(int j=y;j<y+10;j++){
        //             position[i][j]=1;
        //         }
        //     }
        //     count--;

        // }
        // int sum=0;
        // for(int[] po:position){
        //     for(int p:po){
        //         sum+=p;
        //     }
        // }
        // System.out.println(sum);
        

        /*
         * 백준 알고리즘
         * https://www.acmicpc.net/problem/2292
         */
        // if(count==1){
        //     System.out.println(1);
        //     return;
        // }

        // int level=1;
        // int rooms=1;

        // while(rooms<count){
        //     rooms+=6*level;
        //     level++;
        // }

        // System.out.println(level);
        

        /*
         * 백준 알고리즘
         * https://www.acmicpc.net/problem/2869
         */
        // int down=sc.nextInt();
        // int height = sc.nextInt();
        // int current_pos=0;
        // int days=0;


        // System.out.println((int)(Math.ceil(((height-down)*1.0/(count-down)))));
        
        
        /*
         * 백준 알고리즘
         * https://www.acmicpc.net/problem/1193
         */
        // if(count==1){
        //     System.out.println("1/1");
        // }
        // else{
        //     int num=0;
        //     for(int i=1;i<10000;i++){
        //         if((double)((i-1)*i)/2<count && count <=(i*(i+1)/2)){
        //             num=count-i*(i-1)/2;
        //             if(i%2==0){
        //                 System.out.printf("%d/%d",num,i+1-num);
        //             }
        //             else{
        //                 System.out.printf("%d/%d",i+1-num,num);
        //             }
        //             break;
        //         }
        //     }
    
        // }
        

        /*
         * 백준 알고리즘
         * https://www.acmicpc.net/problem/2581
         */
        int count1=sc.nextInt();
        int minVal=10000;
        int sum=0;
        boolean isSosu=true;


        for(int i=count;i<count1+1;i++){
                if(i==1){
                    continue;
                }
                isSosu=true;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        isSosu=false;
                        break;
                    }

                }
                if(isSosu){
                    sum+=i;
                    minVal=minVal>i?i:minVal;
                }
        }

            if(sum==0){
                System.out.println(-1);
            }
            else{
                System.out.println(sum);
                System.out.println(minVal);
            }

        
    }
    
}
