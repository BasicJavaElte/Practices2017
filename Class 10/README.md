## Today's problem

Your job today is to prepare the system of the hospital for handling patients.

There are three kinds of patients
* Super Emergency ones (who go straight to the doctor without registering)
* Emergency ones who make a registration and then go to the general doctor
* Check up patient who just arrive and already have some specialist to go

All patients have the following information:

* Name
* Phone
* Date of Birth (Date type)
* Blood Type (A+, AB+ and so on...)

All the medic doctors have the following information:

* Name
* Phone
* Blood type
* Date of Birth
* Medic Doctor License
* Speciality

The patients are handled by cases, so that, every case is started as soon as the patient arrives and needs to have the following information:
* Patient
* List of MDs in charge, being the last one the current one
* Entry Date
* Exit date (empty in case the patient is still in the hospital)

Your software should handle the following situations: (data that are not given like dates can be made up)


Unknown patient arrives, is sent to the general doctor, who finds out he has a brain problem and then the patient is sent to Doctor Lee, a neurologist.

Jeoge Bass, born in 05/05/2010 arrives for an eventual visit to the urologist, he is signed to doctor Maoutee Moutoo.



## Requirements:
Use your best knowledge to avoid unnecessary repeating of code and to make the better usage of the Java language (e.g. use @Override always when possible)

Make a listing by doctor where you insert the doctor's license and get all the patients assigned to him

## Recommendations and pseudo-grading
Implementation of the classes and one use case is worth two points

Implementation of the change of doctors is one point

Implementation of the listing of patients by doctor is two points
