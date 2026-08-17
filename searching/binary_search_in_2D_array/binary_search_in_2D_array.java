package binary_search_in_2D_array;

public class binary_search_in_2D_array {
    
    // basic binary search or 2D array
    static int[] search(int[][] matrix,int target){
        int r = 0;
        int c = matrix.length - 1;

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
    public static void main(String[] args){
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45}
        };
        int[] result = search(matrix,55);
        System.out.println(matrix[result[0]][result[1]]);
    }

}
