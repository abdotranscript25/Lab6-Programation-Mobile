# Lab6-Programation-Mobile - PizzaRecipes

##   Description
Application Android réalisée dans le cadre du Lab 6 de développement mobile.  
Elle permet d'afficher une liste de pizzas avec leur nom, prix, durée et image, puis d’accéder au détail complet de chaque recette (ingrédients, description, étapes de préparation).

##   Fonctionnalités
- **Splash Screen** : Écran d'accueil animé avec dégradé personnalisé
- **Liste des pizzas** : Affichage de 10 pizzas avec image, nom, prix et durée
- **Détail des pizzas** : Affichage complet (ingrédients, description, étapes)
- **Navigation** : Du splash vers la liste, puis vers le détail
- **Architecture** : Organisation en packages (classes, dao, service, adapter, ui)

##   Technologies utilisées
- **Langage** : Java
- **SDK minimum** : API 24 (Android 7.0)
- **Architecture** : Pattern Singleton, DAO, ListView avec adaptateur personnalisé
- **Composants** : ListView, ImageView, TextView, ScrollView
- **Images** : Stockées dans res/mipmap (pizza1.jpg à pizza10.jpg)

##   Captures d'écran

### Splash Screen (activity_splash.xml)
<img width="949" height="843" alt="12" src="https://github.com/user-attachments/assets/f2d520f4-bf7b-4d87-ae41-494690678ef7" />
<img width="972" height="838" alt="12_1" src="https://github.com/user-attachments/assets/50e3b82e-0e03-4505-a24d-67727c3069a6" />



### Layout principal (activity_list_pizza.xml)
<img width="863" height="735" alt="10" src="https://github.com/user-attachments/assets/282bce2e-de3a-4573-9d57-9266d6935a34" />


### Layout d'un item (row_pizza.xml)
<img width="889" height="852" alt="13" src="https://github.com/user-attachments/assets/f49908f9-d556-4f39-9bff-bef3e717a5f9" />
<img width="819" height="413" alt="13_1" src="https://github.com/user-attachments/assets/fc24713c-01d5-4471-8e82-78032c146eec" />

### Layout détail (activity_pizza_detail.xml)
<img width="886" height="828" alt="11" src="https://github.com/user-attachments/assets/4e2a1cca-ca83-4a2b-aaf2-97504bb61aa0" />
<img width="894" height="829" alt="11_1" src="https://github.com/user-attachments/assets/92f168e2-5c09-4870-8e08-6476d1b39134" />
<img width="905" height="838" alt="11_2" src="https://github.com/user-attachments/assets/e768b6b3-ab1e-4235-849a-a707e783d609" />
<img width="845" height="647" alt="11_3" src="https://github.com/user-attachments/assets/3ad688bf-a267-434a-92b2-a8946b967575" />


### MainActivity.java (Liste des pizzas)
<img width="1300" height="823" alt="5" src="https://github.com/user-attachments/assets/d1e4dba7-d421-4092-8da4-aeac3e5673a6" />


### PizzaAdapter.java (Adaptateur personnalisé)
<img width="1169" height="836" alt="1" src="https://github.com/user-attachments/assets/0cb848df-bf5f-4b81-b017-2ee10cc25664" />
<img width="1166" height="779" alt="1_1" src="https://github.com/user-attachments/assets/714db344-4550-4222-9043-e190622c73a8" />


### PizzaDetailActivity.java (Détail d'une pizza)
<img width="1201" height="833" alt="6" src="https://github.com/user-attachments/assets/67f32221-089e-463c-b496-878cb07078e2" />
<img width="884" height="391" alt="6_1" src="https://github.com/user-attachments/assets/0fbeef39-8766-4a42-9ad6-7375a67aa87b" />


### Produit.java (Modèle de données)
<img width="1370" height="848" alt="2" src="https://github.com/user-attachments/assets/c86995c9-a831-4445-8a2a-0616c789dea3" />
<img width="1336" height="820" alt="2_1" src="https://github.com/user-attachments/assets/3ee44129-1bbf-41b6-9448-d3ce82f23266" />
<img width="1375" height="838" alt="2_2" src="https://github.com/user-attachments/assets/f94dd078-007a-474b-883f-7caf78107157" />
<img width="857" height="412" alt="2_3" src="https://github.com/user-attachments/assets/745ad418-91bf-4f58-a52f-fba0fb665504" />




### ProduitService.java (Singleton)
<img width="1377" height="835" alt="4" src="https://github.com/user-attachments/assets/9dcc218b-7c63-48b8-981b-a41251e75eab" />
<img width="1436" height="833" alt="4_1" src="https://github.com/user-attachments/assets/0ecdbf24-7718-4101-861e-31396678b1ce" />
<img width="1386" height="827" alt="4_2" src="https://github.com/user-attachments/assets/ebb0a72b-13e3-4ac5-ac61-f90fd907d68a" />
<img width="802" height="269" alt="4_3" src="https://github.com/user-attachments/assets/b95420bc-1e8a-4808-81ce-42e0277d2d98" />


### IDao.java (Interface générique)
<img width="1375" height="546" alt="3" src="https://github.com/user-attachments/assets/0d3c50e6-587a-41c5-9924-b6199dea8525" />


### AndroidManifest.xml
<img width="1082" height="634" alt="And" src="https://github.com/user-attachments/assets/c6cfc7b2-b322-4822-bb47-2697a0e201ca" />


### Animation (zoom_in.xml)
<img width="1085" height="422" alt="8" src="https://github.com/user-attachments/assets/5facf97c-dbb1-47c8-ab3c-8d6998655d1d" />

### Splash Background (splash_background.xml)
<img width="603" height="427" alt="14" src="https://github.com/user-attachments/assets/94480794-e300-4ed7-81e8-7bb9d57b7587" />


### Liste des pizzas
<img width="624" height="736" alt="test1" src="https://github.com/user-attachments/assets/b357ee95-9777-4c7e-9685-4c30533b3e6c" />


### Détail d'une pizza
<img width="637" height="748" alt="test2" src="https://github.com/user-attachments/assets/f996e892-6af0-42bb-aa78-69894661eb5c" />

##   Démonstration vidéo


https://github.com/user-attachments/assets/12d18bfc-925f-4f36-9860-61f87e258cd2



##   Structure du projet
- `app/src/main/java/com/example/pizzarecipes/classes/Produit.java` : Modèle de données
- `app/src/main/java/com/example/pizzarecipes/dao/IDao.java` : Interface générique DAO
- `app/src/main/java/com/example/pizzarecipes/service/ProduitService.java` : Singleton (gestion des données)
- `app/src/main/java/com/example/pizzarecipes/adapter/PizzaAdapter.java` : Adaptateur pour la liste
- `app/src/main/java/com/example/pizzarecipes/ui/SplashActivity.java` : Écran de démarrage
- `app/src/main/java/com/example/pizzarecipes/ui/MainActivity.java` : Liste des pizzas
- `app/src/main/java/com/example/pizzarecipes/ui/PizzaDetailActivity.java` : Détail d'une pizza
- `app/src/main/res/layout/activity_splash.xml` : Layout du splash screen
- `app/src/main/res/layout/activity_list_pizza.xml` : Layout de la liste
- `app/src/main/res/layout/row_pizza.xml` : Layout d'un item
- `app/src/main/res/layout/activity_pizza_detail.xml` : Layout du détail
- `app/src/main/res/drawable/splash_background.xml` : Dégradé du splash
- `app/src/main/res/anim/zoom_in.xml` : Animation du splash
- `Screenshots/` : Captures d'écran et vidéo

## 🧠 Concepts clés abordés
| Concept | Rôle |
|---------|------|
| **ListView** | Afficher une liste déroulante d'éléments |
| **Adapter personnalisé** | Relier les données à la ListView |
| **BaseAdapter** | Classe de base pour créer un adaptateur |
| **Singleton** | Une seule instance de ProduitService |
| **DAO (Data Access Object)** | Interface générique pour l'accès aux données |
| **Splash Screen** | Écran d'accueil animé |
| **ScrollView** | Permettre le défilement du contenu |
| **LayoutInflater** | Charger un layout XML dans une vue |
| **Optimisation convertView** | Réutilisation des vues pour les performances |

## 👤 Auteur
**abdotranscrip25** El Hachimi Abdelhamid - Lab6 Programation Mobile

## 📅 Date de réalisation
Avril 2026
