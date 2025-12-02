# Use Case: „Katze zum Pet Store hinzufügen“

**Titel:** Katze hinzufügen
<br>
**Akteur:** Benutzer
<br>
**Ziel:** Eine neue Katze wird in die Liste des Pet Stores aufgenommen.

### Kurzbeschreibung:

Der Benutzer wählt im Menü die Option, ein neues Haustier hinzuzufügen. Er entscheidet sich anschliessend für den Typ „Katze“ und gibt die nötigen Informationen ein. Das System erzeugt ein Cat-Objekt und speichert es in der Pet-Liste.

### Hauptszenario (Basic Flow):

1. Der Use Case beginnt, wenn der Benutzer im Hauptmenü die Option „Add Pet“ auswählt.

2. Das System zeigt die Liste der verfügbaren Haustierarten an.

3. Der Benutzer wählt den Typ „Cat“ aus.

4. Das System fordert den Benutzer auf, die relevanten Daten einzugeben:

    * Name der Katze

    * Alter

     * Rasse (Breed)

     * Information, ob die Katze eine Wohnungskatze ist (true/false)

5. Der Benutzer gibt alle Werte ein.

6. Das System erstellt ein neues Cat-Objekt mit den angegebenen Parametern.

7. Das System fügt das erzeugte Cat-Objekt der bestehenden Pet-Liste hinzu (pets.addPet(cat)).

8. Das System bestätigt, dass die Katze erfolgreich hinzugefügt wurde.

9. Der Use Case endet.

### Alternativer Ablauf:
1. A1: Ungültige Eingabe bei „indoor“

2. Der Benutzer gibt keinen gültigen boolean-Wert (true/false) ein.

3. Das System weist auf die ungültige Eingabe hin.

4. Der Benutzer wiederholt die Eingabe.

5. Danach geht der Ablauf normal weiter.

### Voraussetzungen (Preconditions):

* Das Programm läuft und der Benutzer befindet sich im Hauptmenü.

* Die Pet-Liste (Objekt pets) ist initialisiert.

### Nachbedingungen (Postconditions):

* Eine neue Katze existiert in der Pet-Liste.

* Die Eingabe wurde korrekt gespeichert.     