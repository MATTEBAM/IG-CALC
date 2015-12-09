package uk.gov.dwp.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import uk.gov.dwp.dataaccess.UserRepository;
import uk.gov.dwp.model.SecureUserDetails;
import uk.gov.dwp.model.User;

/**
 * Fetches the user details from the database
 * 
 * @author samba.mitra
 *
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        SecureUserDetails userDetails = null;
        if (user == null) {
            throw new UsernameNotFoundException(username);
        } else {
            userDetails = new SecureUserDetails(user);
        }
        return userDetails;
    }

}
