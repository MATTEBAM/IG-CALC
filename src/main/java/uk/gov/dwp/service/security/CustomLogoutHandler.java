package uk.gov.dwp.service.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * Defines action on successful logout from the application
 * 
 * @author samba.mitra
 *
 */
@Component
public class CustomLogoutHandler extends SimpleUrlLogoutSuccessHandler implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {

        if (authentication != null && !(authentication instanceof AnonymousAuthenticationToken)) {
            new SecurityContextLogoutHandler().logout(request, response, authentication);
        }

        setDefaultTargetUrl("/login?logout");
        super.onLogoutSuccess(request, response, authentication);

    }

}
