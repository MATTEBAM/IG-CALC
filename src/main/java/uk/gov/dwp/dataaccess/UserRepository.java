package uk.gov.dwp.dataaccess;

import uk.gov.dwp.model.User;

/**
 * User repository for database access
 * 
 * @author samba.mitra
 *
 */
public interface UserRepository {
    User findUserByUsername(String username);
}
