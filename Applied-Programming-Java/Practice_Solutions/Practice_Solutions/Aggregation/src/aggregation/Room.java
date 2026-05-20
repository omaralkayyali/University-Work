
package aggregation;

import java.util.ArrayList;


public class Room {
    private String roomName;
    private String dimensions;
    private ArrayList<Furniture> furnitureList= new ArrayList<>();

    public Room() {
        this.roomName = "Untitled Room";
        this.dimensions = "1x1";
        this.furnitureList.add(new Furniture());
    }

    public Room(String roomName, String dimensions,String name, String material, double price) {
        this.roomName = roomName;
        this.dimensions = dimensions;
        this.furnitureList .add(new Furniture(name, material,price));
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public boolean removeFurniture(String name) {
        for (int i=0; i<furnitureList.size();i++) {
            if (furnitureList.get(i).getName().equalsIgnoreCase(name)) {
                furnitureList.remove(furnitureList.get(i));
                return true;
            }
        }
        return false;
    }

    public void listFurniture() {
        System.out.println("Furniture in " + roomName + ":");
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture);
        }
    }

    public Furniture findFurniture(String name) {
        for (Furniture furniture : furnitureList) {
            if (furniture.getName().equalsIgnoreCase(name)) {
                return furniture;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Room [Name=" + roomName + ", Dimensions=" + dimensions + ", Furniture Count=" + furnitureList.size() + "]";
    }
    
}
