package fr.lernejo.logger;

import fr.lernejo.guessgame.HumanPlayer;
import fr.lernejo.guessgame.Simulation;

import java.util.function.Predicate;

public class LoggerFactory {
    public static Logger getLogger(String name){
        return new CompositeLogger(new ContextualLogger(name, new FilteredLogger( new FileLogger("./src/main/java/fr/lernejo/logger/journal.txt"),  condition -> !name.contains("simulation"))), new ContextualLogger(name, new ConsoleLogger()));
    }
}
