package tp_genie_log.question_3;

public class Deca extends Boisson {
	
	public Deca(){ super(); }
	
    public double cout() {
    	
    	if(super.getTaille() == null) super.setTaille("petite");;
    	
    	switch(super.getTaille()) {
    		case "grande":
    			return 8;
    			
    		case "moyenne":
    			return 6;
    			
    		default:
    			return 4;
    	}
    }
    
    public String getDescription() {
        if (super.getTaille() == null) return "Je suis un déca de petite taille";
        
        else return "Je suis un déca de " + super.getTaille() + " taille";        
    }
}
