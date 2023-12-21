package AbstarctClass;

public abstract class Lenovo implements Laptop{
    public void copy(){
        System.out.println("copy code");
    }
    public void cut(){
        System.out.println("copy code");
    }
    public abstract void paste();

    public abstract void move();
}
