package com.java.practice;



import com.sun.deploy.util.StringUtils;

import javax.swing.tree.TreeNode;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DailyCodingProblem {

    /**
     * Problem #1
     * Given a list of numbers and a number k, return whether any two
     * numbers from the list add up to k.
     *
     * For example, given [10, 15, 3, 7] and k of 17, return true
     * since 10 + 7 is 17.
     */

    public static boolean addUpTo(Integer[] listOfInt, int k){
        if(listOfInt.length<2)
            return false;
        Set setOfInt = new HashSet();
        for (int current:listOfInt) {
            if(setOfInt.contains(k-current))
                return true;
            setOfInt.add(current);
        }
        return false;
    }

    /**
     * Problem #2
     * Given an array of integers, return a new array such that each element
     * at index i of the new array is the product of all the numbers in the
     * original array except the one at i.
     *
     * For example, if our input was [1, 2, 3, 4, 5], the expected
     * output would be [120, 60, 40, 30, 24]. If our input was
     * [3, 2, 1], the expected output would be [2, 3, 6].
     * Follow-up: what if you can't use division?
     */
    public static int[] uberArray(int[] nums){

        int[] newArr = new int[nums.length];
        newArr[0]=1;
        for(int i = 1;i<nums.length;i++){
            newArr[i]=newArr[i-1]*nums[i-1];
        }

        int r = 1;
        for(int i = nums.length-1 ;i>=0 ;i--){
            newArr[i]=newArr[i]*r;
            r*=nums[i];
        }
        return newArr;
    }

    public String serialize(TreeNode root, String [] strTree, int index) {

        return strTree.toString();
    }
    
    public TreeNode deserialize(TreeNode root, String [] strTree, int index) {

        return root;

    }


    public static void main(String[] args) {
        Integer[] listOfInt = new Integer[]{10, 15, 3, 7};
        System.out.println(addUpTo(listOfInt,10));
    }
}
