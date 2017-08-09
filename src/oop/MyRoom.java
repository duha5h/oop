package oop;

/**
 *
 * @author duhash
 */
public class MyRoom extends Room {

    public MyRoom(String owner) {
        super(owner);
    }

    @Override
    public void decoration() {

        System.out.println("This room has a lot of teady bears from different types and sizes. Its like a dream room :D");
    }

    @Override
    public void clean() {
        System.out.println("It is only clean when mom punish me. HAHAHAHAHA");

    }

}
