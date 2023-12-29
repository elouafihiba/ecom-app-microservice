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
- la liste sans projection:
![sc](./captures/img_11.png)
- la liste avec projection:
![sc](./captures/img_20.png)
- la recherche d'un customer par id:
![sc](./captures/img_12.png)

# Configuration dynamique de la Gateway:
![sc](./captures/img_14.png)
![sc](./captures/img_13.png)
![sc](./captures/img_15.png)

# Configuration dynamique de Inventory-service:

![sc](./captures/img_17.png)

![sc](./captures/img_16.png)
- liste des produits sans projection:
![sc](./captures/img_18.png)
- liste des produits avec projection:
![sc](./captures/img_19.png)

# Configuration dynamique de Order-service:
![sc](./captures/img_21.png)
- liste des commandes par client et produit:
![sc](./captures/img_22.png)
- Affichage d'une commande compète(client,produit):
![sc](./captures/img_23.png)

7. Configuration de Billing Service:
# avec consul config:
- Creation d'un repertoire config billing-service:
![sc](./captures/img_28.png)

![sc](./captures/img_25.png)

![sc](./captures/img_24.png)

![sc](./captures/img_26.png)

![sc](./captures/img_27.png)


# avec Vault:





