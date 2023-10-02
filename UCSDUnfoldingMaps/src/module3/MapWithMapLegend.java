package module3;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class MapWithMapLegend extends PApplet
{

	private static final long serialVersionUID = 1L;

	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	private static final boolean offline = false;
	
	private UnfoldingMap map;
	

	public void setup() {
		size(1000, 600, OPENGL);  
		map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
		Location valLoc = new Location (-38.14f, -73.03f);
		//SimplePointMarker val = new SimplePointMarker(valLoc);
		//map.addMarker(val);
		Feature valEq = new PointFeature(valLoc);
		valEq.addProperty("title",  "Valdivia, Chile");
		valEq.addProperty("magnitude", "9.5");
		valEq.addProperty("date", "May 22, 1960");
		valEq.addProperty("year", "1960");
		Marker valMK = new SimplePointMarker(valLoc,valEq.getProperties());
		map.addMarker(valMK);
		
		
	}

	public void draw() {

		background(10);
		map.draw();
		//addKey();
	}


		
	}

	
