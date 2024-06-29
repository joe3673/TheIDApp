package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.OrganizationNotFoundException;
import com.Techmotion.appserver.exception.UserNotFoundException;
import com.Techmotion.appserver.repositiories.OrganizationRepository;
import com.Techmotion.appserver.repositiories.model.OrganizationRecord;
import com.Techmotion.appserver.service.model.Organization;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.TransactionException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

@Service
public class OrganizationService {

    private OrganizationRepository organizationRepository;
    static final Logger log = LogManager.getLogger();


    public OrganizationService(OrganizationRepository organizationRepository){

        this.organizationRepository = organizationRepository;
    }

    @Transactional
    public Organization createOrganization(Organization organization) {

        try {
            Objects.requireNonNull(organization, "The Organization can not be null.");

            Random random = new Random();
            OrganizationRecord organizationRecord = new OrganizationRecord();
            organizationRecord.setOrganizationId(LocalDateTime.now().getNano() + random.nextLong());
            organizationRecord.setOrganizationCreationDateTime(LocalDateTime.now());
            organizationRecord.setOrganizationName(organization.getOrganizationName());
            organizationRecord.setOrganizationOwnershipName(organization.getOrganizationOwnershipName());
            organizationRecord.setOrganizationLocation(organization.getOrganizationLocation());
            organizationRecord.setOrganizationType(organization.getOrganizationType());
            organizationRecord.setOrganizationType(organization.getOrganizationType());
            organizationRecord.setMembershipStatus(organization.isMembershipStatus());
            organizationRecord.setLanguagePreference(organization.getLanguagePreference());
            organizationRecord.setReceiveNotifications(organization.isReceiveNotifications());
            organizationRecord.setVisibilitySettings(organization.getVisibilitySettings());
            organizationRecord.setSecurityQuestions(organization.getSecurityQuestions());
            organizationRecord.setTwoFactorAuthentication(organization.isTwoFactorAuthentication());
            organizationRecord.setMembershipExpiryDate(organization.getMembershipExpiryDate());

            organizationRepository.save(organizationRecord);
        }
        catch (NullPointerException e) {
            log.error("A null value was encountered: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            log.error("An argument is invalid: " + e.getMessage());
        }
        catch (DataAccessException e) {
            log.error("Database access error: " + e.getMessage());
        }
        catch (TransactionException e) {
            log.error("Transaction error: " + e.getMessage());
        }
        catch (Exception e) {
            log.error("An unexpected error occurred: " + e.getMessage());
        }

        return organization;
    }


    public OrganizationRecord getOrganizationById(Long organizationID){
        Objects.requireNonNull(organizationID, "Must have an organization ID to find organization. ");
        return organizationRepository.findById(organizationID).orElseThrow(()->new UserNotFoundException("User Wasn't found."));

    }

    @Transactional
    public Organization updateOrganizationEvents(Organization organization){


        Objects.requireNonNull(organization, "An organization is required.");
        try {
            OrganizationRecord organizationRecord = convertOrganizationToRecord(organization.getOrganizationId());
            organizationRecord.setUpcomingEvents(organization.getUpcomingEvents());
            organizationRecord.setPastEvents(organization.getPastEvents());
            organizationRepository.save(organizationRecord);
            System.out.println("Events Updated");
        }
        catch(DataAccessException ex){
            throw new OrganizationNotFoundException("Organization Was not found");
        }

        return organization;
    }
    @Transactional
    public Organization updateOrganizationSettings(Organization organization){



        return null;
    }
    @Transactional
    public Organization updateOrganizationProfile() {

        return null;
    }
    @Transactional
    public void deleteOrganizationByID(Long organizationID){
        Objects.requireNonNull(organizationID, "Must have an organization ID to delete organization. ");
        organizationRepository.deleteById(organizationID);

    }

    private OrganizationRecord convertOrganizationToRecord(Long organizationId){
        Optional<OrganizationRecord> record = organizationRepository.findById(organizationId);
        if (record.isPresent()){
            return record.get();
        }
        throw new OrganizationNotFoundException("The organization could not be found.");
    }
}
