package uk.gov.dwp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Represents the authenticated user details
 * 
 * @author samba.mitra
 *
 */
public class SecureUserDetails implements UserDetails {

    /**
     * 
     */
    private static final long serialVersionUID = 5740177709129105930L;

    private User user;

    public SecureUserDetails(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        if (this.user.getRole().intValue() == 1) {
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        }
        return grantedAuths;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        User otherUser = ((SecureUserDetails) obj).getUser();
        return this.user.getUsername().equals(otherUser.getUsername());
    }

    @Override
    public int hashCode() {
        return this.getUser().getUsername().hashCode();
    }

}
