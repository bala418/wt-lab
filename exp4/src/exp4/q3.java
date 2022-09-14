/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp4;

/**
 *
 * @author student
 */


import java.util.Arrays;

public class q3 {
    
    static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
    
    
    public static void main (String[] args){
        int marks1 [] = new int[]{98, 99, 94, 91, 89};
        int marks2 [] = new int[]{98, 99, 94, 91, 84};
        
        System.out.println("Array before sorting");
        print(marks1);
        
        Arrays.sort(marks1);
        System.out.println("After sorting");
        print(marks1);
        
        System.out.println("Searching 94");
        System.out.println("Element 94 is present at index "+ Arrays.binarySearch(marks1, 94));
        
        Arrays.fill(marks1, 1, 4, 100);
        System.out.println("Filling mid 3 by 100");
        print(marks1);
        
        System.out.println("Comparing marks of studemt 1 and 2");
        if(Arrays.equals(marks1, marks2)){
            System.out.println("Both students have same marks");
        }
        else{
            System.out.println("Both students don't have same marks");
        }
        
        
    }
    
    
}
