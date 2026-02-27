package InterviewQuestions2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class ApiCallingEx {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        try {
            // Simulate API call
            connection = (HttpURLConnection) java.net.URI
                    .create("https://api.football-data.org/v4/competitions/").toURL().openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setConnectTimeout(5000); // Set timeout for connection
            connection.setReadTimeout(5000); // Set timeout for reading response

            // getting response
            connection.connect();
            System.out.println("API call initiated. Waiting for response...");
            // Check the response code and read the response
            System.out.println("Waiting for response...");
            Thread.sleep(2000); // Simulate waiting for response (2 seconds)
            System.out.println("Response received. Processing...");
            // Process the response
            System.out.println("Processing response...");
            // Here you would typically read the response stream
            // For demonstration, we will just print the response code
            System.out.println("Processing complete. Checking response code...");
            // Check the response code
            System.out.println("Checking response code...");
            int responseCode = connection.getResponseCode();
            String responseMessage = connection.getResponseMessage();
            System.out.println("Response code: " + responseCode);
            System.out.println("Response message: " + responseMessage);
            if (responseCode == HttpURLConnection.HTTP_OK) {

                // retriving response
                StringBuilder response = new StringBuilder();
                try (java.io.BufferedReader in = new java.io.BufferedReader(
                        new java.io.InputStreamReader(connection.getInputStream()))) {
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                }

                // Print the response
                System.out.println("Response received successfully.");
                System.out.println("Response Code: " + responseCode);
                System.out.println("Response Message: " + responseMessage);
                System.out.println("Response Body: ");

                System.out.println("Response : " + response);
                System.out.println("API call successful.");
            } else {
                System.out.println("API call failed with response code: " + responseCode);
            }
        } catch (Exception e) {
            System.err.println("An error occurred during the API call: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}

class ApiCallEx2 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        HttpURLConnection con = null;
        try {
            // Making Connection
            con = (HttpURLConnection) java.net.URI.create("https://api.football-data.org/v4/competitions/").toURL()
                    .openConnection();
            // set method
            con.setRequestMethod("GET");
            // set Headers
            con.setRequestProperty("Accept", "application/json");
            // set properties
            con.setReadTimeout(5000);
            con.setConnectTimeout(5000);
            // extablishing a connection
            con.connect();
            System.out.println("API call initiated. Waiting for response...");
            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    String inputLine = "";
                    while ((inputLine = reader.readLine()) != null) {
                        response.append(inputLine);
                    }
                }

                System.out.println("Response received successfully.");
                System.out.println("Response Code: " + responseCode);
                System.out.println("Response Body: " + response);

            }
        } catch (Exception e) {
            System.err.println("An error occurred during the API call: " + e.getMessage());
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
    }

}
