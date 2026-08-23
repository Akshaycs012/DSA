package binary_search_in_2D_array;

public class binary_search_in_2D_array {
    
    // basic binary search or 2D array
    static int[] search(int[][] matrix,int target){
        int r = 0;
        int c = matrix[0].length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                System.out.println("Found element ");
                return new int[]{r,c};
            }else if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        System.out.println("Not found element ");
        return new int[]{-1,-1};
    }
    
    // return true if element present in matrix, column wise sorted
    static boolean findc(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] < target) r++;
            else c--;
        }

        return false;
    }

    // return true if element present in matrix, row wise sorted 
    static boolean findr(int[][] matrix,int target){
        int r = matrix.length - 1;
        int c = 0;

        while(c < matrix[0].length && r >=0){
            if(matrix[r][c] == target) return true;
            else if(target > matrix[r][c]) c++;
            else r--;
        }

        return false;
    }
    
    public static void main(String[] args){
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45}
        };
        System.out.println(findr(matrix,30));
    }

}
