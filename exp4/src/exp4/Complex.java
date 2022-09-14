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
public class Complex {
    int r, c;
    Complex(){
        r = 0; c= 0;
        System.out.println(r+ " + "+ c+ "i");
    }
    Complex(int r, int c){
        this.r = r;
        this.c = c;
        
        System.out.println(r+ " + "+ c+ "i");
    }
    
    void add(Complex a, Complex b){
        this.r = a.r + b.r;
        this.c = a.c + b.c;
    }
    
    void sub(Complex a, Complex b){
        this.r = a.r - b.r;
        this.c = a.c - b.c;
    }
    
    public static void main(String[] args){
        Complex a= new Complex();
        Complex b = new Complex(4, 5);
        Complex c = new Complex(3, 2);
        
        b.add(a, b);
        System.out.println("After addition of a and b, b = " + b.r+ " + "+ b.c+ "i");
        c.sub(b, c);
        System.out.println("After subtraction of b and c, c = " + c.r+ " + "+ c.c+ "i");
    }
    
}
