package org.dataprovidertestng;

import org.testng.annotations.DataProvider;

public class Data{
	
	@DataProvider(name="credentials")
	private Object [][] testData() {
		return new String [] []{
			{"Arjun","8546129735","derf234@yahoo.com"},
			{" Bala","6385129735","canbean@gmail.com"},
			{" Daniel","8546129","t@123.com"},
			{" Alean","954612578","…@@"}
		
		};
	}
}

