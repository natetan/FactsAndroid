package yulongproductions.com.funfacts;

import java.util.Random;

/**
 * Created by Yulong on 5/12/2015.
 */
public class ZachFactBook {

    public static final String NAME = "Tyler";

    public String[] mZachFacts = {
            NAME + " hit a fresh back heel last week and made all the ladies drool.",
            "Legend has it that " + NAME + " once caught a bullet with his teeth...blindfolded.",
            "Once fired out of a cannon, a " + NAME + " object can reach speeds of up to 65 mph.",
            NAME + " was the first professional skateboarder to be sponsored by zumiez.",
            NAME + " once jumped off a moving train just to impress his girlfriend's mother.",
            NAME + " is the reason why the earth revolves around the sun.",
            "Gangsters bring a " + NAME + " to a gunfight.",
            "It takes courage to admit fear. It takes money to get a " + NAME + ".",
            "If you have $5 and " + NAME + " has $5, " + NAME + " has more money than you.",
            NAME + " sued Myspace because they used the name in which he calls the world.",
            "When angered, " + NAME + " can strangle you over the phone.",
            "Jesus may be able to stand on water, but " + NAME + " can swim through land.",
            "You can't Google " + NAME + ", because you don't find " + NAME + ". He finds you.",
            NAME + " disbanded EFP from society.",
            "Scientists believe that if a nuclear war broke out, there would be only 2 species left:" +
                    " Cockcroaches and " + NAME + ".",
            "There is a syndrome called The " + NAME + "Syndrome, which includes bleeding " +
                    "from the nose, anxiety, and the feeling of being repeatedly " +
                    "kicked through the windshield.",
            NAME + " brings a knife to a gunfight.",
            "If " + NAME + " shoots you with a gun, he would still have enough time to kick you in " +
                    "the face before the bullet hit.",
            NAME + " can Nollie Laser Double Flip a 13 set...blindfolded.",
            "One time, " + NAME + " gave an officer a speeding ticket.",
            "Highwaters were invented by " + NAME + ".",
            NAME + "'s hit album \"Rip n' Dip\" sold 1.3 million copies on release day.",
            "Fear of tight spaces is claustrophobia. Fear of " + NAME + " is logic.",
            NAME + " can go up Niagara Falls in a barrel.",
            NAME + " has actually been to Mars. That's why there's no signs on life.",
            NAME + " knows where Waldo is.",
            NAME + " once kicked a horse in the chin. Its descendants are known as Giraffes.",
            NAME + " asked for a Big Mac at Burger King...he got one.",
            NAME + " played Russian Roulette with a fully loaded gun and won.",
    };

    // This method returns a random NAME fact from the list
    public String getFact() {
        Random r = new Random();
        return mZachFacts[r.nextInt(mZachFacts.length)];
    }
}
