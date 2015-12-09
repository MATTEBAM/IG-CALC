package uk.gov.dwp.dataaccess.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import uk.gov.dwp.dataaccess.UserRepository;
import uk.gov.dwp.model.User;

/**
 * Implementation class for user database access
 * 
 * @author samba.mitra
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User findUserByUsername(String username) {
        MongoOperations mongoOperations = (MongoOperations) mongoTemplate;
        User user = mongoOperations.findOne(new Query(Criteria.where("username").is(username)), User.class);
        LOGGER.info("User retrieved from db : " + user);
        return user;
    }

}
