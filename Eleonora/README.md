# Modul320

## 11.11.2025
**Was habe ich gemacht?**
<br>
Heute habe ich Java repetiert. Dies war für die Kompetenz Q1 nötig. Ich habe den ganzen Dokument durchgelesen. Danach habe ich mit Jevgenia entschieden was für ein Programm wir machen möchten. Wir entschieden uns für einen Notenrechner. Dort haben wir 3 verschiedene Klassen, eine Main (zum Starten), eine Subject und eine Grade Klasse. Wir haben die Arbeit aufgeteilt. Danach mussten wir es zeigen und zum Schluss einen Test machen. Diesen habe ich bestanden.

**Was habe ich gelernt/ repetiert?**

*Prozedurales Programmieren*

Ein Programmierparadigma, bei dem der Fokus auf Abläufen und Funktionen liegt. Der Code wird Schritt für Schritt ausgeführt, meist ohne komplexe Datenstrukturen oder Objekte.

---
*Objektorientierte Programmierung (OOP)*

Ein Ansatz, bei dem Programme aus Objekten bestehen. Diese kombinieren Daten (Attribute) und Verhalten (Methoden) und machen Code übersichtlicher, modularer und leichter wartbar.

---
*Klassen*

Eine Bauvorlage für Objekte. Sie definiert, welche Attribute und Methoden ein Objekt besitzt.

---
*Attribute*

Eigenschaften eines Objekts, die seinen Zustand beschreiben, z. B. Name, Alter oder Farbe.

---
*Konstruktor*

Eine spezielle Methode, die beim Erzeugen eines Objekts aufgerufen wird. Sie dient dazu, Attribute mit Startwerten zu initialisieren.

---
*Getter & Setter*

Methoden zum Lesen (Getter) und Ändern (Setter) von Attributen. Sie ermöglichen kontrollierten Zugriff auf Objektwerte.

---
*Zustände eines Objekts ändern*

Der Zustand eines Objekts wird verändert, indem Attribute über Methoden (z. B. Setter) angepasst werden.

---
*Unterschied zwischen primitiven Datentypen und Referenztypen*

Primitive Datentypen speichern direkte Werte (z. B. int, boolean).
Referenztypen speichern Verweise auf Objekte (z. B. Klassen, Arrays, Strings).

---
*Kontrollstrukturen*

Steuern den Ablauf eines Programms, z. B. durch Bedingungen (if/else) oder Schleifen (for, while).

---

*Konstanten, Variablen und Datentypen*

* Variablen speichern veränderbare Werte

* Konstanten speichern feste Werte

* Datentypen legen fest, welche Art von Daten gespeichert werden kann

## 18.11.2025
**Was habe ich gemacht?**
<br>
Heuet habe ich die Kompetenz V1, D1 und M1 erledigt

**Was habe ich gelernt/ repetiert?**

*Vererbung*

Ein OOP-Konzept, bei dem eine Klasse Eigenschaften und Methoden einer anderen Klasse **übernimmt**. Fördert Wiederverwendbarkeit und Struktur.

*Superklassen und Sub-Klassen*

* **Superklasse**: die übergeordnete Klasse
* **Sub-Klasse**: erbt von der Superklasse und kann sie erweitern oder anpassen

*Keyword `super`*

Wird verwendet, um auf **Konstruktoren, Methoden oder Attribute der Superklasse** zuzugreifen.

---

*Unterschied zwischen ArrayList, Set und Map*

* **ArrayList**: geordnete Liste, **Duplikate erlaubt**
* **Set**: ungeordnete Sammlung, **keine Duplikate**
* **Map**: speichert **Schlüssel-Wert-Paare**, Schlüssel sind eindeutig

---

*Interface `Comparable`*

Ermöglicht das **Vergleichen von Objekten** einer Klasse, um sie z. B. zu sortieren. Die Vergleichslogik liegt in der Klasse selbst.

*Interface `Iterator`*

Erlaubt das **Durchlaufen von Collections**, Element für Element, unabhängig von der konkreten Datenstruktur.

*Unterschied zwischen `Comparable` und `Comparator`*

* **Comparable**: Vergleichslogik ist **in der Klasse** definiert
* **Comparator**: Vergleichslogik ist **extern**, z. B. für mehrere Sortierarten

---

*Unterschied zwischen Vector und ArrayList*

* **Vector**: synchronisiert, daher **thread-sicher**, aber langsamer
* **ArrayList**: nicht synchronisiert, **schneller**, häufiger verwendet

---

*Datenkapselung*

Schützt interne Daten eines Objekts, indem Attribute **privat** gehalten und nur über **Getter und Setter** zugänglich gemacht werden.

### **Unterschied zwischen einem primitiven und komplexen Datentyp**

* **Primitiv**: speichert einfache Werte (z. B. int, double)
* **Komplex**: speichert Objekte mit mehreren Eigenschaften und Methoden

---

*Klassendiagramm*

Grafische Darstellung von Klassen, ihren Attributen, Methoden und Beziehungen.

*Beziehungen*

* **Vererbung**: „ist-ein“ Beziehung
* **Assoziation**: Klassen kennen sich
* **Aggregation**: lockere „besteht-aus“ Beziehung
* **Komposition**: starke „besteht-aus“ Beziehung



## 25.11.2025
**Was habe ich gemacht?** 
<br>
Ich habe die Kompetenz V2 erledigt.

**Was habe ich gelernt/repetiert?**

*Vererbung*

Eine Subklasse übernimmt Eigenschaften und Methoden einer Superklasse und kann diese erweitern oder verändern.

*Überschreiben von Methoden*

Eine Subklasse implementiert eine Methode der Superklasse **neu**, um ihr eigenes Verhalten festzulegen.

---
*Überladen von Methoden*

Mehrere Methoden mit **gleichem Namen**, aber **unterschiedlichen Parametern** (Anzahl oder Typ).

---
*Überladen von Konstruktoren*

Eine Klasse besitzt mehrere Konstruktoren mit unterschiedlichen Parameterlisten, um Objekte **flexibel zu erzeugen**.

---

*Polymorphismus*

Objekte unterschiedlicher Klassen können über den **gleichen Methodennamen** unterschiedlich reagieren, abhängig vom tatsächlichen Objekttyp.

---
*Aufruf von überschriebenen Methoden*

Wird eine Methode über eine Referenz der Superklasse aufgerufen, entscheidet der **Objekttyp zur Laufzeit**, welche Methode ausgeführt wird.

---
*Dynamic Binding*

Die Zuordnung, welche Methode ausgeführt wird, erfolgt **erst zur Laufzeit** und nicht beim Kompilieren.

---

*Type Casting*

Umwandlung eines Datentyps in einen anderen:

* **Upcasting**: Subklasse → Superklasse (automatisch)
* **Downcasting**: Superklasse → Subklasse (manuell, mit Prüfung)

*Reihenfolge des Konstruktoren-Aufrufs*

Zuerst wird der **Konstruktor der Superklasse**, danach der der **Subklasse** ausgeführt.

---

*Unterschied zwischen Überladen und Überschreiben*

* **Überladen**: gleicher Methodenname, **verschiedene Parameter**, gleiche Klasse
* **Überschreiben**: gleiche Signatur, **neue Implementierung** in der Subklasse



## 02.12.2025
**Was habe ich heute gemacht?**
<br>
Heute habe ich Kompetenz M2 erledigt.

**Was habe ich gelernt/repetiert?**

## 02.12.2025
**Was habe ich heute gemacht?**
<br>
D2 angefangen

**Was habe ich gelernt/repetiert?**
*Assoziationen*

Eine Assoziation beschreibt eine Beziehung zwischen zwei Klassen, die unabhängig voneinander existieren können. Sie zeigt, dass Objekte miteinander in Verbindung stehen, ohne dass eines zwingend vom anderen abhängt.

**Beispiel:**
Eine Klasse Student ist mit der Klasse Kurs assoziiert – ein Student besucht einen Kurs.

**Merkmale:**

* Keine Besitzbeziehung

* Lebenszyklen der Objekte sind unabhängig

* Kann einseitig oder beidseitig sein

* Häufig in Klassendiagrammen dargestellt

## 09.12.2025
**Was habe ich heute gemacht?**
<br>
Q2, D2 fertig 

**Was habe ich gelernt/repetiert?**

*JavaDoc Dokumentation*

JavaDoc ist ein Dokumentationsstandard in Java, mit dem Klassen, Methoden und Attribute direkt im Code beschrieben werden. Aus speziellen Kommentaren kann automatisch eine HTML-Dokumentation erzeugt werden.

**Merkmale:**

* Verwendung von /** ... */ Kommentaren

* Beschreibt Zweck, Parameter und Rückgabewerte

* Erleichtert Wartung, Zusammenarbeit und Verständnis des Codes

* Standard in professionellen Java-Projekten

**Wichtige JavaDoc-Tags**

* @param – beschreibt einen Methodenparameter

* @return – beschreibt den Rückgabewert

* @author – Name der Autorin / des Autors

* @version – Versionsnummer der Klasse

* @since – seit welcher Version vorhanden

* @throws – mögliche Exceptions

## 16.12.2025
**Was habe ich heute gemacht?**
<br>
V3

**Was habe ich gelernt/repetiert?**
*Collections Framework*

The Collections Framework is a set of interfaces and classes that make it easy to store, access, and manipulate groups of objects.

**Key Interfaces**

* **List** – ordered, allows duplicates.

    * `ArrayList`, `LinkedList`, `Vector`

* **Set** – unordered, no duplicates.

    * `HashSet`, `LinkedHashSet`, `TreeSet`

* **Queue** – for FIFO structures.

    * `PriorityQueue`, `LinkedList`

* **Map** – key-value pairs.

    * `HashMap`, `TreeMap`, `LinkedHashMap`

---

*Algorithms*

The Collections class has ready-to-use algorithms for manipulating collections.

**Some common methods**

* `Collections.sort(list)` – sort a list

* `Collections.reverse(list)` – reverse a list

* `Collections.shuffle(list)` – shuffle elements randomly

* `Collections.max(list)` / `Collections.min(list)` – find max/min

* `Collections.frequency(list, element)` – count occurrences


## 06.01.2026
**Was habe ich heute gemacht?**
<br>
Für Projekt Brainstormed, M3 & Q3 angefangen

**Was habe ich gelernt/repetiert?**
*Generics*

Generics ermöglichen es, Klassen, Schnittstellen oder Methoden so zu schreiben, dass sie mit verschiedenen Datentypen arbeiten können, ohne den Code mehrfach schreiben zu müssen. Sie sorgen für Typensicherheit zur Compile-Zeit und vermeiden Casting.

**Merkmale:**

* Typ wird dynamisch bei Verwendung festgelegt

* Häufig bei Collections wie ArrayList<T> oder Map<K,V>

* Verhindert Laufzeitfehler durch falsche Typen

## 13.01.2026
**Was habe ich heute gemacht?**
<br>
Am Projekt gearbeitet

**Was habe ich gelernt/repetiert?**
*Design Patterns*

Design Patterns sind bewährte Lösungsstrategien für wiederkehrende Software-Probleme. Sie helfen, Code strukturiert, wartbar und flexibel zu gestalten.

**Kategorien:**

1. Erzeugungsmuster (Creational) – steuern die Objekterzeugung (z. B. Singleton, Factory)

2. Strukturmuster (Structural) – beschreiben Klassen- oder Objektstrukturen (z. B. Adapter, Decorator)

3. Verhaltensmuster (Behavioral) – definieren Interaktionen zwischen Objekten (z. B. Observer, Strategy)

---

*Delegation*

Delegation ist ein Prinzip in der OOP, bei dem ein Objekt Aufgaben an ein anderes Objekt weitergibt, anstatt sie selbst zu implementieren.
Hilft, Code wiederzuverwenden und Verantwortlichkeiten klar zu trennen.

## 20.01.2026
**Was habe ich heute gemacht?**
<br>
Projekt feingeschlifen, Prüfung gemacht

**Was habe ich gelernt/repetiert?**
Alles (wegen der Prüfung)

## 27.01.2026
**Was habe ich heute gemacht?**
<br>
Portfolio fertig geschrieben, Projekt gezeigt und kleine Anpassungen am Projekt gemacht

**Was habe ich gelernt/repetiert?**
UMLs, Exceptions und JavaDocs repetiert