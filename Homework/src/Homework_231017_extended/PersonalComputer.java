package Homework_231017_extended;

public class PersonalComputer {
    private String cpu;
    private String ozu;
    private String powerSupply;
    private String hdd;
    private String motherBoard;
    private String videoCard;

    public PersonalComputer(String cpu, String ozu, String powerSupply, String HDD, String motherBoard, String videoCard) {
        this.cpu = cpu;
        this.ozu = ozu;
        this.powerSupply = powerSupply;
        this.hdd = HDD;
        this.motherBoard = motherBoard;
        this.videoCard = videoCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOzu() {
        return ozu;
    }

    public void setOzu(String ozu) {
        this.ozu = ozu;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "cpu='" + cpu + '\'' +
                ", ozu='" + ozu + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", hdd='" + hdd + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", videoCard='" + videoCard + '\'' +
                '}';
    }
}

