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

Itt kapcsolodik az adatbázishoz a spring boot 

### Open/Close
A kódbeli megvalósitás dao/* interfészekben 
Kód részlet:
	
	public interface UserRepository extends CrudRepository<User,String> {
    	User findByUsername(String username);
	}

Kibővitjuk a CrudRepository egy findbyusername el ami alapján majd ugye meg tudjuk keresni a felhasználót a neve alapján

### Likson helyettesítés
A kódbeli megvalósitás Securingweb/securty osztályokban 
Kód részlet:

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

### Dependency
A kódbeli megvalósitás Controller/RegistrationController osztályokban 
Kód részlet:

	public class RegistrationController {
    	private RegistrationService registrationService;
    	public RegistrationController(RegistrationService registrationService){
        	this.registrationService=registrationService;
    	}
    	......

Itt létrehozunk egy privát registrationService amit csak az osztályon belül tudunk kezelni és ennek létrehozunkegy konstruktort amin keresztül tudjuk állítani .

## Unit tesztek 
Az összes unit teszt a src/main/java/hu.vlngfw.Testing-ben található. 

### AppTest 

	@SpringBootTest
	public class AppTest {
	    @Test
	    public void contextLoads(){
    		}
	}
### HttpRequestTest 

Itt a Http kapcsolatot testzeltem 

	@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
	public class HttpRequestTest {
    	@LocalServerPort
    	private  int port;
    	@Autowired
    	private TestRestTemplate restTemplate;
    	@Test
    	public void greetingShouldReturnDefaultMessage() throws Exception {
        	assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
        	        String.class)).contains("Hello, World");
    	}
	}


### Teljes dokumentációja a Spring Bootnak itt érhető el https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
# Hasznos olvasni valók
- Spring boot SOLID elvek https://www.baeldung.com/solid-principles
s

