# Chess

Petit projet Java pour travailler l'heritage avec des pieces d'echecs.

## Structure

- `Position` contient les attributs `row` et `column`.
- `Piece` verifie si une position est dans les limites du plateau.
- `Rock`, `Bishop` et `Queen` redefinissent `isValidMove`.
- `Main` teste le deplacement de la reine.

## Lancer le projet

Compiler les fichiers Java :

```powershell
javac src\*.java
```

Executer le programme :

```powershell
java -cp src Main
```
