package tp_genie_log.question_3;

public abstract class Ingredient extends Boisson{
	private Boisson boisson;
	
    public Ingredient(Boisson boisson){
        super();
        this.boisson = boisson;
    }
    
    public Boisson getBoisson(){ return this.boisson; }
    public String getDescription(){ return boisson.description; }
    public abstract double cout();
}
