# Objectif :
Créer une application de e-commerce basée sur les micro services :
1. Consul Discovery
2. Spring Cloud Config
3. Spring Cloud Gateway
4. Customer-service
5. Inventory Service
6. Order Service
7. Consul Config (Billing Service)
8. Vault (Billing Service)
# Architecture:
![sc](./captures/img.png)
# screens
## On Commence par la Configuration du service config:
![sc](./captures/img_8.png)
![sc](./captures/img_9.png)

# visualisation de la configuration de chaque service:
### customer-service:
![sc](./captures/img_2.png)
- environement def
![sc](./captures/img_3.png)
- environement dev
![sc](./captures/img_1.png)
- environement prod
![sc](./captures/img_4.png)

### inventory-service:
- environement def
![sc](./captures/img_5.png)
- environement dev
![sc](./captures/img_6.png)

### application:
![sc](./captures/img_7.png)

# liste des customers
- data base:
![sc](./captures/img_10.png)
- la liste:
![sc](./captures/img_11.png)
- la recherche d'un customer par id:
![sc](./captures/img_12.png)

# Configuration dynamique de la Gateway:
![sc](./captures/img_14.png)
![sc](./captures/img_13.png)
![sc](./captures/img_15.png)
## 



