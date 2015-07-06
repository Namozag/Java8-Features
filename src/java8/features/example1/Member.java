
package java8.features.example1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Hany.Ahmed
 */
public class Member implements Comparable<Member>{
    private int id;
    private String name;
    private LocalDate birthDate;
    private Address address;
    private Gender gender;

    public Member() {
    }

    public Member(int id, String name, LocalDate birthDate, Address address, Gender gender) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "#" + id + "\t" + name + "\t" + getAge();
    }

    @Override
    public int compareTo(Member o) {
        return this.name.compareTo(o.name);
    }
    

    public enum Gender {
        MALE, FEMALE
    }
    
    public static class Address {

        public Address() {
        }

        public Address(String street, String region) {
            this.street = street;
            this.region = region;
        }
        
        private String street;
        private String region;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
        
        
    }
}
