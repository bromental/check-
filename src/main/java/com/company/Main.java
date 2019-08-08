package com.company;

import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

      int [] arrToTest = Main.generator(5);

      for(int i = 0; i < arrToTest.length; i ++){
          System.out.println(arrToTest[i]);
      }

    }

    public static int[] generator(int set) {

        Random random = new Random(51);
        int[] arr = new int[set];
        for (int i = 0; i < set; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

}
