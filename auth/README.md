# This is helper module for microservices that need authenticate user

This module:
  - Provide CurrentUser implementation which store http user request in per thread context (CurrentUserContextProviderImpl)
  - make request to auth microservice (GatewayAuthenticationProvider)
