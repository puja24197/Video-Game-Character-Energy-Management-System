public abstract class Character {
    private String characterID;
      private double energyLevel;
    protected Character(String characterID, double energyLevel){
        this.characterID= characterID;
        this.energyLevel = energyLevel;
    }
    public abstract double  calculateRegenRate();

    public void displayInfo(){
        System.out.println("Character ID : " +characterID +" Energy Level: " +energyLevel);
    }
    protected String getCharacterID() {
        return this.characterID;
    }
         protected double getEnergyLevel() {
         return this.energyLevel;
    }

    protected void setEnergyLevel(double energyLevel){

        this.energyLevel =energyLevel;
    }


}



