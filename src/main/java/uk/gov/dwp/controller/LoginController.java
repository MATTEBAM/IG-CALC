package uk.gov.dwp.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.gov.dwp.model.User;

/**
 * Handles requests for the application login/logout
 * 
 * @author samba.mitra
 */
@Controller
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
    public String showLogin(Model model, HttpSession session) {
        if (session.getAttribute("user") != null) {
            LOGGER.info("Already logged in.. redirecting to home");
            return "redirect:/admin/home";
        }
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/admin/home", method = RequestMethod.GET)
    public String showHome() {
        return "home";
    }
}
