//package Homework_02112017_composition.ex1;
//
//public class Main {
//    public static void main(String[] args) {
//
//        VideoCard videoCard = new VideoCard(
//                "Nvidea");
//
//        Ozu ozu = new Ozu(
//
//                "DDR3");
//
//        Cpu cpu = new Cpu(
//                "Intel",
//                3);
//
//        SystemUnit system = new SystemUnit(videoCard, ozu, cpu);
//
//        PC pc = new PC(new Keyboard("механика"),
//                new Mouse("беспроводная"),
//                system
//        );
//        System.out.println(pc);
//        pc.getSystemUnit().cpu.setName("Radeon");
//        pc.getSystemUnit().cpu.setGb(2);
//        System.out.println(cpu);
//    }
//}
