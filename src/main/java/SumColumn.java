import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] arr=new int[3][3];

        System.out.println("Enter a array");

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Enter index"+"["+i+"]"+"["+j+"]");
                int ind=scanner.nextInt();
                arr[i][j]=ind;
            }
        }

        int sum=0;
        System.out.println("Enter number column");
        int column=scanner.nextInt();
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if(j==column){
                    sum+=arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
