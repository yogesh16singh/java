public class CharacterFactory {
  private Character prototypeCharacter;
  // Constructor to create a prototype character (default character)
  public CharacterFactory() {
    prototypeCharacter =
        new Character("DefaultName", 100, 50, 1); // Default prototype character
  }

  // Create a character by cloning the prototype and changing only the required
  // attributes
  public Character createCharacterWithNewName(String name)
      throws CloneNotSupportedException {
    Character clonedCharacter = prototypeCharacter.clone();
    clonedCharacter.name = name;
    return clonedCharacter;
  }

  public Character createCharacterWithNewLevel(int level)
      throws CloneNotSupportedException {
    Character clonedCharacter = prototypeCharacter.clone();
    clonedCharacter.level = level;
    return clonedCharacter;
  }

  public Character createCharacterWithNewAttackPower(int attackPower)
      throws CloneNotSupportedException {
    Character clonedCharacter = prototypeCharacter.clone();
    clonedCharacter.attackPower = attackPower;
    return clonedCharacter;
  }

  public static void main(String[] args) {
    try {
      CharacterFactory factory = new CharacterFactory();
      
      // Create different characters using the prototype
      Character warrior = factory.createCharacterWithNewName("Warrior");
      warrior.attackPower = 75;
      
      Character mage = factory.createCharacterWithNewName("Mage");
      mage.health = 80;
      mage.attackPower = 100;
      
      Character tank = factory.createCharacterWithNewName("Tank");
      tank.health = 200;
      tank.attackPower = 30;
      
      // Print the characters
      System.out.println("Warrior: " + warrior.name + ", Health: " + warrior.health + 
                       ", Attack: " + warrior.attackPower + ", Level: " + warrior.level);
      System.out.println("Mage: " + mage.name + ", Health: " + mage.health + 
                       ", Attack: " + mage.attackPower + ", Level: " + mage.level);
      System.out.println("Tank: " + tank.name + ", Health: " + tank.health + 
                       ", Attack: " + tank.attackPower + ", Level: " + tank.level);
    } catch (CloneNotSupportedException e) {
      System.err.println("Error cloning character: " + e.getMessage());
    }
  }
}