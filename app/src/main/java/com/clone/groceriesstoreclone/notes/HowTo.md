## Instructions for Creating the Project

### Adding Third-Party Resources

#### Adding Dependencies
- Navigate to the `build.gradle` file of the app module.
- Insert the required dependencies.

#### Create Mock API Endpoints
- Develop a mock for the Products API.

### Preparing Data

#### Create Data Classes
- Generate Kotlin files within a `model` package for data representation.

### Fetching Data

#### Creating the API Service
- Establish an API service within the `network` package.
- Define an interface in the service with endpoints for data retrieval.

#### Setup Retrofit
- Create a `RetrofitInstance` in the `network` package.
- Configure it with a base URL and a converter factory.

### Creating the Repositories

#### Create the Repository
- Construct a repository in the `repository` package.
- Implement the Product Repository interface.
- Utilize the ApiService to fetch data.

### Dependency Injection

#### Dependency Injection with Hilt
- Develop a module for the repository within a `di` package.
- Declare a module that provides the repository implementation.
- Update the manifest with a custom Application class and internet permissions.

#### Create a Network Module for Hilt
- Construct a module in the `di` package.
- Define a module that supplies the Retrofit instance and the ApiService.

### UI

#### Implement the ViewModel
- Create a ViewModel in the `viewmodel` package.
- Employ the repository to fetch products and categories.

#### Setup the UI
- Generate a fragment for the Product list in the `ui` package.
- Implement a Fragment that observes the products LiveData from the ViewModel and displays the product list.

#### Designing the Product List UI
- Create a new layout file with a RecyclerView for displaying the product list.
- Develop the RecyclerView Adapter.

#### Design the Product Item Layout
- Design the layout for each product item with an ImageView.

#### Update the Fragment Class
- Modify the method to set up the RecyclerView with the productAdapter.

### Build Preparation

#### Finalize the MainActivity
- Update the MainActivity file to display the fragment.

### Keywords
- **Endpoint:** A specific URL or address where an API can access the resources needed to perform its function.
- **Fragment:** A portion of the user interface in an Android app, which can be used in activities.
- **Repository:** A class that abstracts the data layer from the rest of the app, providing a clean API for data access to the rest of the application.
- **Retrofit:** A type-safe HTTP client for Android and Java, used for making network requests.
- **LiveData:** An observable data holder class that is lifecycle-aware, used in the context of Android architecture components.
- **ViewModel:** A class designed to store and manage UI-related data in a lifecycle-conscious way, allowing data to survive configuration changes such as screen rotations.