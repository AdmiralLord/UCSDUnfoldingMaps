package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Drawing a centered square for Ocean earthquakes
		// DO NOT set the fill color.  That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered square.
		
		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor
		
		// TODO: Implement this method
		
		float z = Float.parseFloat(properties.get("magnitude").toString());
		//System.out.println(z);
		if (z < 4.0) {
			pg.rect(x-8,y-8,16,16);;
		}
		if (z>=4.0 && z<4.9) {
			pg.rect(x-15,y-15,30,30);
		}
		if (z>=4.9 && z<6.0) {
			pg.rect(x-22,y-22,45,45);
		}
		if (z>=6.0) {
			pg.rect(x-30,y-30,60,60);
		}
		
		
		
		//pg.fill(255, 255, 255);
		//pg.rect(x-8,y-8,16,16);
		
	}
	


	

}
