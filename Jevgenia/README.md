# Portfolio
# 11.11

## Was habe ich gelernt?

Themen:
- [Primitive Datentypen](https://github.com/hacker5ele/Modul320/blob/main/Jevgenia/README.md#primitive-datentypen)
- [Referenztypen](https://github.com/hacker5ele/Modul320/blob/main/Jevgenia/README.md#referenztypen)
- [Datenkapselung](https://github.com/hacker5ele/Modul320/blob/main/Jevgenia/README.md#datenkapselung)
- [Access modifiers](https://github.com/hacker5ele/Modul320/blob/main/Jevgenia/README.md#access-modifiers)

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


| Modifier                    | Zugriff von…             | Beschreibung                                                                  |
| --------------------------- | ------------------------ | ----------------------------------------------------------------------------- |
| `private`                   | Nur innerhalb der Klasse | Stellt sicher, dass niemand direkt von außen zugreifen kann                   |
| `default`                   | Nur innerhalb des Pakets | Standardzugriff                                                               |
| `protected`                 | Paket + Unterklassen     | Unterklassen oder Klassen im gleichen Paket dürfen zugreifen.                 |
| `public`                    | Überall                  | Voller Zugriff                                                                |



## 17.11

- DRY
- Vererbung
- Interfaces



