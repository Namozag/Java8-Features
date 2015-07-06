
package java8.features.example1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hany.Ahmed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Member.Address roxy     = new Member.Address("Orabi"    , "Roxy");
        Member.Address dokki    = new Member.Address("Bohooth"  , "Dokki");
        Member.Address giza     = new Member.Address("Omraneya" , "giza");
        
        List<Member> members = new ArrayList<>();
        
        members.add( new Member(1, "Ahmed"      , LocalDate.of(1990, 1, 1)     , dokki , Member.Gender.MALE) );
        members.add( new Member(2, "Ali"        , LocalDate.of(1986, 10, 11)    , dokki , Member.Gender.MALE) );
        members.add( new Member(3, "Omar"       , LocalDate.of(1990, 3, 3)    , giza  , Member.Gender.MALE) );
        members.add( new Member(4, "Mona"       , LocalDate.of(1995, 9, 1)    , roxy  , Member.Gender.FEMALE) );
        members.add( new Member(5, "Sameh"      , LocalDate.of(2000, 2, 11)    , roxy  , Member.Gender.MALE) );
        members.add( new Member(6, "Eman"       , LocalDate.of(2005, 5, 1)    , giza  , Member.Gender.FEMALE) );
        members.add( new Member(7, "Heba"       , LocalDate.of(2010, 1, 1)    , giza  , Member.Gender.FEMALE) );
        
        CommunityInt community = new FunctionalCommunity();
        
        printHeader("printMembersByGender Male");
        community.printMembersByGender(members, Member.Gender.MALE);
        printHeader("printMembersByGender Female");
        community.printMembersByGender(members, Member.Gender.FEMALE);
        
        printHeader("printAdultMembers");
        community.printAdultMembers(members);
        
        printHeader("printMaxAge");
        community.printMaxAge(members);
        
        printHeader("printMembersSortedByName");
        community.printMembersSortedByName(members);
        
    }
    
    private static void printHeader(String title) {
        System.out.println("");
        System.out.println("=== " + title + " ===");
    }
    
}
