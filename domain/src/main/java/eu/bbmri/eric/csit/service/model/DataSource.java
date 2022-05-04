// Generated by delombok at Wed May 04 16:43:34 CEST 2022
package eu.bbmri.eric.csit.service.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity(name = "DataSource")
@Table(name = "data_source")
public class DataSource extends BaseEntity {

    private enum ApiType {
        MOLGENIS
    }

    private String description;

    @NotNull
    private String name;

    @NotNull
    private String URL;

    @NotNull
    private String apiUrl;

    @NotNull
    private String apiUsername;

    @NotNull
    private String apiPassword;

    @Enumerated(EnumType.STRING)
    @NotNull
    private ApiType apiType;

    private String resourceNetwork;

    private String resourceBiobank;

    private String resourceCollection;

    @NotNull
    private Boolean syncActive;

    private Boolean sourcePrefix;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "DataSource(description=" + this.getDescription() + ", name=" + this.getName() + ", URL=" + this.getURL() + ", apiUrl=" + this.getApiUrl()
                + ", apiUsername=" + this.getApiUsername() + ", apiPassword=" + this.getApiPassword() + ", apiType=" + this.getApiType() + ", resourceNetwork="
                + this.getResourceNetwork() + ", resourceBiobank=" + this.getResourceBiobank() + ", resourceCollection=" + this.getResourceCollection()
                + ", syncActive=" + this.getSyncActive() + ", sourcePrefix=" + this.getSourcePrefix() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public DataSource() {
    }

    @java.lang.SuppressWarnings("all")
    public DataSource(final String description, final String name, final String URL, final String apiUrl, final String apiUsername, final String apiPassword,
            final ApiType apiType, final String resourceNetwork, final String resourceBiobank, final String resourceCollection, final Boolean syncActive,
            final Boolean sourcePrefix) {
        this.description = description;
        this.name = name;
        this.URL = URL;
        this.apiUrl = apiUrl;
        this.apiUsername = apiUsername;
        this.apiPassword = apiPassword;
        this.apiType = apiType;
        this.resourceNetwork = resourceNetwork;
        this.resourceBiobank = resourceBiobank;
        this.resourceCollection = resourceCollection;
        this.syncActive = syncActive;
        this.sourcePrefix = sourcePrefix;
    }

    @java.lang.SuppressWarnings("all")
    public String getDescription() {
        return this.description;
    }

    @java.lang.SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    public String getURL() {
        return this.URL;
    }

    @java.lang.SuppressWarnings("all")
    public String getApiUrl() {
        return this.apiUrl;
    }

    @java.lang.SuppressWarnings("all")
    public String getApiUsername() {
        return this.apiUsername;
    }

    @java.lang.SuppressWarnings("all")
    public String getApiPassword() {
        return this.apiPassword;
    }

    @java.lang.SuppressWarnings("all")
    public ApiType getApiType() {
        return this.apiType;
    }

    @java.lang.SuppressWarnings("all")
    public String getResourceNetwork() {
        return this.resourceNetwork;
    }

    @java.lang.SuppressWarnings("all")
    public String getResourceBiobank() {
        return this.resourceBiobank;
    }

    @java.lang.SuppressWarnings("all")
    public String getResourceCollection() {
        return this.resourceCollection;
    }

    @java.lang.SuppressWarnings("all")
    public Boolean getSyncActive() {
        return this.syncActive;
    }

    @java.lang.SuppressWarnings("all")
    public Boolean getSourcePrefix() {
        return this.sourcePrefix;
    }

    @java.lang.SuppressWarnings("all")
    public void setDescription(final String description) {
        this.description = description;
    }

    @java.lang.SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @java.lang.SuppressWarnings("all")
    public void setURL(final String URL) {
        this.URL = URL;
    }

    @java.lang.SuppressWarnings("all")
    public void setApiUrl(final String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @java.lang.SuppressWarnings("all")
    public void setApiUsername(final String apiUsername) {
        this.apiUsername = apiUsername;
    }

    @java.lang.SuppressWarnings("all")
    public void setApiPassword(final String apiPassword) {
        this.apiPassword = apiPassword;
    }

    @java.lang.SuppressWarnings("all")
    public void setApiType(final ApiType apiType) {
        this.apiType = apiType;
    }

    @java.lang.SuppressWarnings("all")
    public void setResourceNetwork(final String resourceNetwork) {
        this.resourceNetwork = resourceNetwork;
    }

    @java.lang.SuppressWarnings("all")
    public void setResourceBiobank(final String resourceBiobank) {
        this.resourceBiobank = resourceBiobank;
    }

    @java.lang.SuppressWarnings("all")
    public void setResourceCollection(final String resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    @java.lang.SuppressWarnings("all")
    public void setSyncActive(final Boolean syncActive) {
        this.syncActive = syncActive;
    }

    @java.lang.SuppressWarnings("all")
    public void setSourcePrefix(final Boolean sourcePrefix) {
        this.sourcePrefix = sourcePrefix;
    }
}
