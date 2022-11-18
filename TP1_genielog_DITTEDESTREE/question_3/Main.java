package tp_genie_log.question_3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		/* Questions 2 et 3 */
		
        Boisson expresso = new Expresso();
        Boisson sumatra = new Sumatra();
        
        sumatra.setTaille("moyenne");

        System.out.println(sumatra.getDescription() + " ␣:␣ " + sumatra.cout() + " euros");
        
        sumatra = new Chocolat(sumatra);
        sumatra = new Chocolat(sumatra);
        sumatra = new Chantilly(sumatra);
        
        System.out.println(expresso.getDescription() + " ␣:␣ " + expresso.cout() + " euros");
        
        expresso.setTaille("grande");

        System.out.println(expresso.getDescription() + " ␣:␣ " + expresso.cout() + " euros");
        
        System.out.println(sumatra.getDescription() + " ␣:␣ " + sumatra.cout() + " euros");
        
        
        /* Question bonus */
        
        System.out.println("\n🍹🍹🍹🍹🍹🍹🍹🍹🍹🍹🍹🍹BONUS🍹🍹🍹🍹🍹🍹🍹🍹🍹🍹🍹🍹");
        
        System.out.println("\n ☕ Bonjour et bienvenue dans notre café ! ☕\n");
        
        System.out.println(" 🥤 Pour commencer, veuillez choisir votre boisson :\n");
        
        System.out.println(" [1] : Expresso");
        System.out.println(" [2] : Déca");
        System.out.println(" [3] : Colombia");
        System.out.println(" [4] : Sumatra");
        
        Scanner scanner_boisson = new Scanner(System.in);

        System.out.println("\n Votre choix (1, 2, 3 ou 4) : ");

        int choix_boisson = scanner_boisson.nextInt();
        String boisson;
        Boisson boisson_client;
        
        switch(choix_boisson) {
    	
			case 1: 
				boisson = "expresso";
				boisson_client = new Expresso();
				break;
				
			case 2: 
				boisson = "déca";
				boisson_client = new Deca();
				break;
				
			case 3: 
				boisson = "colombia";
				boisson_client = new Colombia();
				break;
				
			default: 
				boisson = "sumatra";
				boisson_client = new Sumatra();
				break;
	
        }
        
        System.out.println("\n Vous avez choisi la boisson : " + boisson + "\n");
        
        System.out.println(" 🤏🏻 Veuillez maintenant choisir la taille de votre boisson :\n");
        
	    System.out.println(" [1] : Petite");
	    System.out.println(" [2] : Moyenne");
	    System.out.println(" [3] : Grande");
	    
	    Scanner scanner_taille = new Scanner(System.in);

        System.out.println("\n Votre choix (1, 2 ou 3) : ");

        int choix_taille = scanner_taille.nextInt();
        String taille_boisson;
        
        switch(choix_taille) {
    	
		case 3: 
			taille_boisson = "grande";
			boisson_client.setTaille("grande");
			break;
			
		case 2: 
			taille_boisson = "moyenne";
			boisson_client.setTaille("moyenne");
			break;
			
		default: 
			taille_boisson = "petite";
			boisson_client.setTaille("petite");
			break;

        }
        
        System.out.println(" Vous avez choisi une boisson de " + taille_boisson + " taille.\n");
        
        System.out.println(" 🍴 Pour terminer, veuillez choisir vos ingrédients :\n");
        
        System.out.println(" [1] : Lait");
        System.out.println(" [2] : Chocolat");
        System.out.println(" [3] : Caramel");
        System.out.println(" [4] : Chantilly");
        System.out.println(" [0] : Aucun");
        
        Scanner scanner_ingredients = new Scanner(System.in);

        System.out.println("\n Votre choix d'ingrédient(s) :\n\n Veuillez séparer les ingrédients par des espaces en précisant la quantité pour chaque ingrédient\n Ex. '1:3 2:4' si vous souhaitez 1 supplément lait et 2 suppléments chantilly\n\n Si vous ne souhaitez aucun ingrédient, tapez 0:0 :\n");
        
        String choix_ingredients_line = scanner_ingredients.nextLine();
        
        String[] ingredients_quantite_join = choix_ingredients_line.split(" ");
        String[] ingredients_quantite_split;
        
        String choix_ingredients = "";
        
        for (String ingredient : ingredients_quantite_join) {
        	ingredients_quantite_split = ingredient.split(":");
        	String ingredient_traduit = "aucun";
        	
        	for(int i = 0; i < Integer.parseInt(ingredients_quantite_split[0]); i++) {
        			
	        	switch(ingredients_quantite_split[1]) {
	        	
	        		case "1": 
	        			ingredient_traduit = "lait";
	        			boisson_client = new Lait(boisson_client);
	        			break;
	        			
	        		case "2":        			
	        			ingredient_traduit = "chocolat";
	        			boisson_client = new Chocolat(boisson_client);
	        			break;
	        			
	        		case "3": 
	        			ingredient_traduit = "caramel";
	        			boisson_client = new Caramel(boisson_client);
	        			break;
	        			
	        		case "4": 
	        			ingredient_traduit = "chantilly";
	        			boisson_client = new Chantilly(boisson_client);
	        			break;
	        		
	        		default:
	        			ingredient_traduit = "aucun";
	        			break;
	        	
	        	}
	        	
        	}
        	
        	if(Integer.parseInt(ingredients_quantite_split[0]) == 0) {
        		choix_ingredients = "aucun ingrédient";
        		break;
        	}
        		
        	choix_ingredients += ingredients_quantite_split[0] + " supplément(s) " + ingredient_traduit + " ";

        }
        
        System.out.println("\n Vous avez choisi les ingrédients : " + choix_ingredients);
        System.out.println("\n Votre commande finale est donc : " + boisson_client.getDescription());
        System.out.println("\n Le montant de votre commande s'élève à : " + boisson_client.cout()+ " €.");
       
    }

}
