### Adding Dependencies
Open the build.gradle file for the app module and add the necessary dependencies.

### Create Mock API Endpoints
Create a Mock for Products

### Create Data Classes
Create Kotlin files in a model package

### Creating the API Service
Create an API Service in the network package and define an interface for the service with endpoints to fetch data.

### Setup Retrofit
Create RetrofitInstance in the network package with base URL and a converter factory

### Create the Repository
Create Repository in your repository package. Implement the Product Repository interface and use the ApiService to fetch data

### Dependency Injection with Hilt
Create a module for Repository in a di package and define a module that provides the repository implementation

### Create a Network Module for Hilt
Create a module in the DI package and define a module that provides the Retrofit instance and the ApiService

### Implement the ViewModel
Create a ViewModel in the viewmodel package that uses the repository to fetch products and categories.

### Setup the UI
Create a fragment for the Product list in the ui package. Implement a Fragment that observes the products LiveData from the ViewModel and displays the product list

### Designing the product List UI
create the new layout file. with the RecyclerView for displaying the product list. Create the RecyclerView Adapter

### Design the product Item Layout
Design the layout for each product iem with an imageView

### Update the Fragment class
update the method to set up the RecyclerView with the productAdapter

### Finalize the MainActivity
Update the MainActivity file to display the fragment.

