package Puntos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Punto3 
{
	private static final String USER = "ingresoRedsis";
	private static final String PASS = "Qwerty0909$";
	private static final String URL = "https://securetransfer.redsis.com/rest/forms/v1/teamGoAny/payload";
	
	public static void main (String[] args)
	{
		try 
		{
			System.out.println("1");
            URL url = new URL(URL);
			System.out.println("2");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			System.out.println("3");
            conn.setRequestMethod("GET");
			System.out.println("4");
            if (conn.getResponseCode() != 200) 
            {
                throw new RuntimeException("Failed : HTTP Error code : " + conn.getResponseCode());
            }
			System.out.println("5");
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) 
            {
                System.out.println(output);
            }
            conn.disconnect();
        } 
		catch (Exception e) 
		{
            System.out.println("Exception in NetClientGet:- " + e);
        }
	}

}
