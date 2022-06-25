import java.util.*;

public class Composers {
	
	static final Integer MINIMUM_AGE = 0;

	
//	Instance Variables
	private String name;
	private String genre;
	private Integer age;
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		if (age < 0) {
			this.age = MINIMUM_AGE;
		} else {
		this.age = age;
		}
	}

//	Methods
	public boolean makeMusic() {
		return true;
	}
	
	public String happySong() {
		return "Happy birthday to you. Happy birthday to youuuu!";
	}
	
//	Constructors
	public Composers() {

	}
	
	public Composers(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	public Composers(String name, String genre, Integer age) {
		this.name = name;
		this.genre = genre;
		setAge(MINIMUM_AGE);
	}
	
	
	
}


//2. Create a Custom Class (anything you want - car, phone, holiday, etc.). 
//
//Requirements: 
//
//Minimum 3 private instance variables 
//An empty constructor 
//A constructor that uses only 2 of your 3 variables
//A constructor that uses all 3 of your instance variables 
//Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables 
//A method that returns a Boolean 
//A method that returns a String 
