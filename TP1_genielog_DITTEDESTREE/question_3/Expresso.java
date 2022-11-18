package tp_genie_log.question_3;

public class Expresso extends Boisson {
	
	public Expresso(){ super(); }
	
    public double cout() {
    	
    	if(super.getTaille() == null) super.setTaille("petite");;
    	
    	switch(super.getTaille()) {
    		case "grande":
    			return 7;
    			
    		case "moyenne":
    			return 6;
    			
    		default:
    			return 5;
    	}
    }
    
    public String getDescription() {
    	
        if (super.getTaille() == null) return "Je suis un expresso de petite taille";
        
        else return "Je suis un expresso de " + super.getTaille() + " taille";       
    }
}
