package org.graphhopper.main;

import org.graphhopper.reader.OSMToGraphHopperReader;

import com.graphhopper.GraphHopper;

public class CreateOSMGraph {
	
	public static void main(String[] args) {
		
		String osmFile = System.getProperty("user.home") + "/graphhopper/osm/berlin-latest.osm.pbf";
		String graphDir = System.getProperty("user.home") + "/graphhopper/osm/berlin";
		
		GraphHopper hopper = OSMToGraphHopperReader.createGraph(osmFile, graphDir, false, false);
		System.out.println(hopper);

	}
}
