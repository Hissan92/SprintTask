package com.fetutex.retirement;


import java.util.Calendar;
import java.util.Observable;
import java.text.DecimalFormat;


/***************************************************************************
 * ModelClass.java
 *
 * This program is used to finance and plan an individual's fetutex retirement.
 * This is class performs all the calculations and stores all the data
 * entered into the applet.
 
 ***************************************************************************/
public class ModelClass extends Observable{

	//a basic array to store the data type and created for each field
	public String [] dataStorage = new String [19];

	/***************************************************************************
	 * Empties out the dataStorage array list.
	 ***************************************************************************/
	public void reset(){

		//loops through the dataStorage while setting the array value to empty
		for(int i = 0; i < dataStorage.length; i++){
			dataStorage [i] = "";
		}

		setChanged();
		notifyObservers();
	}

	/***************************************************************************
	 * Returns a value from the array.
	 * @return dataStorage[row]
	 ***************************************************************************/
	public String getRawData(int row){

		return dataStorage[row];

	}

	/***************************************************************************
	 * Returns a value from the array.
	 * @return dataStorage[row]
	 ***************************************************************************/
	public String getValue(int row){

		return dataStorage[row];		
	}

	/***************************************************************************
	 * Sets a value in the array to the new string of data.
	 * @param newdata, row
	 ***************************************************************************/
	public void setValue(String newData,int row){

		dataStorage[row] = newData;
		setChanged();
		notifyObservers();

	}

	/***************************************************************************
	 * Prints the data stored in the dataStorage array.
	 * This is for testing purposes only.
	 ***************************************************************************/
	public void printData(){

		//loops through the dataStorage array while printing
		for(int i = 0; i < dataStorage.length; i++){
			System.out.println(dataStorage[i]);
		}
	}

	/***************************************************************************
	 * Performs all the calculations and sets data in the array
	 ***************************************************************************/
	public void calculate(){

		DecimalFormat df = new DecimalFormat("0.00");


		// TODO add your handling code here:
		String name;
		double currentAge =0;
		double annualIncome;
		double socialSecurityIncome;
		double percentOfIncomeWanted = 0;
		double otherIncomeAfterRetirement = 0;

		int yearBorn;
		int month;
		int day;

		name = getValue(0);

		yearBorn = Integer.parseInt(getValue(12));

		currentAge = 2010 - yearBorn;


		annualIncome = Double.parseDouble(getValue(2));

		double annualRetirementNeeded;
		annualRetirementNeeded = 0;


		percentOfIncomeWanted = Double.parseDouble(getValue(3));

		//Social Security — If you make under $25,000, enter $8,000; between $25,000 - $40,000, enter $12,000; over
		//$40,000, enter $14,500
		socialSecurityIncome = 0;

		if(annualIncome < 25000)
			socialSecurityIncome = 8000;
		else if(annualIncome >= 25000 && annualIncome <= 40000)
			socialSecurityIncome = 12000;
		else if(annualIncome > 40000)
			socialSecurityIncome = 14500;


		setValue(df.format(socialSecurityIncome), 4);

		otherIncomeAfterRetirement = Double.parseDouble(getValue(5));

		double partTimeIncome;
		partTimeIncome = Double.parseDouble(getValue(15));
		double employerPension;
		employerPension = Double.parseDouble(getValue(16));
		double annualRetirementWanted;


		if(getValue(18).equals("calculatePercentage")){
			percentOfIncomeWanted = Double.parseDouble(getValue(3));
			annualRetirementNeeded = (annualIncome * (percentOfIncomeWanted /100)) - socialSecurityIncome 
			- otherIncomeAfterRetirement - partTimeIncome - employerPension ;
		}
		else if(getValue(18).equals("doNotCalculatePercentage")){
			annualRetirementWanted = Double.parseDouble(getValue(14));
			annualRetirementNeeded = (annualRetirementWanted) - socialSecurityIncome 
			- otherIncomeAfterRetirement - partTimeIncome - employerPension ;
		}


		