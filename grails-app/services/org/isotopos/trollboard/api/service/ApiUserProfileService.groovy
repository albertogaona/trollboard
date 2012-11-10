package org.isotopos.trollboard.api.service

import org.isotopos.trollboard.api.UserProfile
import org.isotopos.trollboard.api.Project

class ApiUserProfileService  {
  def gitHubUserProfileService
  def gitHubRepositoryService

  UserProfile getUserProfile(String providerId, String token) {
    if(providerId == 'github') {
      return gitHubUserProfileService.getUserProfile(token)
    }

    return null
  }


  List<Project> getProjects(String providerId, String token) {
    if(providerId == 'github') {
      return gitHubRepositoryService.getProjects(token)
    }

    null
  }
}
