package tp_genie_log.question_3;

public class Colombia extends Boisson {

	public Colombia(){ super(); }
	
    public double cout() {
    	
    	if(super.getTaille() == null) super.setTaille("petite");
    	
    	switch(super.getTaille()) {
    		case "grande":
    			return 8;
    			
    		case "moyenne":
    			return 7;
    			
    		default:
    			return 6;
    	}
    }
    
    public String getDescription() {
        if (super.getTaille() == null) return "Je suis un colombia de petite taille";

        else return "Je suis un colombia de " + super.getTaille() + " taille";      
    }
}
