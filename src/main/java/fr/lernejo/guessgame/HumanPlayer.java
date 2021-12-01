package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player1");

    @Override
    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater)
            logger.log("Plus grand");
        if(!lowerOrGreater)
            logger.log("Plus petit");
    }
}
