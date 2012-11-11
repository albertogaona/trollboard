package org.isotopos.trollboard.api.service

import org.isotopos.trollboard.api.Project
import org.isotopos.trollboard.api.UserProfile
import org.isotopos.trollboard.api.Issue

class ApiUserProfileService {
  def gitHubUserProfileService
  def gitHubRepositoryService
  def gitHubOrganizationService
  def gitHubIssuesService

  UserProfile getUserProfile(String providerId, String token) {
    if (providerId == 'github') {
      return gitHubUserProfileService.getUserProfile(token)
    }

    return null
  }

  List<Project> getProjects(String providerId, String token) {
    if (providerId == 'github') {
      return gitHubRepositoryService.getProjects(token)
    }

    null
  }

  List<Project> getTeams(String providerId, String token) {
    if (providerId == 'github') {
      return gitHubOrganizationService.getOrganizations(token)
    }

    null
  }



  List<Issue> getIssues(String providerId, String token, String project) {
    if (providerId == 'github') {
      return gitHubIssuesService.getIssues(token, project)
    }

    null
  }

  List<Issue> getIssuesByOrganization(String providerId, String token, String organizationId) {
    if (providerId == 'github') {
      return gitHubIssuesService.getIssuesByOrganization(token, organizationId)
    }

    null
  }
}
