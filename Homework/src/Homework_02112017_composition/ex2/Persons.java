package Homework_02112017_composition.ex2;
public class Persons {
    private String name;
    private String serName;
    private int age;
    Mail mail;
    Animals animals;

    public Persons(String name, String serName, int age, Mail mail, Animals animals) {
        this.name = name;
        this.serName = serName;
        this.age = age;
        this.mail = mail;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", serName='" + serName + '\'' +
                ", age=" + age +
                ", mail=" + mail +
                ", animals=" + animals +
                '}';
    }
    public void ddstartMeVoice(){
        animals.ddstartVoice();
    }
    public void startMailMe(){
        System.out.println(mail.logIN());
    }
}
