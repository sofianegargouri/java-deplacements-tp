package tests;

import dao.CompteDao;
import dao.DaoFactoryJpa;
import dao.DeplacementDao;
import models.Compte;
import models.Deplacement;

public class test1 {
    public static void main(String[] args) {
        Compte monCompte = new Compte("sofiane@ig2i.fr", "12345678");
        Deplacement monDeplacement = new Deplacement(1);
        DaoFactoryJpa daoFactoryJpa = new DaoFactoryJpa();
        CompteDao compteManager = daoFactoryJpa.getCompteDao();
        DeplacementDao deplacementManager = daoFactoryJpa.getDeplacementDao();
        compteManager.create(monCompte);
        deplacementManager.create(monDeplacement);
        compteManager.deleteAll();
        deplacementManager.deleteAll();
    }
}
