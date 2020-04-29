# Cél
A Program célja egy olyan webes felület létrehozása amit egy könyvtár tudna haszálni a könyvek kezelésére. Minden felhasználónak be kell majd jelentkeznie hogy tudja használni a rendszert különben nem fér hozzá semmihez. A alkalmazottak tudnak könyveket hozzá adni az adatbázishoz ,törölni ,módosítani és megjelölni a könyvet hogy az most éppen kiadható e vagy nincs bent a könyvtárban. 

# Teknológia 
A teknológia amin majd alapúl a webes oldalt az a Spring Boot lesz . A spring boot rengeteg tervezési minán alapúl ami miatt bele vagyunk kényszerítve azok használatába . Például hogy párat felsorolja collection, list , set stb GOF 1 es elveknek meg felelnek vagy példáúl a Bean egy Singletone tervezési mintán alapuló class . A teljesen framework megfelel a SOLID elveknek és ezek használata ezáltal elkerülhetetlen. 

## SOLID elvek 

### Vegyünk egyszerű példát Singletonra 
	public class Book {
    	private String name;
    	private String author;
    	private String text;
		/*
		Constructor
		Get
		Set
		*/
	}
Itt tároljuk a könyv példányunk nevét ,szerzőjét és tartalmát.
Irjunk pár módszert  aszöveg lekérdezésére.

	public class Book {
    	private String name;
    	private String author;
    	private String text;
		/*
		Constructor
		Get
		Set
		*/
    	public String replaceWordInText(String word){
        	return text.replaceAll(word, text);
    	}
    	public boolean isWordInText(String word){
        	return text.contains(word);
    	}
	}
Most a Book  osztályunk jól működik, és annyi könyvet tárolhatunk, amennyit csak akarunk alkalmazásunkban. 
De mi a haszna hogy tároljuk a könyv tartalmát ha nem tudjuk kiíratni ?
Ígyhát adjunk hozzá egy kiíratási módszert!

	public class Book {
    	void printTextToConsole(){
        	// A kódunk ami kírja a könyv tartalmát szépen formázva
    	}
	}
Ez a modszer viszont meg sérti a Singletone elvét. Ezért a kiíratást egy külön osztályban kellene meg valósitanunk , ami csak a szöveg kiíratással foglakozik.

	public class BookPrinter {
    	void printTextToConsole(String text){
        	// A kódunk ami kírja a könyv tartalmát szépen formázva
    	}
    	void printTextToAnotherMedia(String text){
    		// A kódunk ami valahova máshova kírja a könyv tartalmát 
    	}
	}
Fantasztikus. Nemcsak olyan osztályt valósitotunk meg, amely megkönnyíti a  Könyv tartalmányak kiíratását, hanem arra is allkalmas a  BookPrinter  osztályunkat, hogy szöveget más hova is továbbítsunk.

### Open/Close

Most itt az ideje az „O” -nak - hivatalosabban nevezik a nyitott-zárt elvnek megértésére. Egyszerűen fogalmazva: az osztályoknak nyitva kell állniuk a kiterjesztéshez, de a módosításokhoz zárva kell lenniük. Ezzel megakadályozuk magunkat a meglévő kód módosításától és potenciális új hibák előidézését egy egyébként TÖKÉLETES alkalmazásban.
Természetesen a szabály alóli kivételet képez a hibák javítása a kódban.
Vizsgáljuk meg tovább a koncepciót egy gyors kódpéldával. Képzeljünk el egy új projekt részeként egy  gitárosztályt  .
Teljes értékű, és még egy hangerőszabályzóval is rendelkezik:

	public class Guitar {
		private String make;
		private String model;
	private int volume;
    /*
		Constructor
		Get
		Set
		*/
	}
Elindítjuk az alkalmazást, és mindenki imádja. Néhány hónap múlva úgy döntünk, hogy a  gitár  kicsit unalmas, és egy fantasztikus lángmintával ellátott gitárt akarunk, hogy egy kissé 'rock and roll' -osan nézzen ki.
Ezen a ponton csábító lehet, hogy csak megnyitja a  gitárosztályt  és hozzáad egy lángmintát - de ki tudja, milyen hibákat okozhat alkalmazásunk.
Helyette inkább alkalmazuk a nyitott zárt elvet és egyszerűen kiterjesztjük  Guitar  osztály :

	public class SuperCoolGuitarWithFlames extends Guitar {
    	private String flameColor;
    /*
		Constructor
		Get
		Set
		*/
	}
Kiterjesztve a  Guitar  osztály biztosak lehetünk abban, hogy a már meglévő alkalmazás nem fogja érinteni.


### Teljes dokumentációja a Spring Bootnak itt érhető el https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
# Hasznos olvasni valók
- Spring boot SOLID elvek https://www.baeldung.com/solid-principles

Vegyünk egyszerű példát Singletonra 


