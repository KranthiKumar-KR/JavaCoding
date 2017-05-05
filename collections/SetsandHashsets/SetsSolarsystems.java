package collections.SetsandHashsets;

import java.util.*;

public class SetsSolarsystems {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new Planet("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new Satellite("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		temp = new Planet("Mars", 687);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new Satellite("Deimos", 1.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		tempMoon = new Satellite("Phobos", 0.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		temp = new Planet("Jupiter", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new Satellite("Io", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new Satellite("Europa", 3.5);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new Satellite("Ganymede", 7.1);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new Satellite("Callisto", 16.7);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		temp = new Planet("Saturn", 10759);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new Planet("Uranus", 30660);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new Planet("Neptune", 165);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new Planet("Pluto", 248);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new DwarfPlanet("Pluto", 842);
		planets.add(temp);

		System.out.println("all heavenly bodies in the solar system are: ");
		for (String name : solarSystem.keySet()) {
			System.out.print(name + ", ");
		}
		System.out.println();
		System.out.println("=============================Planets================================================");

		System.out.println("all the planets in the solar system are: ");
		for (HeavenlyBody planetNames : planets) {
			System.out.print(planetNames.getName() + ", ");
		}
		System.out.println();
		System.out.println("===========================Moons==================================================");
		Set<HeavenlyBody> moons = new HashSet<>();
		for (HeavenlyBody planet : planets) {
			moons.addAll(planet.getSatelites());
		}
		System.out.println();
		for (HeavenlyBody moon : moons) {
			System.out.print(moon.getName() + ", ");
		}
		System.out.println();
		System.out.println("===========================Moons of planet jupiter==================================================");
		System.out.println("moons of the planet jupiter are:");
		for (HeavenlyBody moon : solarSystem.get("Jupiter").getSatelites()) {
			System.out.print(moon.getName() + ", ");
		}
		System.out.println();
		System.out.println("===========================Moons of planet earth==================================================");
		System.out.println("moons of the planet earth are:");
		for (HeavenlyBody moon : solarSystem.get("Earth").getSatelites()) {
			System.out.print(moon.getName() + ", ");
		}

	}

}
