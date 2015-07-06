/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java8.features.example1;

import java.util.List;

/**
 *
 * @author Hany.Ahmed
 */
public interface CommunityInt {

    /**
     * Print all adult members (above 20 years)
     * @param members List of members
     */
    void printAdultMembers(List<Member> members);

    /**
     * Print Max age
     * @param members List of members
     */
    void printMaxAge(List<Member> members);

    /**
     * Print All Male/Female members
     * @param members List of members
     * @param gender Gender: Male/Female
     */
    void printMembersByGender(List<Member> members, Member.Gender gender);

    /**
     * Print all members sorted by Name
     * @param members List of members
     */
    void printMembersSortedByName(List<Member> members);
    
}
