//package br.ufscar.dc.dsw.locadora.locadora.controller;
//
//import br.ufscar.dc.dsw.domain.Locadora;
//import br.ufscar.dc.dsw.service.spec.ILocadoraService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import jakarta.validation.Valid;
//
//@Controller
//@RequestMapping("/locadoras")
//public class LocadoraController {
//
//
//  @Autowired
//  private ILocadoraService service;
//
//  @Autowired
//  private BCryptPasswordEncoder encoder;
//
//
//  @GetMapping("/cadastrar")
//  public String cadastrar(Locadora locadora) {
//    return "locadora/cadastro";
//  }
//
//  @GetMapping("/listar")
//  public String listar(ModelMap model) {
//    model.addAttribute("locadoras", service.buscarTodos());
//    return "locadora/lista";
//  }
//
//  @PostMapping("/salvar")
//  public String salvar(@Valid Locadora locadora, BindingResult result, RedirectAttributes attr) {
//
//    if (result.hasErrors()) {
//      return "locadora/cadastro";
//    }
//
//    locadora.setPassword(encoder.encode(locadora.getPassword()));
//    service.salvar(locadora);
//    attr.addFlashAttribute("sucess", "locadora.create.sucess");
//
//
//    return "redirect:/locadoras/listar";
//  }
//
//  @GetMapping("/editar/{id}")
//  public String preEditar(@PathVariable("id") Long id, ModelMap model) {
//    model.addAttribute("locadora", service.buscarPorId(id));
//    return "locadora/cadastro";
//  }
//
//  @PostMapping("/editar")
//  public String editar(@Valid Locadora locadora, BindingResult result, RedirectAttributes attr) {
//
//
//    // Apenas rejeita se o problema não for com o CNPJ, EMAIL ou USERNAME (Read-onlys)
//    if (result.getFieldErrorCount() > 3
//        || result.getFieldError("cnpj") == null
//        || result.getFieldError("email") == null
//        || result.getFieldError("username") == null) {
//      return "locadora/cadastro";
//    }
//    service.salvar(locadora);
//    attr.addFlashAttribute("sucess", "locadora.edit.sucess");
//    return "redirect:/locadoras/listar";
//  }
//
//  @GetMapping("/excluir/{id}")
//  public String excluir(@PathVariable("id") Long id, ModelMap model) {
////		if (service.locadoraTemLocacoes(id)) {
////			model.addAttribute("fail", "locadora.delete.fail");
////		} else {
//    service.excluir(id);
//    model.addAttribute("sucess", "locadora.delete.sucess");
//    return listar(model);
//  }
//}
