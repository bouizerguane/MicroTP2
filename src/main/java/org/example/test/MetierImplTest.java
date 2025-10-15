package org.example.test;

import org.example.dao.IDao;
import org.example.metier.MetierImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MetierImplTest {

    @Test
    public void testCalcul() {
        // Création d'une implémentation fictive de IDao pour le test
        IDao dao = new IDao() {
            @Override
            public double getValue() {
                return 9.0;
            }
        };

        // Création de l'instance de MetierImpl et injection manuelle de la dépendance
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // Vérification que le calcul donne le résultat attendu
        double result = metier.calcul();
        Assert.assertEquals(20.0, result, 0.001);  // 10.0 * 2 = 20.0
    }

}
