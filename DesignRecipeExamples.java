/**
 * @author Natalie Young
 * @since 2021-10-12
 */

//import tester.*;
import java.lang.Math;

class DesignRecipeExamples
{

	DesignRecipeExamples()
	{}

	/**
	 * Problem 1
	 * Returns perimeter of rectangle given its width and height
	 * 
	 * @param width
	 * @param height
	 * @return perimeter
	 */
	int perimeter(int width, int height)
	{
		int perimeter = width * 2 + height * 2;
		return perimeter;
	}

	/**
	 * Problem 2
	 * Returns difference of areas given rectangle heights and widths
	 *
	 * @param width1
	 * @param height1
	 * @param width2
	 * @param height2
	 * @return borderArea
	 */
	int borderArea(int width1, int height1, int width2, int height2)
	{
		int area1 = width1 * height1;
		int area2 = width2 * height2;
		int borderArea = 0;

		if (area1 > area2)		// check to see which area larger, subtract from larger area
		{
			borderArea = area1 - area2;
		}
		else if (area1 < area2)
		{
			borderArea = area2 - area1;
		}
			
		return borderArea;		// will return 0 if rectangles are same size
	}

	/**
	 * Problem 3
	 * Converts given amount of US Dollars to Mexican Pesos at rate of 1 USD = 21 MEX
	 *
	 * @param USD
	 * @return MEX
	 */
	int USDtoMEX(int USD)
	{
		int MEX = USD * 21;		// USD-MEX conversion rate (20.75, rounded up) as of 2021-10-12
		return MEX;
	}

	/**
	 * Problem 4
	 * Combines and takes absolute values of given numbers of hours and minutes to get total minutes
	 *
	 * @param hours
	 * @param minutes
	 * @return totalMinutes
	 */
	int combineToMinutes(int hours, int minutes)
	{
		int minutesInHours = Math.abs(hours) * 60;		// 60 mins per hour, absval for hours
		int totalMinutes = minutesInHours + Math.abs(minutes); //absolute value of minutes

		return totalMinutes;
	}
}

class Examples
{
	// EXAMPLES

	DesignRecipeExamples test = new DesignRecipeExamples();

	// Test for Problem 1: Perimeter
	// No differences found when values tested on online calculator
	int perimeter1 = test.perimeter(1,2);	// expected value: 6
	int perimeter2 = test.perimeter(4,6);	// expected value: 2

	// Test for Problem 2: Border Area
	// No differences found when values tested on online calculator
	int borderArea1 = test.borderArea(1,1,2,2);		// expected: borderArea1 = 3
	int borderArea2 = test.borderArea(2,5,4,5);		// expected: borderArea2 = 10

	// Test for Problem 3: Currency Converter, USD to MEX
	// Reference converter (XE Currency) gives 1 USD = 20.75 MEX.
	// Discrepancy can be attributed to manually-rounded conversion rate in
	// method definition. Program would not compile due to incompatible types error:
	// "possible lossy conversion from double to int".
	int conversion1 = test.USDtoMEX(1);			// expected: conversion1 = 21
	int conversion2 = test.USDtoMEX(45);		// expected: conversion2 = 945

	// Test for Problem 4: Combiner
	// Not possible to call method with arguments that run but produce incorrect output:
	// such arguments would be negative numbers, but they would be converted to their
	// absolute values by the Math.abs() method and result in correct outputs.
	int combine1 = test.combineToMinutes(2,31); // 2 hrs 31 min == 151 min
	int combine2 = test.combineToMinutes(1,50);	// 1 hr 51 min == 111 min
}
