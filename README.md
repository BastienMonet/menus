### 1 
Il y a 3 branches dans ce depot

  json
  master
  pom_xml

git branch


### 2

commit a837885097f1d462914a77d0e7b9a0135e5ac7ed
Author: Joaquin "Joe" Lapin <Jo.Lapin@univ-hochmoehrefelder.fr>
Date:   Sun Mar 24 11:29:35 2024 +0100

    Version initiale avec maven
git log


### 3

changement de branche 

git switch pom_xml | git log

commit f8c7c79e662cc640e4fc8e86605508720e958ef3 (HEAD -> pom_xml)
Author: Bill Canard <Bill.Canard@univ-la-mare-aux-canards.fr>
Date:   Tue Mar 26 18:32:52 2024 +0100

    Changement de version de Java dans le pom.xml



commit 51d4938d01fa71ab947d104e2dd2460d4ccdabb2 (HEAD -> json)
Author: Sophie Lajir-Haff <Sophie.Lajir-Haff@univ-lahaut.be>
Date:   Tue Mar 26 19:27:34 2024 +0100

    Implémentation de Menu.fromJson()


### 4

oui

Sur la branche master
Fichiers non suivis:
  (utilisez "git add <fichier>..." pour inclure dans ce qui sera validé)
        README.md
        demain_midi.json
        enonce1.pdf
        target/

oui, il faut les commits

git add .

git commit -m 

git push origin master

### 5

commit 88d3d0f0c74efa6386f3c83320a394ddac9e2ea9 (HEAD -> Bastien, origin/Bastien)
Author: Joaquin "Joe" Lapin <Jo.Lapin@univ-hochmoehrefelder.fr>
Date:   Fri Mar 28 16:11:41 2025 +0100

    Question 5


### 6

non, tout les tests ne passe pas

javac -d bin src/main/java/fr/univ_orleans/iut45/menus/*.java

javac -d bin -cp "lib/*:bin" src/test/java/fr/univ_orleans/iut45/menus/*.java

src/test/java/fr/univ_orleans/iut45/menus/AppTest.java:41: error: cannot find symbol
        assertEquals(false, ce_midi.estComplet());
                                   ^
  symbol:   method estComplet()
  location: variable ce_midi of type Menu
src/test/java/fr/univ_orleans/iut45/menus/AppTest.java:60: error: cannot find symbol
        assertTrue(ce_soir.estComplet());
                          ^
  symbol:   method estComplet()
  location: variable ce_soir of type Menu
2 errors



javac -d bin -cp "lib/*:bin" src/test/java/fr/univ_orleans/iut45/menus/*.java

java -cp "bin:lib/*" org.junit.runner.JUnitCore AppTest.java

maintenant tout les test passent


