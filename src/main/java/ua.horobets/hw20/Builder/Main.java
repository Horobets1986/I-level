package ua.horobets.hw20.Builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .processorName("intel core i3")
                .displaySize(15.2)
                .videoCardType("integrated")
                .videoCardSize(4)
                .RAMSize(16)
                .driveType("SSD")
                .driveSize(512).build();

        System.out.println("First"+computer);

        Computer computer2 = Computer.builder()
                .processorName("intel core i9")
                .displaySize(32)
                .videoCardType("dedicated")
                .videoCardSize(8)
                .RAMSize(32)
                .driveType("SSD")
                .driveSize(1024).build();

        System.out.println("Second"+computer);
    }
}
