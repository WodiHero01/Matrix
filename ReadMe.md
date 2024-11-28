# Project manipulation de matrices
*Matagrin Noé et Pauly Armand*

L’objectif de ce projet est de créer un ensemble de classes et d’interfaces héritant les unes des autres sur le langage de programmation Java afin de pouvoir manipuler des matrices diagonales, rectangulaires et carrés. Nous avons choisi ce langage pour sa rigueur, sa robustesse et sa fiabilité ainsi que pour sa programmation orientée objet.

Dans ce projet, nous avons réalisé les classes suivantes :
![Organisation des classes de notre projet.](/Z_photo/orga_class.png)

À l’aide de différentes méthodes de la classe Matrix, nous pouvons ainsi accéder aux nombres de lignes et colonnes de ces différentes matrices grâce aux méthodes getNumberOfRows et getNumberOfColumns.
On peut également accéder à chaque élément de ces matrices avec la méthode getElement puis changer la valeur d’un élément de ces matrices avec setElement ou encore transposer ces matrices avec "transpose". C'est trois méthodes ont d'abord été défini de manière abstraite dans la classe matrix et par la suite réécrite pour les adaptées aux différents objets.
Enfin, on peut utiliser la méthode toString pour afficher ces matrices.

L’interface MatrixInvertible propose de vérifier si une matrice est inversible avec la méthode isInvertible. On peut également accéder au déterminant d’une matrice avec getDeterminant ou encore trouver l’inverse d’une matrice avec getInvert.

En cas d’erreur dans l’utilisation d’une méthode, des exceptions sont prévues pour indiquer à l’utilisateur l’origine de son erreur et empêcher execution d'un code qui génèrerait une erreur et la fin du code.
Nous avons donc trois exceptions :
* Une exception pour les matrices diagonales
* Une pour les matrices inversibles
* Et une pour les matrices carrées (celle-ci remplace la définition des méthodes, car trop complexe à être implémenté)

Pour plus d’information merci de vous référer à la Javadoc du projet.
