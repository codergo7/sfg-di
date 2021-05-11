package comcom.go.springdi.pets;

import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    /**
     *no need @Autowired
     */
    //@Autowired
    public PetController(/*@Qualifier("i18nEnglishGreetingService")*/ PetService petService) {
        this.petService = petService;
    }

    public String getPetType(){
        return petService.getPetType();
    }
}
