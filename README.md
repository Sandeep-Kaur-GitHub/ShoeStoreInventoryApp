# ShoeStoreInventoryApp
Getting Started
Steps:

Step1-Add the navigation libraries to the app build.gradle file
Step2-Add the safe-arg plugin to the main and app build.gradle file
Step3-Set DataBindingUtil in build.gradle
Step4-Use DataBindingUtil to inflate every layout
Step5-Create a new navigation xml file
Step6-Create a new Login destination.
                      Include email and password labels
                      Include email and password fields
                      Create buttons for creating a new login and logging in with an existing account
                      Clicking either button should navigate to the Welcome Screen.
Step7-Create a new Welcome screen destination that includes:
                      A new layout
                      At least 2 textviews and use any text you would like
                      A navigation button with actions to navigate to the instructions screen
Step8-Create a new Instruction destination that includes:
                      A new layout
                      At least 2 textviews with appropriate information
                      A navigation button with actions to navigate to the shoe list screen
Step9-Create a class that extends ViewModel
Step10-Use a LiveData field that returns the list of shoes
Step11-Create a new Shoe List destination that includes:
                    A new layout
                    A ScrollView
                    A LinearLayout inside the ScrollView for Shoe Items
                    A FloatingActionButton with an action to navigate to the shoe detail screen
Step12-In MainActivity, setup the nav controller with the toolbar and an AppBarConfiguration
Step13-In the shoe list screen, add a Logout menu. This Logout menu will appear only on the shoe list screen and will return the user to the login screen.
Step14-Create a new Shoe Detail destination that includes:
                    A new layout
                    A TextView label and EditView for the Shoe Name, Company, Shoe Size and Description
                    A Cancel button with an action to navigate back to the shoe list screen
                    A Save button with an action to navigate back to the shoe list screen and add a new Shoe to the Shoe View Model.
                    Hint: In the Shoe List destination, to add a child view programmatically to a ViewGroup, such as LinearLayout, use the addView()method.
Step14-Make sure you can’t go back to onboarding screens In the Shoe List screen:
Step15-use an Activity level ViewModel to hold a list of Shoes (use by activityViewModels)
Step16-Observe the shoes variable from the ViewModel
Step17-Add new layout item into the scrollview for each shoe.
