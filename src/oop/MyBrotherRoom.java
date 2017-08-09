
package oop;

/**
 *
 * @author duhash
 */
public class MyBrotherRoom extends Room{

    public MyBrotherRoom(String owner) {
        super(owner);
    }

    @Override
    public void decoration() {
        System.out.println("This room has a disk in corner of it. On this disk there is nothing!! There is a fan in half of it, there is nothing special");

    }

    @Override
    public void clean() {
        System.out.println("Mom clean it after punish " + super.getOwner() + ".");

    }
    
}
