// Shallow Cloning
class ObjCloning implements Cloneable {
    int id;
    String name;

    public ObjCloning(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ObjCloning o1 = new ObjCloning(101, "Shiba");
            ObjCloning o2 = (ObjCloning) o1.clone();

            System.out.println(o1 == o2);
            System.out.println(o1.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
