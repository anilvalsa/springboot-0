Attributes / var
operators   
fun / methods
visibilty modifiers
access modifiers      scope
recursion
constructors
encapsulation
type casting
loops -> while , do while , for
argument , parameters
keywords 


class ,  abstract class , interface  , enumeration 
abstraction
inner class
polymorphism
exception handling     try , catch , finally


inheritance    single , multipe , multi level , hirachiecal  , hybrid


mutable , immutable   , memery instatiated , heap & stack memory
method overloading
method overriding

Compile-time polymorphism.           static  | dynamic
Runtime polymorphism.



maven , gradle build tools

spring , spring boot , hibernate 
http header , url , athetication , authorization , 
json token   , json obj  ,xml
plugin 
standalone , non standlone

embedded server (tomcat , jetty), externall server
depedency injection 
spring boot annotations
events and ports
spring boot dependecies.          pom.xml
Servlet API
Spring MVC
    .jsp files for views  in standalone application.
application.properties


HTTP req codes
CRUD               create     re | update | delete
                            get | get All  | put | delete









------------------------------------ spring boot annotations -----------------------------------------------
       @RestController
	    @GetMapping("/users")
	    @GetMapping("/users/{id}")
			@pathVariable("id")
		@PostMapping("users")
			@RequestBody
		@DeleteMapping("/users/{id}")
			@PathVariable("id")
		@PutMapping
			@RequestBody
    
    @Controller
    @RequestMapping(Value="/users" , methood=RequestMethood.GET )
    @ResponceBody	
			
	-------TO send the Responce --------
	
	ResponceEntity<List<user>>
	ResponseEntity.status(HttpStatus.).build();
	
	//if list is empty..
	ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	


	 @RestController
	 @Autowired   // can applies to constructors settersMethoods fields..
	 @Service    // applies to the class
	 @Repository
	 @Componant
	 @Bean(name=" ")  //by default it will NameOfMethood.
		  (name={" " ," ", " " )  //can also provide multiple names
	 @Query(" ") // to provide the custom query.	

	 @SpringBootApplication                       // in main start of progrm ...which makes all config related to app
			@Bean
			@autoConfiguration
			@componantScanning
	 @SpringBootConfiguration
	 @EnableAutoConfiguration
     @Configuration   // for java configuration file ...instead of xml file..
       @ComponantScan(basePackages=" ")    //provide full location
	   
      @Componant 
      @value(" #( )	" )
     @Scope("prototype")
	 
	
	   //from lombok
	   @Data
	   @AllArgsConstructor
	   @NoArgsConstructor
	   
	@Entity
	@Table(name"name_of_table")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
			 @GeneratedValue(generator = "system-uuid")
			 @GenericGenerator(name="system-uuid",strategy = "uuid")
	@column(name="")
		   (lenth=100 , name= " ")
	
	@OneToOne(MappedBy="fieldName")
	@OneToOne(cascade=CascadeType.ALL)
	@OneToMany()
	@ManyTOMany()
	
	@JsonManagedReference
	@JsonBackReference
	
	@Transanctional   //when you need write or update ..bcoz default is read only
	@Temporal(TemporalType.DATE)   //format the date obj to save in DB
    @Embeddable  //filed of one clas can embeddable to another class
    @JoinColumn(name= " a_id")	
	
	@Cacheable
	   @Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
	   
	   
	   
	   
	   
	   
	   
	@EnableWebSecurity
    @EnableGlobalMethodSecurity(prePostEnabled = true) 
    @Value("${jwt.secret}")	
	   
	   
	   
	   
	   
	   
	   
	   
	   
