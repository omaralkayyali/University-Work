/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Furniture chair = new Furniture("Chair", "Wood", 50.0);
        Furniture table = new Furniture("Table", "Metal", 150.0);
        Furniture sofa = new Furniture("Sofa", "Leather", 300.0);
        Furniture bed = new Furniture("Bed", "Wood", 500.0);

        Room livingRoom = new Room("Living Room", "5x5","Chair", "Wood", 50.0);
        Room bedroom = new Room("Bedroom", "4x4","Table", "Metal", 150.0);

        livingRoom.addFurniture(chair);
        livingRoom.addFurniture(sofa);
        bedroom.addFurniture(table);
        bedroom.addFurniture(bed);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(livingRoom);
        rooms.add(bedroom);

        displayRooms(rooms);
        searchFurnitureInRoom(livingRoom, "Chair");
        removeFurnitureFromRoom(bedroom, "Table");
    }
    private static void displayRooms(ArrayList<Room> rooms) {
        for (Room room : rooms) {
            System.out.println(room);
            room.listFurniture();
        }
    }

    private static void searchFurnitureInRoom(Room room, String name) {
        Furniture furniture = room.findFurniture(name);
        if (furniture != null) {
            System.out.println("Furniture found: " + furniture);
        } else {
            System.out.println("Furniture not found in the room.");
        }
    }

    private static void removeFurnitureFromRoom(Room room, String name) {
        if (room.removeFurniture(name)) {
            System.out.println(name + " was removed from the room.");
        } else {
            System.out.println(name + " not found in the room.");
        }
        room.listFurniture();
    }
}
