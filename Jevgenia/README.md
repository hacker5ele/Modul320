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












