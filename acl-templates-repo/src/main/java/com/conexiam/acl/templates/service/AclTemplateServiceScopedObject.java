package com.conexiam.acl.templates.service;

import com.conexiam.acl.templates.exceptions.AclTemplateServiceException;
import org.alfresco.repo.jscript.BaseScopableProcessorExtension;
import org.alfresco.repo.jscript.ScriptNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class AclTemplateServiceScopedObject extends BaseScopableProcessorExtension {

    private static final Logger logger = LoggerFactory.getLogger(AclTemplateServiceScopedObject.class);

    // Dependencies
    private AclTemplateServiceImpl aclTemplateService;

    public void apply(String templateId, ScriptNode scriptNode) throws AclTemplateServiceException {
        aclTemplateService.apply(templateId, scriptNode.getNodeRef());
    }

    public Set<String> getAclTemplates() {
        return aclTemplateService.getAclTemplates();
    }

    public Set<String> getAuthorityResolvers() {
        return aclTemplateService.getAuthorityResolvers();
    }

    public void setAclTemplateService(AclTemplateServiceImpl aclTemplateService) {
        this.aclTemplateService = aclTemplateService;
    }
}
