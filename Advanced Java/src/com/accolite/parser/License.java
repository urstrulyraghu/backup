package com.accolite.parser;

public class License {
	
	 int Nipr_Number;
	 int License_Id;
	 String Date_Status_Effective;
	 String License_Class;
	 int License_Class_Code;
	 String License_Expiration_Date;
	 String License_Issue_Date;
	 int License_Number;
	 char License_Status;
	 char Resident_Indicator;
	 String State_Code;
	 int State_ID;
	
	
	public int getNipr_Number() {
		return Nipr_Number;
	}
	public void setNipr_Number(int nipr_Number) {
		Nipr_Number = nipr_Number;
	}
	public int getLicense_Id() {
		return License_Id;
	}
	public void setLicense_Id(int license_Id) {
		License_Id = license_Id;
	}
	public String getDate_Status_Effective() {
		return Date_Status_Effective;
	}
	public void setDate_Status_Effective(String string) {
		Date_Status_Effective = string;
	}
	public String getLicense_Class() {
		return License_Class;
	}
	public void setLicense_Class(String license_Class) {
		License_Class = license_Class;
	}
	public int getLicense_Class_Code() {
		return License_Class_Code;
	}
	public void setLicense_Class_Code(int license_Class_Code) {
		License_Class_Code = license_Class_Code;
	}
	public String getLicense_Expiration_Date() {
		return License_Expiration_Date;
	}
	public void setLicense_Expiration_Date(String license_Expiration_Date) {
		License_Expiration_Date = license_Expiration_Date;
	}
	public String getLicense_Issue_Date() {
		return License_Issue_Date;
	}
	public void setLicense_Issue_Date(String license_Issue_Date) {
		License_Issue_Date = license_Issue_Date;
	}
	public int getLicense_Number() {
		return License_Number;
	}
	public void setLicense_Number(int license_Number) {
		License_Number = license_Number;
	}
	public char getLicense_Status() {
		return License_Status;
	}
	public void setLicense_Status(char license_Status) {
		License_Status = license_Status;
	}
	public char getResident_Indicator() {
		return Resident_Indicator;
	}
	public void setResident_Indicator(char resident_Indicator) {
		Resident_Indicator = resident_Indicator;
	}
	public String getState_Code() {
		return State_Code;
	}
	public void setState_Code(String state_Code) {
		State_Code = state_Code;
	}
	public int getState_ID() {
		return State_ID;
	}
	public void setState_ID(int state_ID) {
		State_ID = state_ID;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		License other = (License) obj;
		if (Date_Status_Effective == null) {
			if (other.Date_Status_Effective != null)
				return false;
		} else if (!Date_Status_Effective.equals(other.Date_Status_Effective))
			return false;
		if (License_Class == null) {
			if (other.License_Class != null)
				return false;
		} else if (!License_Class.equals(other.License_Class))
			return false;
		if (License_Class_Code != other.License_Class_Code)
			return false;
		if (License_Expiration_Date == null) {
			if (other.License_Expiration_Date != null)
				return false;
		} else if (!License_Expiration_Date.equals(other.License_Expiration_Date))
			return false;
		if (License_Id != other.License_Id)
			return false;
		if (License_Issue_Date == null) {
			if (other.License_Issue_Date != null)
				return false;
		} else if (!License_Issue_Date.equals(other.License_Issue_Date))
			return false;
		if (License_Number != other.License_Number)
			return false;
		if (License_Status != other.License_Status)
			return false;
		if (Nipr_Number != other.Nipr_Number)
			return false;
		if (Resident_Indicator != other.Resident_Indicator)
			return false;
		if (State_Code == null) {
			if (other.State_Code != null)
				return false;
		} else if (!State_Code.equals(other.State_Code))
			return false;
		if (State_ID != other.State_ID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return Nipr_Number + "," + License_Id + "," + State_Code + "," + Resident_Indicator + "," + License_Class + "," + Date_Status_Effective  + "," + License_Expiration_Date + "," + License_Status + "," + License_Class_Code + "," +  License_Issue_Date + "," + License_Number + "," +  State_ID + "\n" ;
	}
	 
	
}
