package com.driver;

public class Main {
    public void main(String args[]){
        Product p = new Product();
        int k = p.product(1,2);
        int m = p.product(1,2,3);
        double b = p.product(1.0,2.0);
    }
    public class Product{
        public int product(int x, int y) {
            return x+y;
        }
        public int product(int x, int y, int z) {
            return x+y+z;
        }
        public double product(double x, double y) {
            return x+y;
        }
    }
}