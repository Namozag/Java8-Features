/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java8.features.example1;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Hany.Ahmed
 */
public class Community implements CommunityInt {
    
    /**
     * Print All Male/Female members
     * @param members List of members
     * @param gender Gender: Male/Female
     */
    @Override
    public void printMembersByGender(List<Member> members, Member.Gender gender) {
        for(Member member : members) {
            if(member.getGender() == gender) {
                System.out.println(member);
            }
        }
    }
    
    
    /**
     * Print all adult members (above 20 years)
     * @param members List of members  
     */
    @Override
    public void printAdultMembers(List<Member> members) {
        for(Member member : members) {
            if(member.getAge() > 20) {
                System.out.println(member);
            }
        }
    }
    
    /**
     * Print Max age
     * @param members List of members
     */
    @Override
    public void printMaxAge(List<Member> members) {
        int max = 0;
        for(Member member : members) {
            if(member.getAge() > max) {
                max = member.getAge();
            }
        }
        System.out.println("Max age " + max);
    }
    
    /**
     * Print all members sorted by Name
     * @param members List of members
     */
    @Override
    public void printMembersSortedByName(List<Member> members) {
        Collections.sort(members);
        for(Member member : members) {
            System.out.println(member);
        }
    }
    
    
}
