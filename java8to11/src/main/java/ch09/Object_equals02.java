
package ch09;

public class Object_equals02 {
    public static void main(String[] args) {

        Person p1 = new Person(2201345L);
        Person p2 = new Person(2201345L);

        if(p1.equals(p2)) {
            System.out.println("같은사람입니다.");
        }else {
            System.out.println("다른사람입니다.");
        }
    }
}

class Person{
    long id;

    //생성자.
    Person(long id){
         this.id = id;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Person)) return false;

        Person p = (Person)obj;
        return this.id == p.id;
    }
}
