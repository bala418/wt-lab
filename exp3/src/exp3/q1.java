package exp3;

public class q1 {
    
    static class Circle{
        double peri;
        
        Circle(double x){
            peri = 3.14 * 2 * x;
        }
    }
    
    static class Rectangle{
        double peri;
        
        Rectangle(double x, double y){
            peri = 2*(x+y);
        }  
    }
    
    static class Square{
        double peri;
        
        Square(double x){
            peri = 4* x;
        }    
    }
  
    public static void main(String args[]){
        Circle a = new Circle(7);
        Rectangle b = new Rectangle(7,5);
        Square c = new Square(5);
   
        System.out.println("Perimeter of square = "+c.peri);
        System.out.println("Perimeter of rectangle = "+b.peri);
        System.out.println("Perimeter of circle = "+a.peri);
    
    }  
}