public class Warrior extends PlayerCharacter{
    public Warrior (String characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel, playerName);
    }

    @Override
    public double calculateRegenRate (){
        return 0.02;
    }
    @Override
    public void displayInfo () {
        super.displayInfo();
        System.out.println("Class: Warrior");
        double regenAmount = getEnergyLevel() * calculateRegenRate();
        System.out.println("Calculated Regen Amount: " + regenAmount);
    }
}
