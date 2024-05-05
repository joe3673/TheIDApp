package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.UserNotFoundException;
import com.Techmotion.appserver.repositiories.OrganizationRepository;
import com.Techmotion.appserver.repositiories.model.OrganizationRecord;
import com.Techmotion.appserver.service.model.Organization;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class OrganizationService {

    private OrganizationRepository organizationRepository;


    public OrganizationService(OrganizationRepository organizationRepository){

        this.organizationRepository = organizationRepository;
    }

    //
    public Organization createOrganization(Organization organization) {
        Objects.requireNonNull(organization, "The Organization can not be null.");

        OrganizationRecord organizationRecord = new OrganizationRecord();
        organizationRecord.setOrganizationId(UUID.randomUUID());
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

        return organization;
    }


    public OrganizationRecord getOrganizationById(UUID organizationID){
        Objects.requireNonNull(organizationID, "Must have an organization ID to find organization. ");
        return organizationRepository.findById(organizationID).orElseThrow(()->new UserNotFoundException("User Wasn't found."));

    }
    public Organization updateOrganization(){

        return null;
    }

    public void deleteOrganizationByID(UUID organizationID){
        Objects.requireNonNull(organizationID, "Must have an organization ID to delete organization. ");
        organizationRepository.deleteById(organizationID);

    }
}
