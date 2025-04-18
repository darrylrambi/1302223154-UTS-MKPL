package lib;

import java.util.LinkedList;
import java.util.List;

public class FamilyInfo {
  private String spouseName;
	private String spouseIdNumber;
	private List<String> childNames;
	private List<String> childIdNumbers;

  public FamilyInfo(String spouseName, String spouseIdNumber) {
    this.spouseName = spouseName;
    this.spouseIdNumber = spouseIdNumber;
    this.childNames = new LinkedList<String>();
    this.childIdNumbers = new LinkedList<String>();
  }

  public String getSpouseName() { return spouseName; }
  public String getSpouseIdNumber() { return spouseIdNumber; }
  public List<String> getChildNames() { return childNames; }
  public List<String> getChildIdNumbers() { return childIdNumbers; }

  public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}

  public void addChild(String childName, String childIdNumber) {
		this.childNames.add(childName);
		this.childIdNumbers.add(childIdNumber);
	}
}