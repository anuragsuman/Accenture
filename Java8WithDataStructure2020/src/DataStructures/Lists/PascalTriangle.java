package DataStructures.Lists;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generateTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0)
            return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for(int i = 1; i < numRows; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> new_row = new ArrayList<>();

            new_row.add(1);
            for(int j = 1; j < i; j++){
                new_row.add(prev_row.get(j-1) + prev_row.get(j));
            }

            new_row.add(1);
            triangle.add(new_row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generateTriangle(5);
        for(List<Integer> list : result){
            System.out.println(list);
        }
    }
}
