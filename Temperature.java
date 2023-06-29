/**
 * This program is doing a conversion between the different scales. 
 * Celsius, Calvin , Fahrenheit.
 *
 * @Gil Meshulami
 * @01/11/2020
 */

import java.util.Scanner;
public class Temperature
{
 public static void main(String[] args) 
 {  Scanner scan = new Scanner(System.in);
    
    final double Kconst = 273.15;
    final double Fconst1 = (double)9/5;
    final double Fconst2 = 273.15;
    final double Fconst3 = 32;
    final double Cconst1 = (double)5/9;
    final double Cconst2 = 32;
    
    char letter = scan.next().charAt(0);
    double temp = scan.nextDouble();
    
    if(letter == 'C'){
        double c = temp;
        double f = Fconst1 * temp + Fconst3;
        double k = temp + Kconst;
        System.out.println("c " + c + "f " + f  + "k " + k);
    }
    else if(letter == 'F'){
        double c = Cconst1* (temp - Cconst2);
        double k = Cconst1 * (temp - Fconst3) + Fconst2;
        double f = temp;
        System.out.println("c " + c + " f " + temp + " k " + k);
    }else if (letter == 'K'){
        double c = temp - Kconst;
        double f = Fconst1 * (temp - Kconst) + Fconst3;
        double k = temp;
        System.out.println("c " + c + " f " + f + " k" + k );
    }    
        
        
    
 
    
    
    
    
    
    
    
    }
}
