package Head_first_java.Homework_2030_collection;

import java.util.*;

public class Main {
    static ZooClub zooClub = new ZooClub();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        loop:
        while (true) {
            printCommandList();
            System.out.println("Введите команду:");
            String command = scanner.next();

            switch (command) {
                case "create_member":
                    create_member();
                    break;
                case "create_pet":
                    create_pet();
                    break;
                case "add_pet":
                    add_pet();
                    break;
                case "show":
                    System.out.println(zooClub.personListMap);
                    break;
                case "exit":
                    System.out.println("bye-bye");
                    break loop;
                default:
                    System.out.println("Я не знаю этой комманды, введите еще раз");
                    break;
            }
        }
    }


    private static void printCommandList() {
        System.out.println("========= Список комманд =========");
        System.out.println("create_member: добавить участника");
        System.out.println("create_pet: добавить собаку");
        System.out.println("exit: выход");
        System.out.println("==================================");
    }

    public static void create_member() {
        System.out.println("ВВедите имя члена клуба: ");
        String name = scanner.next();
        Person person = zooClub.createPerson(name);
        System.out.println(person);
    }

    public static void create_pet() {

        System.out.println("Введите имя животного: ");
        String name = scanner.next();
        PetClub petClub = zooClub.createPetclub(name);
        System.out.println(petClub);
    }

    public static void add_pet() {
        System.out.println("введите имя члена клуба: ");
        String name = scanner.next();
        System.out.println("введите имя животного: ");
        String namePet = scanner.next();
        Map<List<Person>, List<PetClub>> personListMap = new HashMap<>();
        Set<Map.Entry<List<Person>, List<PetClub>>> entries = personListMap.entrySet();
        Iterator<Map.Entry<List<Person>, List<PetClub>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<List<Person>, List<PetClub>> next = iterator.next();
            List<Person> people = next.getKey();
            if (people.equals(name)) {
                List<PetClub> petClubsets = next.getValue();
                while (petClubsets.iterator().hasNext()) {
                    petClubsets.add(new PetClub(namePet));
                }
            }


        }
//        Map<Person, List<PetClub>> personListMap = new HashMap<>();
//        Set<Map.Entry<Person, List<PetClub>>> entries = personListMap.entrySet();
//        Iterator<Map.Entry<Person, List<PetClub>>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Person, List<PetClub>> next = iterator.next();
//            if (zooClub.petClubs.equals(namePet)) {
//                Person key = next.getKey();
//                key.setName(name);
//                List<PetClub> value = next.getValue();
//                while (value.iterator().hasNext()) {
//                    PetClub nextValue = value.iterator().next();
//                    nextValue.setNamePet(namePet);
//                    System.out.println(personListMap);
//                }
//            }
//        }
    }
}


