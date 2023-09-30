package org.example;

import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.dialogflow.v2.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;


public class DialogflowExample {
    private static final String PROJECT_ID = "benson-ag9e";
    private static final String LANGUAGE_CODE = "en-US";
    private static final String SESSION_ID = UUID.randomUUID().toString();
    private static final String CREDENTIALS_FILE_PATH = "src/main/java/org/config/benson.json";

    public static void main(String[] args) throws IOException {
        // Set up Google Cloud credentials
        GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(CREDENTIALS_FILE_PATH));
        CredentialsProvider credentialsProvider = FixedCredentialsProvider.create(credentials);

        // Create a SessionSettings object
        SessionsSettings sessionSettings = SessionsSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();

        // Create a SessionsClient using a managed channel
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget("dialogflow.googleapis.com:443").build();
        SessionsClient sessionsClient = SessionsClient.create(sessionSettings);

        // Build the session name
        SessionName session = SessionName.of(PROJECT_ID, SESSION_ID);

        // Create a TextInput object
        TextInput textInput = TextInput.newBuilder().setText("I feel ill i need a doctor").setLanguageCode(LANGUAGE_CODE).build();

        // Create a QueryInput object
        QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();

        // Create a DetectIntentRequest object
        DetectIntentRequest request = DetectIntentRequest.newBuilder()
                .setSession(session.toString())
                .setQueryInput(queryInput)
                .build();

        // Call the detectIntent method
        DetectIntentResponse response = sessionsClient.detectIntent(request);

        // Get the response text from the result
        QueryResult queryResult = response.getQueryResult();
        String fulfillmentText = queryResult.getFulfillmentText();

        // Print the response
        System.out.println("Response: " + fulfillmentText);

        // Clean up resources
        sessionsClient.close();
        managedChannel.shutdown();
    }
}
