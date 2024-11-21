import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        
        /***************************
         * 백준 알고리즘 문제
         * https://www.acmicpc.net/problem/2438
         * 
        int i = sc.nextInt();
        for(int j =1; j<i+1;j++){
            for(int m=1;m<j+1;m++){
                System.out.print("*");                
            }
            System.out.println();
        }

        *****************************/ 
        
        

        /***********************************
         * 백준 알고리즘
         * https://www.acmicpc.net/problem/10951
         *
        while (sc.hasNext()) { 
            
            int a =sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a+b);

        }

         ************************************/


         /*
          * 백준알고리즘
          * https://www.acmicpc.net/problem/1546
          */
        // System.out.print("과목 수 입력 : ");
        // int num=sc.nextInt();

        // double[] subject = new double[num];
        // double Maxnum=0;
        // double sum=0;
        // for(int i=0;i<subject.length;i++){
        //     subject[i]=sc.nextInt();
        // }

        // for(double sj : subject){
        //     if(sj>Maxnum){
        //         Maxnum=sj;
        //     }
        // }
        // System.out.println(Maxnum);

        // for(int i=0;i<subject.length;i++){
        //     subject[i]=subject[i]*
        //     100.0/Maxnum;
        //     sum+=subject[i];
        // }
        // System.out.println(sum/num);



        /*
         * 백준 알고리즘
         * https://www.acmicpc.net/problem/25206
         */
        double total_sum=0;
        double grade_sum=0;
        while(sc.hasNextLine()){
            String a = sc.nextLine();
            if(a.isEmpty()){
                break;
            }
            String[] a_list = a.split(" ");
            boolean isPass=false;
            double grade=Double.parseDouble(a_list[1]);
            switch(a_list[2]){
                case "A+":
                    total_sum+=grade*4.5;
                    break;
                case "A0":
                total_sum+=grade*4.0;
                    break;
                case "B+":
                total_sum+=grade*3.5;
                    break;
                case "B0":
                total_sum+=grade*3.0;
                    break;
                case "C+":
                total_sum+=grade*2.5;
                    break;
                case "C0":
                total_sum+=grade*2.0;
                    break;
                case "D+":
                total_sum+=grade*1.5;
                    break;
                case "D0":
                total_sum+=grade*1.0;
                    break;
                case "F":
                total_sum+=grade*0.0;
                    break;
                
                default:
                    isPass=true;
                    break;
            }
            if(isPass){
                continue;
            }
            grade_sum+=grade;

        }
        System.out.println(total_sum/grade_sum);


    }
    }
    
