# Cél
A Program célja egy olyan webes felület létrehozása amit egy könyvtár tudna haszálni a könyvek kezelésére. Minden felhasználónak be kell majd jelentkeznie hogy tudja használni a rendszert különben nem fér hozzá semmihez. A alkalmazottak tudnak könyveket hozzá adni az adatbázishoz ,törölni ,módosítani és megjelölni a könyvet hogy az most éppen kiadható e vagy nincs bent a könyvtárban. 

# Teknológia 
A teknológia amin majd alapúl a webes oldalt az a Spring Boot lesz . A spring boot rengeteg tervezési minán alapúl ami miatt bele vagyunk kényszerítve azok használatába . Például hogy párat felsorolja collection, list , set stb GOF 1 es elveknek meg felelnek vagy példáúl a Bean egy Singletone tervezési mintán alapuló class . A teljesen framework megfelel a SOLID elveknek és ezek használata ezáltal elkerülhetetlen. 

## SOLID elvek 

### Singletonra 
A kódbeli meg valósitása látható a model/User illetve /book osztályban 
Részlet :

	@Entity
	@Getter @Setter @NoArgsConstructor
	public class User {
    	@Id
    	@GeneratedValue
    	Long id;
    	String email;
    	String username;
    	String password;
    	String Fname;
    	String Lname;
    	boolean admin;
    	....

### Open/Close
A kódbeli megvalósitás Controller/* interfészekben 
Kód részletek
	
	public interface UserRepository extends CrudRepository<User,String> {
    	User findByUsername(String username);
	}


### Likson helyettesítés
A kódbeli megvalósitás Securingweb/securty osztályokban 

	public class UserDetailService implements UserDetailsService {
    	@Autowired
    	private UserRepository userRepository;
    	@Override
    	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        	User user =userRepository.findByUsername(s);
        	if (user==null){
            	throw  new UsernameNotFoundException(s);
       	 	}
        	return (UserDetails) user;
    	}
	}

### Teljes dokumentációja a Spring Bootnak itt érhető el https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
# Hasznos olvasni valók
- Spring boot SOLID elvek https://www.baeldung.com/solid-principles

Vegyünk egyszerű példát Singletonra 


