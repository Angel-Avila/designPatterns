package mx.iteso;

import com.sun.tools.classfile.StackMapTable_attribute;
import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.*;

public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();
            Lifesaver FoamFloats = new FoamFloats();
            Lifesaver LifeSaversCandies = new LifeSaversCandies();
            Lifesaver LifeVests = new LifeVests();
            Lifesaver WaterTubes = new WaterTubes();

            System.out.println(swimRing.display());
            System.out.println(swimRing.performInflate());
            System.out.println(swimRing.performDeflate());
            System.out.println(swimRing.performflotate());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.performInflate());
            System.out.println(swimSeat.performDeflate());
            System.out.println(swimSeat.performflotate());

            System.out.println();

            System.out.println(FoamFloats.display());
            System.out.println(FoamFloats.performInflate());
            System.out.println(FoamFloats.performDeflate());
            System.out.println(FoamFloats.performflotate());

            System.out.println();

            System.out.println(LifeSaversCandies.display());
            System.out.println(LifeSaversCandies.performInflate());
            System.out.println(LifeSaversCandies.performDeflate());
            System.out.println(LifeSaversCandies.performflotate());

            System.out.println();

            System.out.println(LifeVests.display());
            System.out.println(LifeVests.performInflate());
            System.out.println(LifeVests.performDeflate());
            System.out.println(LifeVests.performflotate());

            System.out.println();

            System.out.println(WaterTubes.display());
            System.out.println(WaterTubes.performInflate());
            System.out.println(WaterTubes.performDeflate());
            System.out.println(WaterTubes.performflotate());

}
}
