package tp_genie_log.question_3;

public class Colombia extends Boisson {
	
	public Colombia(){ super(); }
	
    public double cout() {
    	
    	if(super.getTaille() == null) return 6;
    	
    	switch(super.getTaille()) {
    		case "grand":
    			return 8;
    			
    		case "moyen":
    			return 7;
    			
    		default:
    			return 6;
    	}
    }
    
    public String getDescription() {
        if (super.getTaille() == null) return "Je suis un Colombia";
        
        else return "Je suis un " + super.getTaille() + " Colombia";       
    }
}
