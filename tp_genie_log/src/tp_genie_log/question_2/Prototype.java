package tp_genie_log.question_2;

public class Prototype extends Canard {
	
	public Prototype(){
		super();
		super.comportement_vol = new Voler();
		super.comportement_cancan = new Muet();
	}
	
	public void setComportementVol(ComportementVol comportement_vol) {
		super.comportement_vol = comportement_vol;
	}
	
	public void setComportementCancan(ComportementCancan comportement_cancan) {
		super.comportement_cancan = comportement_cancan;
	}

    public String afficher(){ return "Je suis un prototype."; }
    public String effectuerCancan(){ return super.comportement_cancan.cancaner(); }
    public String effectuerVol(){ return super.comportement_vol.voler(); }
}
