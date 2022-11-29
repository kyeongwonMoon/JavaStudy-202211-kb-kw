package j11_상속.동물;

public class Animal2Main {

    public static void main(String[] args) {

        Animal animal = new Human();
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal[] animal1 = new Animal[5];
        Animal[] animal2 = new Animal[5];

        System.out.println("[업캐스팅]");
        for(int i = 0; i < animal1.length; i++){
            if(i % 2 == 0){
                animal1[i] = human;
            } else {
                animal1[i] = tiger;
            }
            animal1[i].move();
        }

        System.out.println("[다운캐스팅]");
        for(int i = 0; i < animal2.length; i++){
            if(i % 2 == 0){
                animal2[i] = human;
            } else {
                animal2[i] = tiger;
            }
                if(animal2[i] instanceof Human){
                    ((Human)animal2[i]).readBooks();
                } else if(animal2[i] instanceof Tiger){
                    ((Tiger)animal2[i]).hunting();
                }
        }
    }
}
