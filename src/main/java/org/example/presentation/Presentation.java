package org.example.presentation;


import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"org.example.dao", "org.example.metier"})
public class Presentation {
    public static void main(String[] args) {
       /* // Création du contexte Spring basé sur les annotations
        ApplicationContext context = new AnnotationConfigApplicationContext(Presentation.class);

        // Récupération du bean IMetier depuis le conteneur Spring
        IMetier metier = context.getBean(IMetier.class);

        // Exécution de la méthode calcul() et affichage du résultat
        System.out.println("Résultat = " + metier.calcul());*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(Presentation.class);
        context.refresh();


        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat = " + metier.calcul());

    }
}
