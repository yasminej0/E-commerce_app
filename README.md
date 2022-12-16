# E-commerce_app
Objectif :  
Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.


1.Création le micro-service customer-service qui permet de gérer les clients

2.Création le micro-service inventory-service qui permet de gérer les produits

3.Création de la Gateway Spring cloud Gateway avec une Configuration statique du système de routage
/configuration dynamique des routes de la gateway:
![image](https://user-images.githubusercontent.com/100994320/208200059-b0a01b7b-f257-4b3f-a917-2dcc7ec27aec.png)

4. Création de l'annuaire Eureka Discrovery Service
 

6. Création du service de facturation Billing-Service en utilisant Open Feign

7. Création d'un client Web Angular (Clients, Produits, Factures):
   Donner la permission pour acceder aux données:
   ![image](https://user-images.githubusercontent.com/100994320/208201246-20f4df65-7b41-4fd3-acda-acc550c73011.png)


   -->Customers
   ![IMG_2298](https://user-images.githubusercontent.com/100994320/208179410-92b38107-9d3e-48e7-bf06-9d9415a9dee9.jpg)
   -->Products
   ![PHOTO-2022-12-16-21-05-05](https://user-images.githubusercontent.com/100994320/208180376-cb30bf26-7567-4ea0-8a17-0cfe893f13d3.jpg)
   -->Orders
   ![IMG_2299](https://user-images.githubusercontent.com/100994320/208179436-5656c2f9-2db1-4254-b942-d4821b587f4c.jpg)
   -->Bills
   ![IMG_2300](https://user-images.githubusercontent.com/100994320/208179455-a40cc96f-5f86-4ae5-99ff-10e30bd83e70.jpg)
   ![IMG_2301](https://user-images.githubusercontent.com/100994320/208179467-c7ebf414-7b58-4c85-8b47-3481cdd4fd91.jpg)

8. Déployement du serveur keycloak :

     ![Capture](https://user-images.githubusercontent.com/100994320/208163517-6cf26b3c-7cfc-464f-aec4-eac3fabdb399.JPG)

     - Création d'un Realm:
     
     ![realm](https://user-images.githubusercontent.com/100994320/208172014-19381b7f-1afd-4265-9a31-6868bff5c695.JPG)

     - Création des utilisateurs:
     
     ![users_keycloak](https://user-images.githubusercontent.com/100994320/208172126-644552f7-61ce-4f62-986a-180aa88983af.JPG)

     - Création des rôles / Affectaion les rôles aux utilisateurs

     ![roles_keycloak](https://user-images.githubusercontent.com/100994320/208172155-13c21044-7535-445d-bfce-c9382d162fa9.JPG)

     
     - Test des différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token :
     ![IMG_2294](https://user-images.githubusercontent.com/100994320/208172276-100b0c9c-f732-4bbf-9ad4-a7775f39f8ed.jpg)
     ![IMG_2293](https://user-images.githubusercontent.com/100994320/208172299-d3223e70-8c52-4505-a97a-e376f47dfc5a.jpg)

     
9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak


