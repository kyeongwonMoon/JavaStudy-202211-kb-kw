package j13_Object;

public class ObjectArray {

    public static Object getObject(Object obj){
        return obj;
    }

    public static void main(String[] args) {

        Object[] objects = new Object[7];

        objects[0] = new Student(20220001, "박**");
        objects[1] = new Car("쏘나타", "화이트");
        objects[2] = new Student(20220002, "박**");
        objects[3] = new Car("k5", "블랙");
        objects[4] = new Student(20220003, "황**");
        objects[5] = "김**";
        objects[6] = 20221123.5;

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        System.out.println(objects[5].getClass());
        System.out.println(objects[6].getClass());
    }
}
