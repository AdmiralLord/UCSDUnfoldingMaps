package module6;

import java.util.List;

import de.fhpotsdam.unfolding.marker.Marker;

public class DamianStatistics {
	static List<Marker> quakeMarkers = EarthquakeCityMap.getQuakeMarkers();
	
	static float getAverageMagnitude() {
		float sum =0;
		int i =0;
		for (Marker qm : quakeMarkers) {
		sum= sum + Float.parseFloat(qm.getProperty("magnitude").toString());
		i=i+1;
		}
		float average =sum*1000/i;
		average=java.lang.Math.round(average);
		return average/1000;
	}

	static int getNumberOfQuakes() {
		return quakeMarkers.size();
	}

	static int calculateLand () {
		int i =0;
		for (Marker qm : quakeMarkers) {
			if(qm instanceof LandQuakeMarker) {
				i++;
			}
		}
		return i;
	}

	static int calculateOcean () {
		int i =0;
		for (Marker qm : quakeMarkers) {
			if(qm instanceof OceanQuakeMarker) {
				i++;
			}
		}
		return i;
	}
	
	
}
