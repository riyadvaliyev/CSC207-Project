# CSC207-Project

## Description

<!-- Problem Domain -->
The problem domain that the project focuses on is healthcare, specifically the establishment of the doctor–patient
relationship, when the patient is trying to find the best doctor to treat their specific ailments, and the
simplification of the initial screening phase as to enable ease of access to formal diagnosis and treatment.

<!-- Description -->
The primary function of this project is to initiate and facilitate the doctor–patient relationship by providing
preliminary diagnosis for a patient via an API call to Dialogflow, a natural language processing model, in order to
identify symptoms and possible diseases, and then connecting them to a doctor who specialises in the areas that the
diseases are concerned with.

The application will have 3 primary stages:

1. Preliminary identification of the patient's symptoms and possible causes through Dialogflow.
2. Referral to a list of general practitioners or specialists in the affected fields, from which the patient can then
   choose to receive treatment from.
3. A chatting feature, including text, picture, and video, between the doctor and patient to provide treatment.

Users and practitioners will be able to log in and log out of accounts, and basic user information will be stored via
MongoDB.

## APIs

Our team currently employs two APIs for this project: MongoDB Atlas and DialogFlow.

We will predominantly utilize MongoDB Atlas for data storage and querying purposes. This includes storing information
about available doctors and executing queries to identify suitable doctors based on a patient's symptom description. We
have chosen MongoDB Atlas for its user-friendly interface and streamlined operational efficiency.

Furthermore, we intend to implement an interactive chatbot using the DialogFlow API. When visitors access our website,
they will have the opportunity not only to peruse web content but also to engage in conversations with the chatbot. The
chatbot will facilitate the process of finding an appropriate doctor based on your symptoms, enabling you to take any
necessary actions accordingly.

## Examples

### 1. MongoDB Atlas

The following three images demonstrate how Postman is used to invoke the MongoDB API.

The first image shows that the MongoDB public API is forked and filled with required information to ensure
our database can be accessed.

<img src="assets/properties.png" style="width: 600px" alt="demonstrating how to make connecting to MongoDB">

The second image illustrates how we used the insert method to add "Eric" to the database,
and the console returned a success message.

<img src="assets/insert.png" style="width: 600px" alt="insert Eric into database">

The third image demonstrates that a query method is used to retrieve the person named Eric from the database.

<img src="assets/find.png" style="width: 600px" alt="query Eric succeed">

The following is a small snippet of Java code used to create an object in the database. After successful execution, it
added the data to the cloud-based database. This demonstrates that our MongoDB is functioning correctly.

<img src="assets/insertExample.png" style="width: 600px" alt="query Eric succeed">

### 2. DialogFlow

## Technical Issues


