package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	private Color color; // #1
	
	private static final String DEFAULT_ID="unknown"; // #7
	private static final String DEFAULT_LOCATION="unknown"; // #7
	private static final boolean DEFAULT_AVAILABLE = true;
	
	public CampusVehicle() { // #5
		this(DEFAULT_ID, DEFAULT_LOCATION, DEFAULT_AVAILABLE, Color.UNKNOWN); 
	}
	public CampusVehicle(String id, String location, boolean available) {
		this(id, location, available, Color.UNKNOWN); // #5
	}
	public CampusVehicle(String id, String location, boolean available, Color color) {
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(color); // #4
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
	
		if (id == null) {
            this.id = DEFAULT_ID;
        }
        else if (id.length() < 6) { // #6
            this.id = DEFAULT_ID;
        }
        else if (id.length() > 18) { // #6
            this.id = DEFAULT_ID;
        }
        else if (id.startsWith("MU") || id.startsWith("mu") || id.startsWith("Mu") ||
        		id.startsWith("mU")) {
            this.id = id.toLowerCase(); // #7
        }
        else {
            this.id =DEFAULT_ID;
        }
	}
	public String getLocation() {
		return location;
	}
	public Color getColor() { // #3
		return color;
	}
	public void setColor(Color color) { // #3
		if (color == null) {
			this.color = Color.UNKNOWN;
		}
		else {
			this.color = color; 
		}
	}
	public void setLocation(String location) {
		if (location == null) {
			this.location = DEFAULT_LOCATION;
		}
		else {
			
			String lowerLocation = location.toLowerCase();
			
			
	        if (lowerLocation.equals("library") || // #7
	            lowerLocation.equals("university bluffs") ||
	            lowerLocation.equals("parking lot") ||
	            lowerLocation.equals("spruce hall") ||
	            lowerLocation.equals("laurel hall")) {

	            this.location = lowerLocation;
	        }
	        else {
	            this.location = DEFAULT_LOCATION;
	        }
	    }
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void checkOut() {
		if (available == true) {
		available = false;
		} 
		
	}
	public void returnVehicle() {
		available = true;
	}

}
