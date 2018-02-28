package Homework_02112017_composition.ex1;

public class SystemUnit {
    VideoCard videoCard;
    Ozu ozu;
    Cpu cpu;

    public SystemUnit(VideoCard videoCard, Ozu ozu, Cpu cpu) {
        this.videoCard = videoCard;
        this.ozu = ozu;
        this.cpu = cpu;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public Ozu getOzu() {
        return ozu;
    }

    public void setOzu(Ozu ozu) {
        this.ozu = ozu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "SystemUnit{" +
                "videoCard=" + videoCard +
                ", ozu=" + ozu +
                ", cpu=" + cpu +
                '}';
    }
}
