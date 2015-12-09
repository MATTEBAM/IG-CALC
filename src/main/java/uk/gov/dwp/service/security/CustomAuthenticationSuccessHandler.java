package uk.gov.dwp.service.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import uk.gov.dwp.model.SecureUserDetails;

/**
 * Authentication success handler defines action when successfully authenticated
 * 
 * @author samba.mitra
 *
 */
@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomAuthenticationSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {

        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null && authentication != null
                && !(authentication instanceof AnonymousAuthenticationToken)) {
            SecureUserDetails user = (SecureUserDetails) authentication.getPrincipal();
            LOGGER.info("Setting the authenticated user in session...");
            session.setAttribute("user", user);
        }

        // set our response to OK status
        response.setStatus(HttpServletResponse.SC_OK);
        response.sendRedirect("admin/home");
    }

}
