# TPsAchrafHamidi
Activité Pratique du Contrôle

Objectif :  
Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.

Travail à faire :

1.Créer le micro-service customer-service qui permet de gérer les client

![Screenshot 2022-12-08 153454](https://user-images.githubusercontent.com/56925602/206560328-bbff0c84-8a20-4951-9b73-4bc2de000e26.png)

![image](https://user-images.githubusercontent.com/56925602/206561756-0e2a15bb-4a60-4055-9f84-13389aebbf3f.png)

2.Créer le micro-service inventory-service qui permet de gérer les produits

![image](https://user-images.githubusercontent.com/56925602/206562408-afac3a83-f0fc-4cf6-8bb4-824dfe939d4c.png)

3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage

![image](https://user-images.githubusercontent.com/56925602/206562732-1c858b54-d07e-4493-b974-ec1d0908ede0.png)
![image](https://user-images.githubusercontent.com/56925602/206563216-852d5a1b-3efd-4bc3-bf76-b42279d2c9cb.png)


4. Créer l'annuaire Eureka Discrovery Service
![image](https://user-images.githubusercontent.com/56925602/206563369-6767c8cd-0605-4ce9-94be-0b8d4c2dbfcb.png)


5. Faire une configuration dynamique des routes de la gateway
![image](https://user-images.githubusercontent.com/56925602/206563446-42fc2e39-4e8c-4d03-903e-331458007228.png)

![image](https://user-images.githubusercontent.com/56925602/206563963-a5cb3f11-94d2-4dd2-9ed3-4f603fdf2425.png)

![image](https://user-images.githubusercontent.com/56925602/206563523-f878f564-3c4d-4e48-80bb-c2347da2a09f.png)

6. Créer le service de facturation Billing-Service en utilisant Open Feign
![image](https://user-images.githubusercontent.com/56925602/206563692-acaa75dc-0832-4265-b59e-bb7cab253d32.png)

