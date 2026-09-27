public class Mage extends PlayerCharacter{
    public Mage(String characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel, playerName);
    }

@Override
    public double calculateRegenRate (){
        return 0.05;
    }
    @Override
    public void displayInfo () {
        super.displayInfo();
        System.out.println("Class: Mage");
        double regenAmount =getEnergyLevel() * calculateRegenRate();
        System.out.println("Calculated Regen Amount: " +regenAmount);
}

    }
