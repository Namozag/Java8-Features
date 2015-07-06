/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java8.features.example1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hany.Ahmed
 */
public class ParallelTest {
    
    public static void main(String[] args) {
        
        
        List<Member> members = new ArrayList<>();
        for(int i=0; i<1000000000; i++) {
//            members.add( new Member(i, "NAME" + i, i%80, null, Member.Gender.MALE) );
        }
        
        long time = System.currentTimeMillis();
        int maxNormal = members.stream().mapToInt(m -> m.getAge()).max().orElse(0);
        System.out.println("Normal: " + (System.currentTimeMillis() - time));
        
        time = System.currentTimeMillis();
        int maxParallel = members.parallelStream().mapToInt(m -> m.getAge()).max().orElse(0);
        System.out.println("Parallel: " + (System.currentTimeMillis() - time));
        
        
    }
    
}
