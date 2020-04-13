/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author nguye
 */
public class MyToys {
    public static long cF(int n){
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("n have be between 0..15");
        if (n == 0) return 1;
        long pro = 1;
        for (int i = 1; i <= n; i++) {
            pro *=i;
        }
        //return n*cF(n-1);
        return pro;
    }
}
