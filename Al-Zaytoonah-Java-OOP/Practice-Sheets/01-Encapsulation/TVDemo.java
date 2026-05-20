public class TVDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(10);
        tv.volumeUp();
        tv.volumeUp();
        tv.channelUp();

        System.out.println(tv);

        tv.setChannel(120);
        tv.volumeDown();
        System.out.println("After changes: " + tv);

        try {
            tv.setChannel(121);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
