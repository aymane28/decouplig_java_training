package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements Player {

    private long min=Long.MIN_VALUE;
    private long max=Long.MAX_VALUE;
    private final Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {

        return middle();
    }

    private long middle(){

        return (min+max)/2;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            max=middle();
            logger.log("number is lower");
        }else{
            min=middle();
            logger.log("number is greater");
        }
    }

}
