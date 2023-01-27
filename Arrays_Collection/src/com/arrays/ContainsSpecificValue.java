package com.arrays;

public class ContainsSpecificValue {


public static boolean contains(int[] arr, int item) {
    for (int n : arr) {
       if (item == n) {
          return true;
       }
    }
    return false;
 }

 public static void main(String[] args) {
        int[] my_array1 = {
          2001, 2002, 2003, 2004, 2005, 
          1458, 2458, 1254, 1472, 2365, 
          1456, 2265, 1457, 2456};
    System.out.println(contains(my_array1, 2013));
    System.out.println(contains(my_array1, 2015));
 }
}