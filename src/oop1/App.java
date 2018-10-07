/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author ا
 */
public class App {
    
    public static int getNo(int n){
        int p=1;
        for(int i =2; i<=n ; i++){
            p*=i;
        }
        return p;
    }
    
}
