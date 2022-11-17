package tp_genie_log.question_3;

public class Sumatra extends Boisson {
	
	public Sumatra() { super(); }
	
	public double cout() {
		
		if(super.getTaille() == null) return 8;
	    	
		switch(super.getTaille()) {
	    	case "grand":
	    		return 10;
	    		
	    	case "moyen":
	    		return 9;
	    		
	    	default:
	    		return 8;
	    }
	}

	public String getDescription() {		
		if (super.getTaille() == null) return "Je suis un Sumatra";
		else return "Je suis un" + super.getTaille() + " Sumatra";	        
	}
}
