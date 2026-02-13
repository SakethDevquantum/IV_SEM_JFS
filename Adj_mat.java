package IV_SEM_JFS;

public class Adj_mat{
    public static void main(String[] args) {
        int[][] matrix=new int[5][5];
        matrix[0][1]=1;
        matrix[0][2]=1;
        matrix[0][4]=1;
        matrix[1][3]=1;
        matrix[2][3]=1;
        matrix[2][4]=1;
        System.out.println(calc_sink(matrix));
    }

    private static int calc_sink(int[][] matrix){
        int count=0;
        
        for (int[] arr:matrix){
            if(isZeroes(arr)) count+=1;
        }
        return count;
    }

    private static boolean isZeroes(int[] arr){
        for(int elment:arr){
            if(elment!=0) return false;
        }
        return true;
    }
}