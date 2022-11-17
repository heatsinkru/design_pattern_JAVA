package tp_genie_log.question_3;

public class Main {
	
	public static void main(String[] args){
		
        Boisson colombia = new Colombia();
        Boisson sumatra = new Sumatra ();
        
        sumatra = new Chocolat(sumatra);
        sumatra = new Chocolat(sumatra);
        sumatra = new Chantilly(sumatra);
        
        System.out . println (colombia.getDescription() + " ␣:␣ " + colombia.cout() + " euros");
        
        colombia.setTaille("grand");
        
        System.out.println(colombia.getDescription() + " ␣:␣ " + colombia.cout() + " euros");
        System.out.println (sumatra.getDescription() + " ␣:␣ " + sumatra.cout() + " euros");
        
        sumatra.setTaille("moyen");
        
        System.out.println (sumatra.getDescription() + " ␣:␣ " + sumatra.cout() + " euros");
    }

}
