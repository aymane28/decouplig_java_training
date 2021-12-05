package fr.lernejo.guessgame;
import java.security.SecureRandom;


public class Launcher {

    public static void main(String [] args) {
        final Player player;
        final long numberToGuess;
        final long maxLoop;


        if(args.length > 0 && "-interactive".equals(args[0])){
            player=new HumanPlayer();
            Simulation sim= new Simulation(player);

            SecureRandom random = new SecureRandom();
            numberToGuess = random.nextInt(100);

            maxLoop=Long.MAX_VALUE;
            sim.initialize(numberToGuess);
            sim.loopUntilPlayerSucceed(maxLoop);

        }

        else if(args.length > 1 && "-auto".equals(args[0])){
            player= new ComputerPlayer();
            Simulation sim = new Simulation(player);

            SecureRandom random = new SecureRandom();
            numberToGuess= random.nextInt(100);
            String numberToGuessTest;
            maxLoop=1000;
            sim.initialize(numberToGuess);
            sim.loopUntilPlayerSucceed(maxLoop);
        }
        else{
            throw new IllegalArgumentException("message d'exception");
        }
    }
}
