package tp_genie_log.question_1;

public class Main {

	public static void main(String[] args) {
		
		/* Question 2 */
        Fille fille = new Fille();
        
        fille.setPrenom("Lucie");
        
        fille.compter();
        System.out.println(fille.getPrenom());
        System.out.println("======");
        
        /* Question 3 */
        Pere pere = new Pere("Dupont");
        Pere pere2 = new Pere("Durand");
        Fils fils = new Fils("Adrien");
        
        fils.setPere(pere);
        
        System.out.println(fils.getPrenom());
        System.out.println(fils.getNom());
        System.out.println(pere2.getNom());
        
	}

}
