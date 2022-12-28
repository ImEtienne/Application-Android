# Application-Mobile-Android-projetB
# 1.  Instructions générales
  Créez un nouveau projet en langage Java, nommé selon le schéma “TP5b_numéro”, où “numéro”
  est votre numéro d’étudiant.
  Assurez-vous que la “minSdk” soit bien 19 ! On peut soit choisir ce paramètre à la création du
  projet, soit le changer dans le build.gradle a posteriori. Un projet qui ne compile pas, ou qui ne
  peut pas être exécuté sur les appareils prêtés (Sdk = 19) recevera 0.
  Une fois le projet terminé, exportez votre projet (File ! Export ! Export to Zip File), et
  rendez ce fichier sur Eprel.
  La Section 2 constitue le sujet du TP. La Section 3 détaille la procédure de notation. On pourra
  s’y référer pendant la séance pour prendre connaissance des modalités d’évaluation.
    
# 2.  Chocolatine factory
  L’objectif de ce TP est d’implémenter le jeu Chocolatine factory.
  C’est bien connu : une chocolatine n’est rien d’autre qu’un croissant dans lequel on a glissé deux
  barres de chocolat. L’objectif de ce jeu est de créer un maximum de chocolatines, en suivant cette
  recette.
  
  L’idée du jeu est simple : comme illustré en Figure 1, l’interface contient trois images (un
croissant, une barre de chocolat, et une chocolatine), et trois champs de texte associés.
Quand l’utilisateur ou l’utilisatrice clique sur l’une des deux premières images, le compteur
associé est incrémenté. En revanche, quand il ou elle clique sur l’image de la chocolatine, autant de
chocolatines que possible sont créées, chacune consommant un croissant et deux barres chocolatées.
Dans le cas où il n’est pas possible de créer ne serait-ce qu’une chocolatine, un message d’erreur
s’affichera.

# 2.1 Layout et matières premières
Question 1 Créez le layout de l’ Activity . Comme on l’a vu, il devra être constitué de trois
images, et de trois champs pour afficher du texte. Voici les valeurs de départ de ces View :
— La première image affichée sera croissant.png, qui est à télécharger sur Eprel. Pour ajouter
une image au projet, suivez les instructions de la Figure 2, puis allez chercher l’image en
question dans votre système de fichier.
— La deuxième image affichée sera barre_chocolat.png.
— La troisième image affichée sera chocolatine.png.
— Le premier champ de texte affichera (provisoirement) la chaîne “Croissants : 0”.
— Le deuxième champ de texte affichera (pour l’instant) la chaîne “Barres de chocolat : 0”.
— Le troisième champ de texte affichera (pour le moment) la chaîne “Chocolatines : 0”.

# Question 2 
Faites en sorte que chaque clic sur l’image de croissant incrémente le nombre de
croissants, et que chaque clic sur l’image de la barre chocolatée fasse de même pour le compteur de
barres chocolatées.
Note : les images peuvent être pourvues d’une méthode onClick() de la même manière que
les boutons.
On attend aussi que les nouveaux résultats s’affichent à l’écran dans les bons champs de texte,
comme sur la Figure 1.
On rappelle que les trois compteurs démarrent à 0.

# 2.2 Fabrication de chocolatines
  On va à présent s’occuper de la production de chocolatines. La règle du jeu stipule que la
  fabrication d’une chocolatine consomme un croissant et deux barres chocolatées. En cliquant sur
  l’image de la chocolatine, autant de chocolatines que possible sont fabriquées.
  Question 3 Écrivez une méthode nbChocolatines(), renvoyant un int, qui calcule le nombre de
  chocolatines pouvant être crées dans l’état courant.
# Question 4 
Faites en sorte qu’un clic sur l’image de la chocolatine ait les conséquences suivantes :

Figure 3 – Résultat d’un clic sur l’image de la chocolatine : une chocolatine est créée pour chaque
tranche de un croissant et deux barres chocolatées.
— Si au moins une chocolatine peut être créée, alors autant de chocolatines que possible sont
créées. Les valeurs des trois compteurs devront être mises à jour dans les champs de texte
associés. Cette situation est représentée en Figure 3.
— Autrement, un message ( Toast ) apparaît en bas de l’écran, indiquant “Plus assez de matière
première. Cette situation est illustrée en Figure 4.

# 2.3 Sauvegarde de l’état du jeu
Question 5 Jusqu’ici, le jeu reprend de zéro à chaque fois que l’utilisatrice tourne l’écran.
Faites en sorte que les valeurs courantes soient sauvegardées et que le jeu reparte de ces valeurs
quand l’ Activity n’est pas recrée de zéro (par exemple, dans le cas d’une rotation d’écran).

# 3 Notation
Au moment de corriger le TP de votre camarade, téléchargez le fichier zip qui vous a été attribué
sur Eprel, et importez le projet dans Android Studio (File ! New ! Import Project).
Merci de ne pas chercher à savoir à laquelle ou auquel de vos camarades appartient le numéro
d’étudiant présent dans le nom du projet.
Pour la notation, on se contentera de tester l’application sur un appareil, sans en regarder le
code. Un code qui ne compile recevra une note de 0.
La liste des éléments à vérifier sur l’application que vous avez à noter est donnée en Figure 5.
Pour chaque critère, on attribuera :
— 0, si le critère n’est pas du tout respecté.
— La moitié des points si le critère est partiellement respecté.
— L’intégralité des points si le critère est parfaitement respecté.
