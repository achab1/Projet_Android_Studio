# Projet de développement mobile: Application pour la recherche d'emploi.

La thématique traitée dans ce travail est du domaine de la 
recherche d'emploi. 

Dans le dispositif mis en place les accès essentiels sont: 

•Une Présentation du système avec un bouton qui redirige vers la 
page de visuaisation des CV 

•Une Page de Visualisation (ListView) des CV enrégistrés dans la 
base MySQL avec Spring boot

## Backend
 •La partie backend de l'application a été développée sur IntelliJ et utilise une base de données contenant la table 'cv' avec les attibuts: 
 
-nom
-prenom
-age
-adresse
-email
-telephone
-specialite
-niveauEtude
-experienceProfessionnelle.

• Les technologies utilisées pour le développement sont Spring Boot, Hibernate et MySQL.

![IntelliJ](https://user-images.githubusercontent.com/112700832/234557006-438c0b92-6e95-4e89-ab1e-00ab06f999d7.PNG)

• Les API ont été testées avec Swagger. 

![Swagger1](https://user-images.githubusercontent.com/112700832/234557146-63f8feb1-55c0-4a47-9e06-a87730fdd4e3.PNG)
![swagger2](https://user-images.githubusercontent.com/112700832/234557181-85901501-10f9-4663-9f83-04738a2372d1.PNG)
![Swagger3](https://user-images.githubusercontent.com/112700832/234557211-631a622c-a8b1-4838-b24f-b8235f2b8472.PNG)


• XAMPP Control Panel a été utilisé pour lancer le serveur MySQL.

![Xampp](https://user-images.githubusercontent.com/112700832/234557341-23f02197-fb8f-40c1-ba9e-edf7b6eaa7cd.PNG)


## Partie Frontend
• La partie frontend de l'application a été développée sur Android Studio. 

![Android1](https://user-images.githubusercontent.com/112700832/234557423-6072dba5-00cd-408b-b70d-cb5f2c4491dc.PNG)

• Nous avons pu tester l'application et la visualiser avec l'emulateur Google Pixel 5 API 30

![Google pixel 5 api 30 emulateur](https://user-images.githubusercontent.com/112700832/234557660-cd00fdf3-7271-494f-8be5-ebdd702aa39c.PNG)
![LancementAppli](https://user-images.githubusercontent.com/112700832/234557708-66ec6552-d524-4617-a467-b369a78727b0.PNG)

• L'application comporte 2 pages :
  - Accueil : affiche le nom de l'application, une description et une image. Ensuite, on a un bouton 'Liste des CV' On peut cliquer sur un bouton pour derouler la liste des CV.

![PageListeDesCv](https://user-images.githubusercontent.com/112700832/234557803-b63f2eab-a0f0-4b06-8d25-61b32e7c10ba.PNG)

  -Liste des CVs : affiche la liste des CVs enregistrés dans notre base de données.
   ![Page2](https://user-images.githubusercontent.com/112700832/234557859-ab4e6fa4-819b-458f-8796-d0b26e67e359.PNG)
