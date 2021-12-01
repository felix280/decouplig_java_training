package fr.lernejo.guessgame;
import java.security.SecureRandom;
import java.util.Objects;

public class Launcher {
    public static void main(String[] args) {
        if(Objects.equals(args[0], "-interactive")){
            Simulation simulation = new Simulation(new HumanPlayer());
            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        else if(Objects.equals(args[0], "-auto")){
            Simulation simulation = new Simulation(new ComputerPlayer());
            SecureRandom random = new SecureRandom();
            simulation.initialize(Integer.parseInt(args[1]));
            simulation.loopUntilPlayerSucceed(1000);
        }
        else{
            System.out.println("Passer en argument -auto et en deuxieme un nombre souhaite");
        }
    }
}
