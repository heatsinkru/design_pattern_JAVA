package tp_genie_log.question_2;

public class Leurre extends Canard {
	
	public Leurre(){
		super();
		super.comportement_vol = new NePasVoler();
		super.comportement_cancan = new Muet();
	}
	
    public String afficher(){ return "Je suis un leurre."; }
    public String effectuerCancan(){ return super.comportement_cancan.cancaner(); }
    public String effectuerVol(){ return super.comportement_vol.voler(); }
}
