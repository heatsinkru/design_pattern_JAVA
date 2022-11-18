package tp_genie_log.question_3;

public abstract class Boisson {
	protected String description, taille;
	protected double cout;

    public Boisson(){}
    
    public String getTaille(){ return this.taille; }
    
    public void setTaille(String taille){ this.taille = taille; }
    
    public String getDescription(){ return ""; }
    
    public abstract double cout();
}
