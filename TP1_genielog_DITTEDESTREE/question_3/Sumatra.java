package tp_genie_log.question_3;

public class Sumatra extends Boisson {
	
	public Sumatra() { super(); }
	
	public double cout() {
		
		if(super.getTaille() == null) super.setTaille("petite");;
	    	
		switch(super.getTaille()) {
	    	case "grande":
	    		return 10;
	    		
	    	case "moyenne":
	    		return 9;
	    		
	    	default:
	    		return 8;
	    }
	}

	public String getDescription() {		
		if (super.getTaille() == null) return "Je suis un sumatra de petite taille";

        else return "Je suis un sumatra de " + super.getTaille() + " taille";           
	}
}
