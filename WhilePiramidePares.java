/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.io.*;

/**
 *
 * @author Juanito
 */
public class WhilePiramidePares {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader (new InputStreamReader(System.in));
      
      
int c,c2 ;  int limite,im;
System.out.println("Introduzca el limite");
       limite=Integer.parseInt(dato.readLine());
          
for(int i6 = 0; i <= limite; i++) { 
 c=1;
 im=1;
while(c>=i ) { 
    
c--;
}
c2=3;

while(c2>=i){
    System.out.print(""+im);
    im=im+2;
    
    c2--;
}
    System.out.println("");


} 
    }}