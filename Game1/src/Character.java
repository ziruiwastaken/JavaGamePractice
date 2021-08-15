class Character extends createChar {

    String characterName;
    int health = 100;
    int energy = 100;
    int level = 1;

    String sayName(){
        characterName = input.nextLine();
        return characterName;
    }
}