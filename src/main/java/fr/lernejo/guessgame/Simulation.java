package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {

        long number = player.askNextGuess();
        if(number<numberToGuess){
            player.respond(true);
            return false;
        }
        else if(number>numberToGuess){
            player.respond(false);
            return false;
        }
        else{
            return true;
        }
    }

    public void loopUntilPlayerSucceed() {
        boolean fin;
        do{
            fin = nextRound();
        }while(!fin);
    }
}
