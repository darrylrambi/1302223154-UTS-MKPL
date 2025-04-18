package lib;

public class PersonalInfo {
  private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
  private Gender gender;
  
  public enum Gender {
    MALE, FEMALE
  }

  public PersonalInfo(String firstName, String lastName, String idNumber, String address, Gender gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = idNumber;
    this.address = address;
    this.gender = gender;
  }

  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }
  public String getIdNumber() { return idNumber; }
  public String getAddress() { return address; }
  public Gender getGender() { return gender; } 

  public void setFirstName(String firstName) { this.firstName = firstName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public void setIdNumber(String idNumber) { this.idNumber = idNumber; }
  public void setAddress(String address) { this.address = address; }
  public void setGender(Gender gender) { this.gender = gender; }
}