package tp_genie_log.question_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Colvert colvert = new Colvert();
        Leurre leurre = new Leurre();
        Prototype prototype = new Prototype();
        
        System.out.println(colvert.afficher());
        System.out.println(colvert.effectuerCancan());
        System.out.println(colvert.effectuerVol());
        
        System.out.println("======");
        
        System.out.println(leurre.afficher());
        System.out.println(leurre.effectuerCancan());
        System.out.println(leurre.effectuerVol());
        
        System.out.println("======");
        
        System.out.println(prototype.afficher());
        System.out.println(prototype.effectuerCancan());
        System.out.println(prototype.effectuerVol());
        
        prototype.setComportementCancan(new Couinement());
        prototype.setComportementVol(new Propulsion());

        System.out.println(prototype.effectuerCancan());
        System.out.println(prototype.effectuerVol());
        
        /* Question bonus */
        
        System.out.println("\n🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁BONUS🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁");
        
        System.out.println("\n 🦆 Bonjour et bienvenue dans le programme de choix de canard ! 🦆\n");
        
        System.out.println(" Pour commencer, veuillez choisir votre type de canard :\n");
        
        System.out.println(" [1] : Colvert");
        System.out.println(" [2] : Prototype");
        System.out.println(" [3] : Leurre");
        System.out.println(" [4] : Mandarin");
        
        Scanner scanner_canard = new Scanner(System.in);

        System.out.println("\n Votre choix (1, 2, 3 ou 4) : ");
        
        int choix_canard = scanner_canard.nextInt();
        String canard;
        Colvert colvert_choisi = new Colvert();;
        Prototype prototype_choisi = new Prototype();
        Leurre leurre_choisi = new Leurre();
        Mandarin mandarin_choisi = new Mandarin();
        
        switch(choix_canard) {
    	
			case 1: 
				canard = "colvert";
				System.out.println(colvert_choisi.afficher());
				System.out.println(colvert_choisi.effectuerCancan());
		        System.out.println(colvert_choisi.effectuerVol());
		        break;
				
			case 2: 
				canard = "prototype"; break;
				
			case 3: 
				canard = "leurre";
				System.out.println(leurre_choisi.afficher());
				System.out.println(leurre_choisi.effectuerCancan());
		        System.out.println(leurre_choisi.effectuerVol());
		        break;
				
			default: 
				canard = "mandarin";
				System.out.println(mandarin_choisi.afficher());
				System.out.println(mandarin_choisi.effectuerCancan());
		        System.out.println(mandarin_choisi.effectuerVol());
		        break;
	
        }
    	
        System.out.println("\n Vous avez choisi le canard : " + canard + "\n");
        
        if(canard != "prototype") {
        	
        	System.out.println("\n\n Merci d'avoir utilisé notre programme !");
        	
        } else {
	        
	        System.out.println("\n Veuillez maintenant choisir le comportement de vol désiré :\n");
	        
	        System.out.println(" [1] : Pas de vol");
	        System.out.println(" [2] : Vol classique");
	        System.out.println(" [3] : Vol par propulsion");
	
	        Scanner scanner_vol = new Scanner(System.in);
	
	        System.out.println("\n Votre choix (1, 2 ou 3) : ");
	        
	        int choix_vol = scanner_vol.nextInt();
	        String vol;
	
	        switch(choix_vol) {
	    	
				case 1: 
					vol = "pas de vol";
					prototype_choisi.setComportementVol(new NePasVoler());
					break;
					
				case 2: 
					vol = "vol classique";
					prototype_choisi.setComportementVol(new Voler());
					break;
					
				default: 
					vol = "vol par propulsion";
					prototype_choisi.setComportementVol(new Propulsion());
					break;
		
	        }
	        
	        System.out.println("\n Vous avez choisi le type de vol : " + vol + "\n");
	        
	        System.out.println("\n Veuillez maintenant choisir le comportement de cancan désiré :\n");
	        
	        System.out.println(" [1] : Muet");
	        System.out.println(" [2] : Cancan");
	        System.out.println(" [3] : Couinement");
	
	        Scanner scanner_cancan = new Scanner(System.in);
	
	        System.out.println("\n Votre choix (1, 2 ou 3) : ");
	        
	        int choix_cancan = scanner_cancan.nextInt();
	        String cancan;
	        
	
	        switch(choix_cancan) {
	    	
				case 1: 
					cancan = "muet";
					prototype_choisi.setComportementCancan(new Muet());
					break;
					
				case 2: 
					cancan = "cancan";
					prototype_choisi.setComportementCancan(new Cancan());
					break;
					
				default: 
					cancan = "couinement";
					prototype_choisi.setComportementCancan(new Couinement());
					break;
		
	        }
	        

	        System.out.println("\n Vous avez choisi le type de cancan : " + cancan + "\n");
	        System.out.println("\n\n Voici le canard que vous avez choisi !");
	        
	        System.out.println(prototype_choisi.afficher());
			System.out.println(prototype_choisi.effectuerCancan());
	        System.out.println(prototype_choisi.effectuerVol());

        	System.out.println("\n\n Merci d'avoir utilisé notre programme !");
        
        }
        
        
	}
}
