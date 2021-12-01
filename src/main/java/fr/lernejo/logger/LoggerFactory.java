package fr.lernejo.logger;

import fr.lernejo.guessgame.HumanPlayer;
import fr.lernejo.guessgame.Simulation;

public class LoggerFactory {
    public static Logger getLogger(String name){
        return new CompositeLogger(new ContextualLogger(name,  new FileLogger("./src/main/java/fr/lernejo/logger/journal.txt")), new ContextualLogger(name, new ConsoleLogger()) );
    }
}
