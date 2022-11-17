package tp_genie_log.question_1;

public class Fils  {
	
    private Pere pere;
    private String prenom;
    
    Fils(String prenom){
        this.prenom=prenom;
    }
    
    public String getNom(){
        return pere.getNom();
    }
    
    public String getPrenom(){
        return prenom;
    }

    public void setPere(Pere pere) {
        this.pere = pere;
    }
}
