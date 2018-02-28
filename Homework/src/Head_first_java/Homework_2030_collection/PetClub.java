package Head_first_java.Homework_2030_collection;

public class PetClub {

    private String namePet;

    public PetClub(String namePet) {
        this.namePet = namePet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    @Override
    public String toString() {
        return "PetClub{" +
                "namePet='" + namePet + '\'' +
                '}';
    }
}
