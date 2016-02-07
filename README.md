# business_logic_service

this is an important layer that is responsible for all kinds of data manipulations, decision making, calculations, reminders sending, activities recommendation decisions, etc. This layer receives requests from the UI layer and it gets data from the data layer and processes it to send results back.




1- **registerNewUser(UserData user)** registers a new user if the user is not already in the database.

2- **saveNewSteps(MeasureData measureData)** 
        
        - saves a new step to database
        - check if a goal is achived 
        - return motivational image if goal achived
        - return a famous quote 

3- **statistics(int telegramId)**

        - get the latest week data
        - create chart image from this data
        - get number of complete goals
        - get number of not completed goals