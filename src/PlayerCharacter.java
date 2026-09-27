public class PlayerCharacter extends Character {
    private String playerName;
    public PlayerCharacter(String characterID, double energyLevel, String playerName){
        super(characterID, validateEnergy(energyLevel));
        this.playerName = playerName;
    }
    private static double validateEnergy(double energy){
        if (energy < 0) {
            throw new IllegalArgumentException("Energy level cannot be negative!");
        }
        return energy;
    }
    public String getPlayerName(){
        return this.playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Player Name: " + playerName);
    }

    @Override
    public double calculateRegenRate(){
        return 0.0;
    }
    public void restoreEnergy(int amount){
        setEnergyLevel(getEnergyLevel()+ amount);
        System.out.println("Restored: " + amount + " energy. Current: " + getEnergyLevel());
    }
    public void restoreEnergy(double amount){
        setEnergyLevel(getEnergyLevel() + amount);
        System.out.println("Restored: " + amount + " energy. Current: " + getEnergyLevel());
    }
    public void useEnergy(double amount) throws InsufficientEnergyException{
        if (amount > getEnergyLevel()){
            throw new InsufficientEnergyException("Not enough energy! Requested: " + amount + ",Available: " + getEnergyLevel());
        }
        setEnergyLevel(getEnergyLevel() - amount);
        System.out.println("Successfully used " + amount + " energy.");

    }
}

