package j13_Object;

public class EntityMain {

    public static void main(String[] args) {

        Entity entity = new Entity("김**", 29, "부산 **구 **동");
        Entity entity2 = new Entity("김**", 29, "부산 **구 **동");

        System.out.println(entity);

        System.out.println(entity.equals(entity2));
        System.out.println(entity.hashCode());
        System.out.println(entity2.hashCode());

        System.out.println(entity.getAddress());

    }




}
