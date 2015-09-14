
package client;
import mathstuff.*;
public class Client 
{
    public static void main(String[] args) 
    {
        System.out.println(Geom.areaOfRect(2,4));
        System.out.println(Geom.subtract(2,4));
        Geom taylor = new Geom();
        Half number = new Half();
        taylor.setAge(20);
        number.setNum(100);
        System.out.println(taylor.age);
        System.out.println();
        
    }
    
}
