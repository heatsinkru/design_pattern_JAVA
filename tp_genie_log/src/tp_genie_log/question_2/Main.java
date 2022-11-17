package tp_genie_log.question_2;

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
        
	}
}
