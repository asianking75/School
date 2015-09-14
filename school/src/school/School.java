
package school;

        public class School 
        {

            public static void main(String[] args) 
            {
               Person bob = Person.addPerson("bob", Person.Gender.Male, 120);
               
               Person jim = Person.addPerson("jim", Person.Gender.Female, 150);
               jim.setName("jill");
               System.out.println(jim.getname());
               
               Person joe = Person.addPerson("joe", Person.Gender.Male, 100);
               Person.printNames();
               
               System.out.println(bob.getWeight());
               
               System.out.println(bob);
               System.out.println(jim);
               System.out.println(joe);


            }
        }
