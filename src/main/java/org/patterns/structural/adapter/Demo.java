package org.patterns.structural.adapter;

import org.patterns.structural.adapter.adapters.SquarePegAdapter;
import org.patterns.structural.adapter.round.RoundHole;
import org.patterns.structural.adapter.round.RoundPeg;
import org.patterns.structural.adapter.square.SquarePeg;

public class Demo {

    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //roundHole.fits(smallSqPeg); // Не скомпилируется

        SquarePegAdapter smallSqPegAdapter= new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter= new SquarePegAdapter(largeSqPeg);

        if (roundHole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
