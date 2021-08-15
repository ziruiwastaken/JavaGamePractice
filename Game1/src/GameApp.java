

public class GameApp {
    public static void main(String[] args) {
        
        System.out.println("Selamat datang di dunia antah berantah....");
        
        sleep();
        
        System.out.println("Petualangan adalah kunci untuk selamat dari dunia ini");

        sleep();

        System.out.println("Siapa namamu wahai anak muda?  ");

        sleep();

        System.out.println("Namaku adalah....");
        System.out.print("Masukan namamu: ");
        Character mainCharacter = new Character();
        String characterName = mainCharacter.sayName();
        
        sleep();

        System.out.println("Baiklah " + characterName + " selamat berpetualang!");

        sleep();

        System.out.println("");

 
        
 
    }

    static void sleep(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

}
