
package school;
import java.util.ArrayList;
    public class Person 
    {
        
//        public static int numPeople=10;
//        public static int currentPeopleIndex=0;
//        private static Person people[] =new Person [numPeople];
        private static ArrayList<Person> people = new ArrayList<Person>();

        enum Gender{
            Male,Female
        }

        private String name;
        private int weight;
        private Gender gender;
        public static Person addPerson(String _name ,Gender _gender,int _weight)
        {
            Person temp = new Person(_name,_gender,_weight);
//           people[currentPeopleIndex++] =temp;
            people.add(temp);
            return(temp);

        }

        Person()
        {
            name = "None";
            weight =100;
            gender =Gender.Female;
        }
        Person(String _name,Gender _gender, int _weight)
        {
            name = _name;
            weight = _weight;
            gender =_gender;
        }

        public static void printNames(Gender _male)
        {
            System.out.println("==========printNames==========");
//            for (int i=0;i<people.size;i++)
//            {
//                if (people.get(i) != null)
//                {
//                    System.out.println(people.get(i).getname());
//                }
//            }
            for(Person temp : people)
            {
                if (temp.getGender()== _male)
                System.out.println(temp.getname());
            }
        }
        
        public static void printNames()
        {
            System.out.println("==========printNames==========");
//            for (int i=0;i<people.size;i++)
//            {
//                if (people.get(i) != null)
//                {
//                    System.out.println(people.get(i).getname());
//                }
//            }
            for(Person temp : people)
            {
                System.out.println(temp.getname());
            }
        }
        
        public String toString()
        {
            return(name + " " + gender + " " + weight);
        }

        public Gender getGender()
        {
            return (gender);
        }
        public void setGender(Gender _gender)
        {
            gender =_gender;
        }
        public String getname()
        {
            return (name);
        }
        public void setName(String _name)
        {
            name =_name;
        }
        public int getWeight()
        {
            return (weight);
        }
        public void setWeight(int _weight)
        {
            weight = _weight;
        }
    }

