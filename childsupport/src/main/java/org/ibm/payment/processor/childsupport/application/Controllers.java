//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/register")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new UserDTO());
//        return "register";
//    }
//
//    @PostMapping("/register")
//    public String registerUser(@ModelAttribute UserDTO userDTO) {
//        userService.registerUser(userDTO);
//        return "redirect:/login.html";
//    }
//
//    @GetMapping("/profile")
//    @PreAuthorize("isAuthenticated()")
//    public String viewProfile(Model model, Authentication authentication) {
//        User user = ((UserDetailsImpl) authentication.getPrincipal()).getUser();
//        model.addAttribute("user", user);
//        return "profile";
//    }
//}
//
//@Controller
//@RequestMapping("/cases")
//public class CaseController {
//    private final CaseService caseService;
//    private final UserService userService;
//
//    @Autowired
//    public CaseController(CaseService caseService, UserService userService) {
//        this.caseService = caseService;
//        this.userService = userService;
//    }
//
//    @GetMapping
//    public String listCases(Model model, Authentication authentication) {
//        User user = ((UserDetailsImpl) authentication.getPrincipal()).getUser();
//        List<Case> cases;
//
//        if (user.getRole() == User.UserRole.PAYER) {
//            cases = caseService.getCasesByPayer(user.getId());
//        } else if (user.getRole() == User.UserRole.PAYEE) {
//            cases = caseService.getCasesByPayee(user.getId());
//        } else {
//            // Admin can see all cases
//            cases = caseService.getAllCases();
//        }
//
//        model.addAttribute("cases", cases);
//        return "cases/list";
//    }
//
//    @GetMapping("/{id}")
//    public String viewCase(@PathVariable Long id, Model model) {
//        Case childSupportCase = caseService.getCaseById(id);
//        model.addAttribute("case", childSupportCase);
//        model.addAttribute("payments", paymentService.getPaymentsByCase(id));
//        return "cases/view";
//    }
//
//    @GetMapping("/create")
//    @PreAuthorize("hasRole('ADMIN')")
//    public String showCaseForm(Model model) {
//        model.addAttribute("caseDTO", new CaseDTO());
//        model.addAttribute("payers", userService.getUsersByRole(User.UserRole.PAYER));
//        model.addAttribute("payees", userService.getUsersByRole(User.UserRole.PAYEE));
//        return "cases/create";
//    }
//
//    @PostMapping("/create")
//    @PreAuthorize("hasRole('ADMIN')")
//    public String createCase(@ModelAttribute CaseDTO caseDTO) {
//        caseService.createCase(caseDTO);
//        return "redirect:/cases";
//    }
//}