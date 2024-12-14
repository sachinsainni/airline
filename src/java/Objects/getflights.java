package Objects;


public class getflights {
	private String provider;
	private String source;
	private String destination;
	private String duration;
        private float price;
        private String flightnumber;
        private int flightid;
	
	public String getprovider() {
		return provider;
	}
	public void setprovider(String provider) {
		this.provider = provider;
	}
	public String getsource() {
		return source;
	}
	public void setsource(String source) {
		this.source = source;
	}
	public String getdestination() {
		return destination;
	}
	public void setdestination(String destination) {
		this.destination = destination;
	}
	public String getduration() {
		return duration;
	}
	public void setduration(String duration) {
		this.duration = duration;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public float getprice() {
		return price;
	}
        public String getflightnumber() {
		return flightnumber;
	}
	public void setflightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
        
        public int getflightid() {
		return flightid;
	}
	public void setflightid(int flightid) {
		this.flightid = flightid;
	}
}
