/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8.features.lambda;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hany.ahmed
 */
public class LambdaTest {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Yellow");
        
        // Loop over a list
        list.forEach( x -> System.out.println(x) );
        
        // Casting (Optional)
        list.forEach( (String x) -> System.out.println(x) );
        
        // Execute multiple statements
        list.forEach( x -> {
            System.out.println(x);
            System.out.println("-");
        } );
        
        // Sort
        list.sort( (x, y) -> x.compareTo(y) );
        list.forEach( x -> System.out.println(x) );
        
        // Set implementation to a single method interface
        Runnable r = () -> System.out.println("RUNNING ....");
        r.run();
        
        
    }
    
}
