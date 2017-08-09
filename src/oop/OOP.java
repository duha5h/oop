package oop;

/**
 *
 * @author duhash
 */
public class OOP {

    public static void main(String[] args) {
        // TODO code application logic here
        Room room = new MyRoom("Duha");
        room.setNumberOfWindow(1);
        System.out.println("Owner of this room is " + room.getOwner());
        room.mainCore();
        room.decoration();
        room.clean();
        System.out.println("");
        room = new MyBrotherRoom("Ahmad & Osaid");
        room.setNumberOfWindow(2);
        System.out.println("Owner of this room is " + room.getOwner());
        room.mainCore();
        room.decoration();
        room.clean();
        System.out.println("");

        room = new MyMomRoom("Mom & Dad");
        room.setNumberOfWindow(1);
        System.out.println("Owner of this room is " + room.getOwner());
        room.mainCore();
        room.decoration();
        room.clean();
    }

}
