public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Character Records");
            System.out.println("Run Time Polymorphism ");
            Character[] characters = new Character[2];
            characters[0] = new Mage("M460", 200, "QueenRosie");
            characters[1] = new Warrior("W446", 450, "MysticSoul");
            for (Character c : characters) {
                c.displayInfo();
                System.out.println("Regen Rate: " + c.calculateRegenRate());
            }
            System.out.println("Compile Time Polymorphism ");
            PlayerCharacter player = new PlayerCharacter("P447", 500, "Chaeunwoo");
            System.out.println("Initial Player Name: " + player.getPlayerName());
            player.setPlayerName("SongKong");
            System.out.println("Updated Player Name: " + player.getPlayerName());
            player.restoreEnergy(60);
            player.restoreEnergy(55.5);
            System.out.println("For try-catch-finally:");
            try {
                System.out.println("Attempting to use 250 energy");
                player.useEnergy(250);

                System.out.println("Attempting to use 424 energy");
                player.useEnergy(424);
            } catch (InsufficientEnergyException e) {
                System.out.println("Caught Exception:"+ e.getMessage());
            } finally {
                System.out.println("Finally: Current Energy Level=" + player.getEnergyLevel());
            }

            System.out.println("\nFor Multi-catch:");
            try {

                player.useEnergy(400);

            } catch (InsufficientEnergyException | ArithmeticException e) {
                System.out.println("Multi-catch Caught:" + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Creation Failed!!" + e.getMessage());
        }
    }
}