package com.biqasoft.auth;

import com.biqasoft.common.exceptions.InvalidStateException;
import com.biqasoft.entity.core.Domain;
import com.biqasoft.entity.core.DomainSettings;
import com.biqasoft.entity.core.useraccount.UserAccount;
import com.biqasoft.microservice.common.MicroserviceDomainSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

/**
 * If we authenticated, we guarantee that in normal situation
 * 1) getUserAccount() != null
 * 2) getDomain() != null
 * (this provided by {@link GatewayAuthenticationProvider#retrieveUser(String, UsernamePasswordAuthenticationToken)})
 *
 * Data per request holder
 *
 * we do not need synchronization on getUserAccount etc because this is context per http request/thread
 */
@Service
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CurrentUserContextProviderImpl implements CurrentUserContextProvider {

    private UserAccount userAccount = null;
    private DomainSettings domainSettings = null;
    private Domain domain = null;
    private final MicroserviceDomainSettings microserviceDomainSettings;

    @Autowired
    public CurrentUserContextProviderImpl(MicroserviceDomainSettings microserviceDomainSettings) {
        this.microserviceDomainSettings = microserviceDomainSettings;
    }

    @Override
    public UserAccount getUserAccount() {
        if (userAccount == null) {
            return null;
        }
        return userAccount;
    }

    @Override
    public DomainSettings getDomainSettings() {
        if (domainSettings == null) {
            domainSettings = microserviceDomainSettings.unsafeFindDomainSettingsById(getDomain().getDomain());
        }

        return domainSettings;
    }

    public Domain getDomain() {
        if (domain == null) {
            throw new InvalidStateException("Null domain");
        }

        return domain;
    }

    @Override
    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    @Override
    public void setDomainSettings(DomainSettings domainSettings) {
        this.domainSettings = domainSettings;
    }

}
