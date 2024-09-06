package ir.freeland.collection.model;

public class Address {

	
	
	private String city;
    private String country;
    
    public Address(String city, String country) {
        this.city = city;
        this.country = country;
        
    }
        public String getcity() {
            return city;
        }

        public String getcountry() {
            return country;
        }
        public void setcity(String city) {
        	this.city = city;
    		
    	}


    	public void setcountry(String country) {
    		this.country = country;
    	}

}
