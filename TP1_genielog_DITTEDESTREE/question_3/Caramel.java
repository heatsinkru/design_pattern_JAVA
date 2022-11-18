package tp_genie_log.question_3;

public class Caramel extends Ingredient {
	private Boisson boisson;
	
    public Caramel(Boisson boisson){ super(boisson); this.boisson = boisson;  }
    
    public String getDescription() { return this.boisson.getDescription() + " avec du caramel"; }

    public double cout() { return this.boisson.cout() + 3.5; }
}
