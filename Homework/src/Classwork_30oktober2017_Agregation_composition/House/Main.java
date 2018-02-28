package Classwork_30oktober2017_Agregation_composition.House;

public class Main {
    public static void main(String[] args) {



        Flat[] flats = new Flat[2];

        Person[] family = new Person[2];
        Person person1 = new Person("Vas");
        Person person2 = new Person("Kol");

        family[0]=person1;
        family[1]=person2;

        Flat f1 =new Flat(1, family);

        Person[] familyGirl = new Person[2];
        Person person3 = new Person("Ma");
        Person person4 = new Person("ss");
        familyGirl[0] = person3;
        familyGirl[1] = person4;
        family[0]=person1;
        family[1]=person2;

        Flat f2 =new Flat(2, familyGirl);
        flats[0]=f1;
        flats[1]=f2;




        Section section1 = new Section(flats);
        Section[] sections = new Section[1];
        sections[0] = section1;

        House house = new House(new Adress("lichakivska", 121), sections);
        System.out.println(house);

        System.out.println(house.getSections()[0].getFlats()[1].getPerson()[1].getName());

        Section[] sectionz = house.getSections();
        Section sectiontwo = sectionz[0];
        Flat[] flatz = sectiontwo.getFlats();
        Flat flat = flatz[1];
        Person[] person = flat.getPerson();
        Person person5 = person[1];
        person5.setName("roma");
    }
}
