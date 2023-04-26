# Projet de développement mobile: Application pour la recherche d'emploi.

La thématique traitée dans ce travail est du domaine de la 
recherche d'emploi. 
Il s'agit de faciliter à un demandeur d'emploi une interface d’accès pour voir les offres d'emplois postées et la notification d'offres suivant les catégories concernées. 

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
• Les API ont été testées avec Postman et Swagger. 
• XAMPP Control Panel a été utilisé pour lancer le serveur MySQL


## Partie Frontend
• La partie frontend de l'application a été développée sur Android Studio. 
• L'application comporte 2 pages :
  - Accueil : affiche le nom de l'application, une description et une image. Ensuite, on a un bouton 'Liste des CV' On peut cliquer sur un bouton pour derouler la liste des CV.
  -Liste des CVs : affiche la liste des CVs enregistrés dans notre base de données.
