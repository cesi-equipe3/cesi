# cesi

## Présentation du mini projet

Vous développerez une application console permettant la gestion d'un petit animal de compagnie (#Tamagotchi2017 ;-))
L'application permettra de nourrir son animal, et de lui montrer des films pour l'occuper. 
L'humeur de l'animal changera en fonction du film visionné, et son humeur affectera sa santé mentale.
Le but est de garder son animal en vie.

## Spécifications

### Organes
L'animal possède trois organes : 
-un coeur qui gère sa santé physique, 
-un cerveau qui gère son humeur et sa santé mentale, 
-un estomac qui lui permet de transformer de la nourriture en énergie (santé physique)

### Energie
L'animal possède une jauge de santé physique (énergie) lui permettant de vivre.
Si cette jauge vient à atteindre 0, il décède isAlive() == false).
Ce mécanisme est géré par son coeur (classe Heart).


### Appétit
L'animal doit manger pour gagner de l'énergie. 
Ce mécanisme est géré par l'estomac (classe Stomach). Chaque jour que l'animal passe avec l'estomac vide, il perd un point de santé physique et cela le déprime (son humeur passe à SAD).
Si l'animal est nourri au delà de la capcité de son estomac, cela le rend malade et il perd également un point de santé. En plus, cela le dégoute de la nourriture (son humeur passe à DISGUSTED).
Chaque jour, l'estomac digère une unité de nourriture qu'il contient. Cela augmente la jauge de santé physique de l'animal de 1 point.
Un animal qui est DISGUSTED ne peut pas manger.

### Mental
Le cerveau gère à la fois l'humeur de l'animal et sa jauge de santé mentale.
Si sa jauge de santé mentale atteint 0, il décède (isAlive() == false).
Son humeur, quant à elle, ne peut le tuer directement, mais elle a beaucoup d'impact sur le reste.
