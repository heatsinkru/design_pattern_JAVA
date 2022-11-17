package tp_genie_log.question_2;

public abstract class Canard {
	
	protected ComportementVol comportement_vol;
	protected ComportementCancan comportement_cancan;
	
	public Canard(){}
	
    //public void nager(){}
    
    public String afficher(){ return "Je suis un canard."; } 
    public String effectuerCancan(){ return ""; }
    public String effectuerVol(){ return "";}
    
}
