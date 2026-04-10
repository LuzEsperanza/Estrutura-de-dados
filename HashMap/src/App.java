import Person.Person;

import java.util.Hashtable;
import java.util.Random;

public class App{
    public static Person gerateRandomPerson(){
        Random r = new Random();
        int minId=1;
        int maxId=5;
        String[] names = {"Joao", "Jose", "Pedro", "Joaquim", "Andre"};
        int id= r.nextInt(maxId-minId) + minId;
        String name = names[r.nextInt(names.length)];
        return new Person(id,name);
    }
    public static void main(String[] args) throws  Exception {
        //not thread safe (Hashtable)
        // thred safe(Hashmap)
        //hashtable é formado por três elementos Hash HashTable<cheve,elemento>
        Hashtable<Integer, Person> ht = new Hashtable<Integer,Person>();

        Person p1 = gerateRandomPerson();
        Person p2 = gerateRandomPerson();
        Person p3 = gerateRandomPerson();

        ht.put(p1.getId(), p1);
        ht.put(p2.getId(), p2);
        ht.put(p3.getId(), p3);

        // Exibindo o HashMap
        for (var entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        p3.setId(-1);
        System.out.println("====================");
        System.out.println(ht.get(p3));

    }

}


