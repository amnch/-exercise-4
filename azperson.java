package ir.freeland.collection.model;

public class azperson implements Comparable<azperson> {
	
	
	  private String name;
	    private String fname;
	    private int age;
	    private String Address;

	    public azperson(String name, String fname, int age,String Address) {
	        this.name = name;
	        this.fname = fname;
	        this.age = age;
	        this.Address = Address;
	    }
			
	    public String getName() {
	        return name;
	    }

	    public String getfname() {
	        return fname;
	    }

	    public int getAge() {
	        return age;
	    }
	    
	    public String getAddress() {
	        return Address;
	    }
	    
	    
	    public void setName(String name) {
	    	this.name = name;
			
		}


		public void setfname(String fname) {
			this.fname = fname;
		}


		public void setAge(int age) {
			this.age = age;
		}
		public void setAddress(String Address) {
			this.Address = Address;
		}

		

		@Override
	    public String toString() {
	        return "Person{ name=" + name + ", email=" + fname + ", age=" + age +" Address=" + Address + "}";
	    }

		@Override
		public int compareTo(azperson o) {
			return this.age - o.age;
		}
	}
	
	

 