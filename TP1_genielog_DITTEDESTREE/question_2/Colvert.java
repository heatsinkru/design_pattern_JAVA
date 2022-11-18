package tp_genie_log.question_2;

public class Colvert extends Canard{
	
	public Colvert(){
		super();
		super.comportement_vol = new Voler();
		super.comportement_cancan = new Cancan();
	}
	
    public String afficher(){ return "Je suis un colvert."; }
    public String effectuerCancan(){ return super.comportement_cancan.cancaner(); }
    public String effectuerVol(){ return super.comportement_vol.voler(); }
}
