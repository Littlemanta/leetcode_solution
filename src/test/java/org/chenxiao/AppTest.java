package org.chenxiao;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.chenxiao.array.ArraySolution;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testArrayMethod1(){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] nums2 = new int[]{3,2,4};
        int target2 = 6;
        int[] nums3 = new int[]{3,3};
        int target3 = 6;
        int[] array = ArraySolution.findSumOfTwoNum2(nums, target);
        int[] array2 = ArraySolution.findSumOfTwoNum2(nums2, target2);
        int[] array3 = ArraySolution.findSumOfTwoNum2(nums3, target3);
        
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        
    }
}
