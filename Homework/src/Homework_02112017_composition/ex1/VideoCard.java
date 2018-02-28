package Homework_02112017_composition.ex1;

public class VideoCard {
    private String name;

    public VideoCard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "name='" + name + '\'' +
                '}';
    }
}
