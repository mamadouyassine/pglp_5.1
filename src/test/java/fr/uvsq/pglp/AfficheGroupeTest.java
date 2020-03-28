package fr.uvsq.pglp;

import static org.junit.Assert.*;
import org.junit.Test;
public class AfficheGroupeTest {
    @Test
    public void test() {


        Personnels perso1= new Personnels.Builder("Ouedraogo", "Abdoul", 2).build();

        Personnels perso2= new Personnels.Builder("Tall", "Zale", 7).build();

        Personnels perso3= new Personnels.Builder("Boro", "Natou", 5).build();

        Personnels perso4= new Personnels.Builder("Traore", "Aziz", 6).build();

        CompositePerso grp1 = new CompositePerso(1);
        CompositePerso grp2 = new CompositePerso(3);
        CompositePerso grp3 = new CompositePerso(4);
        grp1.add(perso1);
        grp1.add(grp2);
        grp2.add(grp3);
        grp2.add(perso3);
        grp3.add(perso4);
        grp3.add(perso2);
        AfficheGroupe affich = new AfficheGroupe(grp1);
        Iterator grouptIter = affich.getIterator();
        while (grouptIter.HasNext()) {
            //String nextValue = iterator.next();
            PersonelsInter nextValue=grouptIter.Next();
            System.out.println("The next value with Iterator is: " + nextValue.toString());
        }

    }

}