package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("Computer");
    private long inf = 0;
    private long sup = 100;
    private long tmp = 50;
    @Override
    public long askNextGuess() {
        tmp = (inf + sup)/2;
        return tmp;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("Plus grand");
            inf = tmp;
        }

        if(!lowerOrGreater){
            sup = tmp;
            logger.log("Plus petit");
        }

    }
}
