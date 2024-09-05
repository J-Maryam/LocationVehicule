# Système de Gestion EcoMove

Le système de gestion EcoMove est une application console en Java conçue pour gérer diverses entités telles que les partenaires, les promotions, les tickets et les contrats. Le projet utilise PostgreSQL comme base de données et suit le modèle DAO (Data Access Object) pour l'accès aux données. Ce système offre une interface utilisateur basée sur des menus pour permettre aux administrateurs de gérer ces entités de manière efficace.

## Table des Matières
- [Aperçu du Projet](#aperçu-du-projet)
- [Fonctionnalités](#fonctionnalités)
- [Technologies Utilisées](#technologies-utilisées)
- [Structure du Projet](#structure-du-projet)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Améliorations Futures](#améliorations-futures)

## Aperçu du Projet
Cette application aide les administrateurs d'EcoMove à gérer :
- **Partenaires** : Gérer les partenaires commerciaux associés aux contrats et aux promotions.
- **Promotions** : Gérer les offres promotionnelles liées aux contrats, comme les réductions.
- **Tickets** : Suivre et gérer les tickets de transport.
- **Contrats** : Gérer les accords entre les partenaires et EcoMove.

## Fonctionnalités
- Ajouter, afficher, mettre à jour et supprimer des **Partenaires**.
- Ajouter, afficher, mettre à jour et supprimer des **Promotions**.
- Ajouter, afficher, mettre à jour et supprimer des **Tickets**.
- Ajouter, afficher, mettre à jour et supprimer des **Contrats**.
- Stocker et récupérer les données dans une base de données **PostgreSQL**.
- Interface utilisateur en ligne de commande pour une navigation simple à travers les entités.

## Technologies Utilisées
- **Java** : Langage de programmation principal.
- **PostgreSQL** : Base de données pour stocker et gérer les informations des entités.
- **JDBC** : Pour la communication entre l'application et la base de données.
- **Modèle DAO** : Pour gérer les opérations de base de données pour chaque entité.
- **Modèle Singleton** : Pour une gestion efficace de la connexion à la base de données.

## Structure du Projet
Le projet est organisé en plusieurs packages :

src/ │ ├── config/ │ └── DatabaseConfig.java # Configuration de la connexion à la BD (Singleton) │ ├── dao/ │ ├── PartnerDao.java # DAO pour les partenaires │ ├── PromotionDao.java # DAO pour les promotions │ ├── TicketDao.java # DAO pour les tickets │ └── ContractDao.java # DAO pour les contrats │ ├── models/ │ ├── Partner.java # Entité partenaire │ ├── Promotion.java # Entité promotion │ ├── Ticket.java # Entité ticket │ ├── Contract.java # Entité contrat │ └── enums/ # Enums pour les statuts des contrats, types de réductions, etc. │ ├── console/ │ ├── MainMenu.java # Menu principal pour la navigation │ ├── PartnerMenu.java # Opérations pour les partenaires │ ├── PromotionMenu.java # Opérations pour les promotions │ ├── TicketMenu.java # Opérations pour les tickets │ └── ContractMenu.java # Opérations pour les contrats │ └── main/ └── Main.java # Point d'entrée de l'application


## Installation

### Prérequis
1. **Java** : Assurez-vous que le JDK Java (version 8 ou supérieure) est installé.
2. **PostgreSQL** : Installez PostgreSQL et créez une base de données pour l'application.

### Configuration de la Base de Données
1. Créez une base de données PostgreSQL :
   ```bash
   createdb ecomove

   CREATE TABLE partenaires (
    id UUID PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    adresse VARCHAR(255),
    contactInfo VARCHAR(255)
);

CREATE TABLE contrats (
    id UUID PRIMARY KEY,
    startDate DATE NOT NULL,
    endDate DATE NOT NULL,
    specialRate FLOAT,
    agreementConditions TEXT,
    renewable BOOLEAN,
    contractStatus VARCHAR(50),
    partnerId UUID REFERENCES partenaires(id)
);

-- Répétez l'opération pour les promotions et les tickets...
Configuration du Projet
Clonez ce dépôt.
Mettez à jour le fichier DatabaseConfig.java dans le package config avec vos identifiants PostgreSQL :
public class DatabaseConfig {
    private static final String URL = "jdbc:postgresql://localhost:5432/ecomove_db";
    private static final String USER = "votre_utilisateur";
    private static final String PASSWORD = "votre_mot_de_passe";
    // Code pour le Singleton...
}

Compilation et Exécution
Ouvrez le projet dans votre IDE (par exemple, IntelliJ, Eclipse).
Compilez le projet.
Exécutez l'application via la classe Main.java, qui lancera l'interface en ligne de commande.
Utilisation
Lancez l'application.
Utilisez le menu principal pour gérer les partenaires, promotions, tickets ou contrats.
Suivez les instructions pour ajouter, afficher, mettre à jour ou supprimer des enregistrements.
Quittez l'application en sélectionnant l'option Quitter.
Améliorations Futures
Implémenter l'authentification pour différents rôles d'utilisateur (Admin, Manager, etc.).
Ajouter la gestion des factures ou des paiements.
Créer une interface graphique (GUI) pour remplacer l'interface console.
Améliorer la validation des champs tels que les dates et les UUID.
Licence
Ce projet est sous licence MIT. Vous êtes libre de l'utiliser, de le modifier et de le distribuer.


### Explication des sections :
- **Aperçu du Projet** : Introduction générale de l'application.
- **Fonctionnalités** : Fonctionnalités principales de l'application.
- **Technologies Utilisées** : Liste des outils technologiques employés.
- **Structure du Projet** : Détails de l'architecture du projet.
- **Installation** : Étapes pour installer et configurer le projet localement.
- **Utilisation** : Guide pour utiliser l'application.
- **Améliorations Futures** : Propositions d'améliorations à intégrer.
  
Cela vous permet de communiquer les détails essentiels de votre projet aux futurs développeurs ou utilisateurs.

