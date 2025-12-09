# Portfolio
# 11.11

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
