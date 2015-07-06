/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java8.features.example1;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hany.Ahmed
 */
public class FunctionalCommunity implements CommunityInt{

    @Override
    public void printAdultMembers(List<Member> members) {
        members.stream().filter(m -> m.getAge() > 20).forEach( m -> System.out.println(m) );
    }

    @Override
    public void printMaxAge(List<Member> members) {
        int max = members.stream().mapToInt(m -> m.getAge()).max().orElse(0);
        System.out.println("" + max);
    }

    @Override
    public void printMembersByGender(List<Member> members, Member.Gender gender) {
        members.stream().filter(m -> m.getGender() == gender).forEach( m -> System.out.println(m) );
    }

    @Override
    public void printMembersSortedByName(List<Member> members) {
//        members.sort( (m1, m2) -> m1.getName().compareTo(m2.getName()) );
//        members.forEach( m -> System.out.println(m) );
        
//        members.stream().sorted( (m1, m2) -> m1.getName().compareTo(m2.getName()) ).forEach( m -> System.out.println(m) );
        
        
        members.stream().sorted( Comparator.comparing(Member::getName) ).forEach( m -> System.out.println(m) );
    }
    
}
