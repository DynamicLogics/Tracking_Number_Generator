package com.tng.servc;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.regex.Pattern;

public class Common {
	
	// Regular expression for slug-case (kebab-case)
    private static final String SLUG_CASE_REGEX = "^[a-z]+(-[a-z]+)*$";

    // RFC 3339 format pattern
    private static final DateTimeFormatter RFC3339_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");

    private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int MAX_LENGTH = 16;
    private static final int MIN_LENGTH = 1;
    
    // Random object to generate the numbers
    private static final Random random = new Random();
    
    // Method to validate the customer's name
    public static boolean isValidCustomerName(String name) {
        if (name == null || name.isEmpty()) {
            return false;  // Name should not be null or empty
        }

        // Check if the name matches the slug-case regex
        Pattern pattern = Pattern.compile(SLUG_CASE_REGEX);
        return pattern.matcher(name).matches();
    }
	
    // Method to validate a creation timestamp in RFC 3339 format
    public static boolean isValidTimestamp(String timestamp) {
        try {
            // Try to parse the timestamp using the RFC 3339 formatter
            OffsetDateTime.parse(timestamp, RFC3339_FORMATTER);
            return true; // If parsing is successful, it's a valid timestamp
        } catch (Exception e) {
            return false; // If parsing fails, it's an invalid timestamp
        }
    }
    
    //Method to generate the unique tracking ID numbers
    public static String generateTrackingNumber() {
        // Generate a random length between 1 and 16
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        
        // StringBuilder to construct the tracking number
        StringBuilder trackingNumber = new StringBuilder(length);

        // Generate a random tracking number
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHANUMERIC.length());
            trackingNumber.append(ALPHANUMERIC.charAt(index));
        }

        return trackingNumber.toString();
    }
    
    // Generate the current timestamp in RFC 3339 format
    public static String generateTimestamp() {
        // Get current time as OffsetDateTime (with timezone)
        OffsetDateTime now = OffsetDateTime.now();
        
        // Format the time in RFC 3339 format
        DateTimeFormatter rfc3339Formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        return now.format(rfc3339Formatter); // Returns time in RFC 3339 format
    }
    
}
