# API-Crypto-Money-Quarkus
## Description
Dans le cadre de l'utilisation d'une technologie appelé [Quarkus](https://quarkus.io/), nous avons décidé de développer une API REST permettant de récupérer les données présent dans une base de données afin de suive le cours des différentes cryptos monnaies présesente en base.
## Réalisation
Ce projet a été développé par 2 personnes : Un [ami](https://github.com/THANPhilippe?tab=repositories) et [moi](https://github.com/Darman09) même.
## Présentation de l'API
### GET /cryptoMoney
Permet de lister l'ensemble des cryptos monnaies.

### GET /cryptoMoney/sigle/{sigle}
Permet d'afficher les informations de la crypto-monnaie en fonction de son sigle (Exemple : /cryptoMoney/sigle/ETH pour ETHEREUM).

### GET /cryptoMoney/name/{name} 
Permet d'afficher les informations de la crypto-monnaie en fonction du nom de la crypto-monnaie (Exemple : /cryptoMoney/name/ETHEREUM pour ETHEREUM).

## GET /cryptoMoney/price/{price}
Permet d'afficher la prix des cryptos monnaies de façon croissantes.

## GET /cryptoMoney/cours/{sigle}
Permet d'afficher l'évolution du cours de la crypto-monnaie en fonction de son sigle.

## GET /cryptoMoneyUser
Permet d'afficher le portfeuille de l'utilisateur actuel.
