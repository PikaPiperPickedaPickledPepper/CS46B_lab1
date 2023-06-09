package planets;

public class Planet 
{
	// NASA publishes masses of planets at http://nssdc.gsfc.nasa.gov/planetary/factsheet/.
	// Mass units are 10^24 kg.
	private final static float			MASS_UNIT	= 1.0e24f;
	
	private final static Planet[]		THE_PLANETS =
	{
		new Planet("Mercury", 0.33f * MASS_UNIT),
		new Planet("Venus", 4.87f * MASS_UNIT),
		new Planet("Earth", 5.97f * MASS_UNIT),
		new Planet("Mars", 0.642f * MASS_UNIT),
		new Planet("Jupiter", 1898 * MASS_UNIT),
		new Planet("Saturn", 568 * MASS_UNIT),
		new Planet("Uranus", 86.8f * MASS_UNIT),
		new Planet("Neptune", 102f * MASS_UNIT)
		// No more Pluto :-(
	};
	
	
	private String		name;
	private float		massKg;
	
	
	public Planet(String name, float massKg)
	{
		this.name = name;
		this.massKg = massKg;
	}
	
	public static Planet[] getAll()
	{
		return THE_PLANETS;
	}
	
	public String getName() {
		return name;
	}
	
	public float getMassKg() {
		return massKg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMassKg(float massKg) {
		this.massKg = massKg;
	}
	
	@Override
	public String toString() {
		return name + ":" + massKg;
	}
	
	public static float getLargest(Planet[] planets) {
		
		float max = Float.MIN_VALUE;
		
		for (int i = 0; i < planets.length; i ++) {
			if (planets[i].getMassKg() > max) {
				max = planets[i].getMassKg();
			}
		}
		
		return max;//need to make it a float not a double
	}
	
	public static void main(String[] args) {
		Planet mercury = new Planet("Mercury", 0.33f * MASS_UNIT);
		mercury.setName("Venus");
		System.out.println(mercury.getName());
		System.out.println(mercury.toString());
		
		Planet[] planets = getAll();
		System.out.println(getLargest(planets));
	}
	
	
}
