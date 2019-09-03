/**
 * 
 */
package exercice4;

/**
 * @author Thomas LINTANF
 *
 */
public class Compteur {
	
	// Attributes:
	/** Hold the total value of kilometers */
	private double m_totalisateur; 
	/** Hold a partial count of kilometers */
	private double m_partiel;
	
	// Constants:
	/** Maximun value of the partial counter */
	final double RESET_CPT = 1000;

	/**
	 * Test program
	 * @param args not used here
	 */
	public static void main(String[] args) {
		Compteur cpt = new Compteur();
		System.out.println(cpt.toString());
		cpt.add(200);
		System.out.println(cpt.toString());
		cpt.add(300);
		System.out.println(cpt.toString());
		cpt.resetPartiel();
		System.out.println(cpt.toString());
		cpt.add(150);
		System.out.println(cpt.toString());
		
	}
	
	public Compteur() {
		m_totalisateur = 0;
		m_partiel = 0;
	}
	
	/**
	 * Provide the value of the attribute m_totalisateur
	 * @return the value of the attribute m_totalisateur
	 */
	public double get_totalisateur() {
		return m_totalisateur;
	}
	
	/**
	 * Provide the value of the attribute m_partiel
	 * @return the value of the attribute m_partiel
	 */
	public double get_partiel() {
		return m_partiel;
	}
	
	/**
	 * Set the value of the attribute m_partiel
	 * @param partiel new value
	 */
	public void set_partiel(double partiel) {
		m_partiel = partiel;
	}
	
	/**
	 * Set the value of the attribute m_partiel to 0
	 */
	public void resetPartiel() {
		m_partiel = 0;
	}
	
	/**
	 * Add the distance to both m_partiel and m_totalisateur.
	 * If the value of m_partiel is over the RESET_CPT value, call the method resetPartiel()
	 * @param distkm distance in km to add to the counters
	 */
	public void add(double distkm) {
		m_totalisateur += distkm;
		m_partiel += distkm;
		
		if (m_partiel >= RESET_CPT) {
			resetPartiel();
		}
	}
	
	/**
	 * 
	 */
	public String toString() {
		return "compteur = [Totalisateur = " + (int) m_totalisateur + " | Partiel = " + (int) m_partiel + "]";
	}
}
