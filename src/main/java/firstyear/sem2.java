/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstyear;

/**
 *
 * @author Aryan
 */
import java.util.Scanner;
public class sem2 {
    int s2;
    public sem2(){
        System.out.println("enter the sgpa of sem1");
        Scanner s=new Scanner(System.in);
        this.s2=s.nextInt();
    }
    public int print(){
        System.out.println("the sgpa of sem1 is "+s2);
        return s2;
    }
}
