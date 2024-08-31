package api.payload;

public class Product {
	
	
	    private String name;
	    Data data;


	    // Parameterized constructor
	    public Product(String name, Data data) { 
	     
	        this.name = name;
	        this.data = data;
	    }

		// Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for data
	    public Data getData() {
	        return data;
	    }

	    public void setData(Data data) {
	        this.data = data;
	    }

	
 }
	
     
    
    


