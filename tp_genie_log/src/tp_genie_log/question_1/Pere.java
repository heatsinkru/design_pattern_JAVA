package tp_genie_log.question_1;

public class Pere {
	
    private String nom, prenom;
    
    public Pere(String nom){ this.nom = nom; }
        
    public Pere(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getNom() {
        return nom;
    }
}
