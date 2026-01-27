# Portfolio
## 11.11

### Primitive Datentypen

Primitive Datentypen sind Datentypen, welche einen gegebenen Wert direkt in der Variable speichern.

Primitive Datentypen sind:
- int
- double
- float
- char
- boolean

### Referenztypen

Referenztypen sind Datentypen (Variabeln, Objekte) welche den Wert der Daten nicht direkt speichern, sondern auf einen anderen Typ referenziert. Also eigentlich speichert es den Speichertort, bzw. Adresse eines Objektes. (Speicher im Heap)

Referenztypen sind zum Beispiel:
- Klassen
- Arrays
- Interfaces


### Datenkapselung


Bei der Datenkapselung geht es dabei, Daten von "unkontrolliertem Zugriff" zu schützen.

Wie:
1. Variablen privat machen (private), sodass nur die Klasse selbst darauf zugreifen kann.
2. Getter- und Setter-Methoden bereitstellen (public), sodass man kontrollierten Zugriff von außen hat.



### Access Modifiers


| Modifier                    | Zugriff von:             | Beschreibung                                                                  |
| --------------------------- | ------------------------ | ----------------------------------------------------------------------------- |
|  private                    | Nur innerhalb der Klasse | Stellt sicher, dass niemand direkt von außen zugreifen kann                   |
|  default                    | Nur innerhalb des Pakets | Standardzugriff                                                               |
|  protected                  | Paket + Unterklassen     | Unterklassen oder Klassen im gleichen Paket dürfen zugreifen.                 |
|  public                     | Überall                  | Voller Zugriff                                                                |



## 17.11

- DRY
- Vererbung
- Interfaces

### DRY

- Don't repeat yourself
- DRY ist ein Prinzip, auf welches man sich auchten muss, um wiederholenden Code zu vermeiden.
- Statt mehrere Funktionen zu schreiben, die dasselbe tun, kann man es einfach in ein Funktion einbinden
- Wenn man dieselben Print Statements hat, soll man diese stattdessen in einer Funktion einbauen und diese aufrufen

Wieso:
- bessere Leslichkeit
- Vereinfachung
- Code verkleinern

### Vererbung

- Vererbung bedeutet, dass eine Klasse Eigenschaften und Methoden einer anderen Klasse übernimmt

Bsp:
- Man hat mehrere Klassen mit denselben Attributen und Methoden:
  - name, age, type
  - showInfo()
- Statt alle Klassen normal zu definieren und sich dadurch zu wiedeholen, kann man die geteilten Attribute und Methoden "auslagern" und in einer Superklasse definieren
- Die Subklassen, also Klassen, diese Attribute benötigen, erben von der Superklasse. Falls sie weitere Attribute besitzen (legs, bark), kann man diese in den Subklassen zu den geerbten Attributen anfüpgen.
- Wenn man die selben Methoden in der Subklasse besitzt, sie jedoch etwas anderes ausgeben sollen, zB alle Attribute ausgeben, auch die die nicht in der Superklasse sind, kann man diese überschreiben

- Erben: extends
- Von Superklasse übernehmen: super

### Interfaces

- Interfaces sind wie Vorgaben, welche andere Klassen implementieren können
- Sie definieren bestimmte Methoden, welche die implementierenden Klassen benutzten müssen
- Die vordefinierten Methoden erthalten keine Logik, diese müssen die implementierenden Klassen selbst schreiben
- => Beschreibt was ein Objekt machen soll, aber nicht wie
- Wie? mit implements

Wofür:
- Vereinheitlichung
- ermöglicht Polymorphismus

## 25.11


### Override
Bei der Vererbung, können Subklassen (die, die erben), MEthoden der Superklasse übernehmen, aber auch überschreiben. Mit dem Überschreiben können sie Logik verändern, die Methoden erweitern oder komplett ersetzen.

Dafür nutzt man die Annotation @Override überhalb der Methode


### Overload

Overloading bedeuted, mehrere gleichnamige Methoden innerhalb einer Klasse zu erstellen/definieren/nutzen.

- Normalerweise würde sich die IDE beschweren, wenn man mehrere gleichnamige Methoden besitzt. Beim Overloading is aber der Unterschied, dass die Methode nicht 1:1 kopiert wird. Die gleichnamigen Methoden haben alle unterschidliche Typen, PArameter usw.
- Bsp: add(int a), add(int a, int b) => zwei gleichnamige Methoden, aber mit unterschiedlich vielen Parametern


### Polymorphismus

Poly = verschiedene, viele
Morphs = Formen, Gestalten

- Polymorphismus = Vielgestaltigkeit
- => Objekte können in verschiedenen Formen auftreten
- => Methoden mit demselben Namen, können mit anderen Parametern oder Implementierungen aufgerufen werden



## 2.12

### Assoziationen

- Assoziation = Beziehung zwischen Klassen
- Beschreibt, welche Klasse mit welcher kommuniziert
- Es gibt sogenannte HAT- und IST-Beziehungen
- HAT-Beziehung => 2 Objekte kennen sich, existieren aber unabhängig voneinander
- Bsp: Kunde hat einen Account
- Beziehungen: unidirektional, bidirektional


#### Aggregation
- Aggregation = Sonderform der Assoziation zwischen 2 Klassen
- HAT-Beziehung vorhanden
- festere Beziehungen zwischen Objekten
- 2 Objekte können aber ohne einander existeren
- Bsp: Ein Buchregal hat Bücher
  - Beides kann ohne einander existieren

Dastellung:
Buchregal ◇----- Buch


#### Komposition

- Komposition = Sonderform der Assoziation
- "Besteht aus"-Beziehung
- Objekte/Teilobjekte existieren nur solange das Ganze existiert
- Bsp: Baum und Blätter -> Ohne den Baum existieren die Blätter nicht

Darstellung:
Baum ◆----- Blätter


## 9.12


### JavaDoc

- JavaDoc ist ein Software-Dokumentationswerkzeug. Es erstellt aus Java-Quellenexten automatische HTML-Dokumentationen.
- Man kann professionelle Dokumentationen mit einer einfacher Struktur erstellen, welche andere Personen gut und verständlich lesen können. Somit ist es eine einfache Art und Weise, seinen Code zu dokumentieren, sodass es für alle verstädlich ist.

#### JavaDoc Comments

Syntax:
````
/**
 * Comment
 */
````

Struktur:
- Normalerweise beinhaltet ein JavaDoc Comment:
  - Description: Kurze Beschreibung
  - Block tags: Bestimmte Tags, welche eine DOkumentation enthalten und welche man über den Hover sehen kann. Dieese kann man mit Java auch selber erstellen. (@param, @return, @author ...)

Man kann eine JavaDoc auch selber generieren:
- JavaDoc generieren:
  - ```` javadoc file_name.java ```` oder für ein Package: ```` javadoc package_name ````

Nützliche Tags:
- @author
- @exception
- @version
- @param
- @return

## 16.12

### Collections & Algorthms

#### Map Classes

-> Eine Map lagert sogenannte Key-Value Paare. Dabei gehört jedes Key zu seinem Value.

Welche Maps gibt es:
- HashMap
- TreeMap
- LinkedHashMao

Wichtig: Jeder Key muss eindeutig sein und darf nicht mehrfach vorhanden sein, da der Value sonst überschrieben wird.

#### Algorithms

Es gibt verschiedene Algorithmen, um diese Map Classes zu benutzen.

Man kann:
- Den Value mit dem Key finden
- Word Count erstellen
- Nach key oder value sortieren

#### Stack Classes

Es existieren auch sogenannte Stack Classes mit einem Last in, Firtst Out Prinzip. Das bedeuted, dass das letzte was hinzugefügt wurde, als erstes wieder entfernt wird. Funktionen dafür sind:
- push() -> hinzufügen
- pop() -> entfernen
- peek() -> letzes hinzugefügt Element anschauen

-> Man kann auch hier Algorithmen gebrauchen, wenn man zum Beispiel einen String umdrehen möchte.


## 06.01

### Generics

Problem ohne Generics:
- Java weiss nicht, welche Typen erlaubt sind. Kann man ein Int oder einen Strign in die Funktion mtgeben?
- z.B.: liste.add("Max) und liste.add(8) -> wird erlaubt, obwohl es logisch falsch ist
- Was aber später Probleme gibt ist, wenn man die Werte der Liste erhalten will und man dabei Java sagt: Es wird ein String sein. Wenn man dann aber einen int erhalten würde, kommt es zu einem Programmabsturz -> ClassCastException

Lösung:
- Generics
- Man bestimmt einen Typen, wenn man die Funktion initialisiert
- z.B. Liste<String> liste = ArrayList<>();
- Hier: Man kann keine Int mehr in die Liste einfügen mit der add-Funktion, da der Compiler einen stoppen wird
  - Es kommt nicht mehr zum Absturz, da Java einen davor schon stoppt



## 13.01

### Design Patterns

Design Patterns = wiederverwendbare Lösungsansätze für typische Designprobleme im Code

=> Design Patterns vereinfachen das Programmieren stark, da man vieles vereinheitlichen und wiederverwendbar machen kann. So zum Beispiel erstellt nicht jeder seine eigene Version einer z.B. Klasse, sondern jeder erstellt sie etwa gleich.

Drei Hauptkategorien:
- Creational Patterns (Objekterzeugung)
  - Singleton: genau ein Instanz wird erzeugt
  - Factory Method: Erzeugung der Instanzen wird ausgelagert
  - Abstract Factory: zusammengehörige Objekte erzeugen. Oft bei GUI verwendet
  - Builder: komplexe Objekte schrittweise erzeugen
- Structural Patterns (Struktur)
  - Adapter: macht Klassen kompatibel, z.B. alte Klasse an neues Interface anpassen
  - Decorator: erweitert Verhalten ohne Vererbung
  - Facade: einfache Oberfläche für komplexe Logik
  - Composite: Baumstruktur -> Ordnerstruktur
- Behavioral Patterns (Verhalten)
  - Observer: Benachrichtigung bei Änderungen, bei z.B Events, Listener, GUI
  - Strategy: austauschbare Algorithmen
  - Command: Aktion als Objekt
  - State: Verhalten abhängig vom Zustand


## 20.01

### Clean Code

Clean Code = Code so einfach und verstädnlich wie nur möglich zu halten

Wieso? -> Damit der Code von jedem verstanden werden kann. 

#### Naming conventions

-> Name soll zeigen, wofür die erstellte Variable, Funktion oder Klasse zuständig ist

#### Hard Coding

-> So wenig wie möglich Hard Codieren. Statt Konstanten immer wieder neu definieren, sollte man sie stattdessen als Enums lagern. So vermindert man Duplikate oder Fehler bei Anpassungen


#### Kommentarer

=> JavaDoc


#### Klassen

-> Klassen sollen so "klein" wie nur möglich seiin. Das bedeuted, dass Klassen je nur eine Verantwortung wahrnehmen sollen. => SRP (Single Responsobility Principle)


#### Methoden

-> Ebenso wie Klassen, sollen Methoden so klein wie möglich gehalten werden. Braucht man 2 Verhalten, so kann man diese in 2 Methoden auslagern





