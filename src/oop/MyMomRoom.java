package oop;

/**
 *
 * @author duhash
 */
public class MyMomRoom extends Room {

    public MyMomRoom(String owner) {
        super(owner);
    }

    @Override
    public void decoration() {
        System.out.println("This room has a lot of flower, TV and some of lockers!!\nAlso it has a glass balcony which is very nice in spring");

    }

    @Override
    public void clean() {
        System.out.println("It is always clean!! I don't how :/ ");

    }

}
