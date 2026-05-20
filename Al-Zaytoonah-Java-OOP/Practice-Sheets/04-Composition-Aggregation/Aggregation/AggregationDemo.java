public class AggregationDemo {
    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", "Wood", 75.0);
        Furniture table = new Furniture("Table", "Metal", 160.0);
        Furniture lamp = new Furniture("Lamp", "Plastic", 35.0);

        Room livingRoom = new Room("Living Room");
        livingRoom.addFurniture(chair);
        livingRoom.addFurniture(table);
        livingRoom.addFurniture(lamp);

        livingRoom.listFurniture();

        System.out.println("\\nSearching for Table...");
        System.out.println(livingRoom.findFurniture("Table"));

        System.out.println("\\nRemoving Lamp...");
        boolean removed = livingRoom.removeFurniture("Lamp");
        System.out.println("Removed: " + removed);
        livingRoom.listFurniture();
    }
}
